package solutions.kata6;

import org.challenges.solutions.kata6.Kata6BreakCamelCase;
import org.junit.Assert;
import org.junit.Test;

public class Kata6BreakCamelCaseTest {
    @Test
    public void Tests() {
        Assert.assertEquals("Incorrect", "camel Casing", Kata6BreakCamelCase.solution("camelCasing"));
        Assert.assertEquals("Incorrect", "identifier", Kata6BreakCamelCase.solution("identifier"));
        Assert.assertEquals("Incorrect", "camel Casing Casing", Kata6BreakCamelCase.solution("camelCasingCasing"));
        Assert.assertEquals("Incorrect", "", Kata6BreakCamelCase.solution(""));
    }
}
