import org.junit.Before;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

/**
 * This is an abstract class that redirects output to the console so that we can test
 * against it.
 */
public abstract class OutputTest {
    // create a new output stream that we'll use instead of stdout.
    protected final ByteArrayOutputStream outputStream = new ByteArrayOutputStream();

    @Before
    /**
     * Configure system.out to use our custom outputStream
     */
    public void setup(){
        System.setOut(new PrintStream(outputStream));
    }
}
