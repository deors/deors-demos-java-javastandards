package deors.demos.java.javastandards;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class BracesInvalidTest {

    @Test
    public void testBracesInvalid() {
        assertEquals("0ab1ba2ababddddddeeeeeefffffuxyz", new BracesInvalid().ret);
    }
}
