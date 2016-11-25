import java.util.Set;

/**
 * Created by xcha011 on 11/25/2016.
 */
public class WordBreak {

    // LeetCode 139
    public static boolean wordBreak(String s, Set<String> wordDict) {
        boolean[] lut = new boolean[s.length() + 1];
        lut[0] = true;
        for(int i = 1; i <= s.length(); i++) {
            for(int j = 0; j < i; j++) {
                if(lut[j] && wordDict.contains(s.substring(j,i))) {
                    lut[i] = true;
                    break;
                }
            }
        }
        return lut[s.length()];
    }

    public static void main(String[] args) {

    }
}
