package com.yeamanan.sample;
import org.junit.Assert;
import static org.junit.Assert.assertEquals;
import org.junit.Test;


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
        assertEquals("This is ok", SampleTest.write(), "This is a sample project");
    }
}
