package deors.demos.standards.java;

/**
 * Class showing valid brace positions according to coding standards.
 *
 * @author jorge.hidalgo
 * @version 1.0
 */
public class BracesValid {

    /**
     * String defined in constructor.
     */
    public String ret;

    /**
     * Limit in loops.
     */
    private static final int LIMIT = 5;

    /**
     * Default constructor.
     */
    public BracesValid() {

        String temp = "";
        temp = method1(temp);
        temp = method2(temp);
        temp = method3(temp);
        temp = method4(temp);

        this.ret = temp;
    }

    /**
     * Method showing if-else constructs.
     *
     * @param retIn some string passed from method to method
     *
     * @return the string after it is transformed
     */
    private String method1(String retIn) {

        String retOut = retIn;
        for (int i = 0; i < LIMIT; i++) {
            if (i == 0) {
                retOut = retOut.concat("0");
            }

            if (i == 1) {
                retOut = retOut.concat("1");
            } else {
                retOut = retOut.concat("a");
            }

            if (i == 2) {
                retOut = retOut.concat("2");
            } else {
                retOut = retOut.concat("b");
            }
        }
        return retOut;
    }

    /**
     * Method showing do-while constructs.
     *
     * @param retIn some string passed from method to method
     *
     * @return the string after it is transformed
     */
    private String method2(String retIn) {

        String retOut = retIn;
        int j = 0;
        do {
            retOut = retOut.concat("d");
        } while (j++ < LIMIT);

        j = 0;
        do {
            retOut = retOut.concat("e");
        } while (j++ < LIMIT);

        j = 0;
        while (j++ < LIMIT) {
            retOut = retOut.concat("f");
        }
        return retOut;
    }

    /**
     * Method showing switch constructs.
     *
     * @param retIn some string passed from method to method
     *
     * @return the string after it is transformed
     */
    private String method3(String retIn) {

        String retOut = retIn;
        switch (retOut.length()) {
            case 1:
                retOut = retOut.concat("s");
                break;
            case 2:
                retOut = retOut.concat("t");
                break;
            default:
                retOut = retOut.concat("u");
        }
        return retOut;
    }

    /**
     * Method showing try-catch-finally constructs.
     *
     * @param retIn some string passed from method to method
     *
     * @return the string after it is transformed
     */
    private String method4(String retIn) {

        String retOut = retIn;
        try {
            retOut = retOut.concat("x");
        } catch (Exception e) {
            e.printStackTrace();
        }

        try {
            retOut = retOut.concat("y");
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            retOut = retOut.concat("z");
        }
        return retOut;
    }
}
