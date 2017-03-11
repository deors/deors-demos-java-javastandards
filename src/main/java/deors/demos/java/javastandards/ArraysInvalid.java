package deors.demos.java.javastandards;

/**
 * Class showing invalid array declarations according to coding standards.
 *
 * @author jorge.hidalgo
 * @version 1.0
 */
public class ArraysInvalid {

    /**
     * An invalid one-line array declaration - brackets position.
     */
    int list1[] = {0, 1, 2, 3, 4, 5};

    /**
     * An invalid one-line array declaration - extra whitespaces.
     */
    int[] list2 = { 0, 1, 2, 3, 4, 5 };

    /**
     * An invalid multi-line array declaration - brackets position.
     */
    int[] list3 = {
        0, 1, 2, 3, 4, 5
        };

    /**
     * An invalid multi-line array declaration - brackets position.
     */
    int[] list4 = {
        0, 1, 2, 3, 4, 5};
}
