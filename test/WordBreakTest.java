import org.junit.Test;

import java.util.HashSet;
import java.util.Set;

import static org.junit.Assert.*;

/**
 * Created by xcha011 on 11/25/2016.
 */
public class WordBreakTest {
    @Test
    public void wordBreak1() throws Exception {
        Set<String> wordDict = new HashSet<>();
        wordDict.add("a");
        wordDict.add("abc");
        wordDict.add("b");
        wordDict.add("cd");
        String s = "abcd";
        assertEquals(WordBreak.wordBreak(s, wordDict), true);
    }

    @Test
    public void wordBreak2() throws Exception {
        Set<String> wordDict = new HashSet<>();
        wordDict.add("aaaa");
        wordDict.add("aa");
        String s = "aaaaaaa";
        assertEquals(WordBreak.wordBreak(s, wordDict), false);
    }

}