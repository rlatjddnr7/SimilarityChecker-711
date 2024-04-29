import java.util.HashSet;

public class Alpha {

    public static final int FORTY = 40;

    public int compare(String str1, String str2)
    {
        HashSet<Character> hashSet0 = new HashSet<>();
        HashSet<Character> hashSet1 = new HashSet<>();
        HashSet<Character> hashSet2 = new HashSet<>();
        int sameCnt = 0;
        int totalCnt = 0;

        countTotal(str1, hashSet0);
        countTotal(str2, hashSet0);
        totalCnt = hashSet0.size();

        for (int i = 0; i < str1.length(); i++) {
            char c1 = str1.charAt(i);
            if (!hashSet1.contains(c1)) {
                hashSet1.add(c1);
                for (int j = 0; j < str2.length(); j++) {
                    char c2 = str2.charAt(j);
                    if (!hashSet2.contains(c2)) {
                        if (c1 == c2) {
                            sameCnt++;
                            hashSet2.add(c2);
                        }
                    }
                }
            }

        }

        return sameCnt * FORTY / totalCnt;
    }

    private void countTotal(String str1, HashSet<Character> hashSet0) {
        for (int i = 0; i < str1.length(); i++) {
            char c1 = str1.charAt(i);
            if(!hashSet0.contains(c1)) {
                hashSet0.add(c1);
            }
        }
    }
}
