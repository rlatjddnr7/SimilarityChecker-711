public class Length {
    public int compare(String str1, String str2) {
        if("".equals(str1) || str1 == null ||
                "".equals(str2) || str2 == null) {
            throw new IllegalArgumentException();
        }
        int lStr;
        int sStr;
        if(str1.length() > str2.length()) {
            lStr = str1.length();
            sStr = str2.length();
        } else {
            lStr = str2.length();
            sStr = str1.length();
        }

        if(lStr >= 2 * sStr) {
            return 0;
        }

        int gap = lStr - sStr;
        int gps = gap * 60 / sStr;
        return 60 - gps;
    }
}
