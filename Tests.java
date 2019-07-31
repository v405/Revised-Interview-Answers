import org.junit.Test;
import org.junit.Assert;


public class Tests {

    @Test
    public void camelCaseTest1() {
        String input = "We are the world";

        String expected = "We Are The World";
        String actual = main.camelCase(input);

        Assert.assertEquals(expected,actual);
    }

    @Test
    public void camelCaseTest2() {
        String input = "this is my unit test";

        String expected = "This Is My Unit Test";
        String actual = main.camelCase(input);

        Assert.assertEquals(expected,actual);
    }

    @Test
    public void commonSuffixTest1() {
        String input = "Defend,offend";

        String expected = "fend";
        String actual = main.commonSuffix(input);

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void commonSuffixTest2() {
        String input = "Believe,achieve";

        String expected = "ieve";
        String actual = main.commonSuffix(input);

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void commonSuffixTest3() {
        String input = "There,should";

        String expected = "";
        String actual = main.commonSuffix(input);

        Assert.assertEquals(expected, actual);
    }


    @Test
    public void duplicatesTest1() {
        String input = "5;01230";

        int expected = 0;
        int actual = main.duplicates(input);

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void duplicatesTest2() {
        String input = "7;0344251";

        int expected = 4;
        int actual = main.duplicates(input);

        Assert.assertEquals(expected, actual);
    }


}
