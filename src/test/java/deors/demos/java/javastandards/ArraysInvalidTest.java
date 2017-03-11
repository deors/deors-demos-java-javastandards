package deors.demos.java.javastandards;

import static org.junit.Assert.assertArrayEquals;
import org.junit.Test;

public class ArraysInvalidTest {

    @Test
    public void testArraysInvalid() {
        assertArrayEquals(new int[] {0, 1, 2, 3, 4, 5}, new ArraysInvalid().list1);
    }
}
