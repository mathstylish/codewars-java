package solutions.kata6;

import org.challenges.solutions.kata6.Kata6WhichAreIn;
import org.junit.Assert;
import org.junit.Test;

public class Kata6WhichAreInTest {
    @Test
    public void tests() {
        String[] a = new String[] {"arp", "live", "strong"};
        String[] b = new String[] {"lively", "alive", "harp", "sharp", "armstrong"};
        String[] r = new String[] {"arp", "live", "strong"};
        Assert.assertArrayEquals(r, Kata6WhichAreIn.solution(a, b));
    }
}
