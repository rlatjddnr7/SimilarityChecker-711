public class Length {
    public int compare(String str1, String str2) {
        if("".equals(str1) || str1 == null ||
                "".equals(str2) || str2 == null) {
            throw new IllegalArgumentException();
        }
        int lStr;
        int sStr;
        lStr = Integer.max(str1.length(), str2.length());
        sStr = Integer.min(str1.length(), str2.length());

        if(lStr >= 2 * sStr) {
            return 0;
        }

        int gap = lStr - sStr;
        int gps = gap * 60 / sStr;
        return 60 - gps;
    }
}
