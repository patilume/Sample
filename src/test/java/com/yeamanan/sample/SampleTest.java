package com.yeamanan.sample;
import static org.junit.jupiter.api.Assertions.*;


/**
 * SampleTest class.
 *
 * @author Yeam Anan (<yeamanan@gmail.com>)
 */
public class SampleTest {

    /**
     * test() test method.
     */
    @Test
    public final void test() {
        Assert.assertEquals("This is ok", Sample.write(), "This is a sample project");
    }
}
