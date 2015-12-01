package deors.demos.standards.java;

import static org.junit.Assert.assertArrayEquals;
import org.junit.Test;

public class ArraysValidTest {

    @Test
    public void testArraysValid() {
        assertArrayEquals(new int[] {0, 1, 2, 3, 4, 5}, new ArraysValid().list1);
    }
}
