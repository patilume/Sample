package com.yeamanan.sample;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

/**
     * Holds an instance of the class we are testing.
     */
    private Sample smpl;

    /**
     * JUnit set up method.
     */
/*
    @Before
    public final void setUp() {
        smpl = new Sample();
    }
*/


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
        assertEquals("This is ok", smpl.write(), "This is a sample project");
        //assertEquals(new Sample.write(), "This is a sample project");
    }
}
