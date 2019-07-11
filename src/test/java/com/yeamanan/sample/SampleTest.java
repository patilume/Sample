package com.yeamanan.sample;
import org.junit.Test;
import static org.junit.Assert.assertEquals;


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
        assertEquals("This is ok", new Sample.write(), "This is a sample project");
    }
}
