import com.yeamanan.sample;
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
        assertEquals("This is ok", Sample.write(), "This is a sample project");
    }
}
