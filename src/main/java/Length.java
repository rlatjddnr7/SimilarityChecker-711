public class Length {
    public int compare(String str1, String str2) {
        int gap = Math.abs(str1.length() - str2.length());
        int gps;
        if(str1.length() > str2.length()) {
            gps = gap * 60 / str2.length();
        } else {
            gps = gap * 60 / str1.length();
        }
        return 60 - gps;
    }
}