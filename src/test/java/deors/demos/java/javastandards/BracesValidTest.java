package deors.demos.java.javastandards;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class BracesValidTest {

    @Test
    public void testBracesValid() {
        assertEquals("0ab1ba2ababddddddeeeeeefffffuxyz", new BracesValid().ret);
    }
}
