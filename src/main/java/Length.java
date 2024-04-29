public class Length {
    public int compare(String str1, String str2) {
        int gap = Math.abs(str1.length() - str2.length());
        int gps;
        if(str1.length() > str2.length()) {
            if(str1.length() >= 2*str2.length()) {
                return 0;
            }
            gps = gap * 60 / str2.length();
        } else {
            if(str2.length() >= 2*str1.length()) {
                return 0;
            }
            gps = gap * 60 / str1.length();
        }
        return 60 - gps;
    }
}
