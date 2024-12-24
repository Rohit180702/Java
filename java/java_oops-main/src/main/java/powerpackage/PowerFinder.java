package powerpackage;

/**
 * Utility class for finding the power of a number.
 */
public class PowerFinder {
    /**
     * Calculates the power of a base raised to an exponent.
     *
     * @param base     the base number
     * @param exponent the exponent
     * @return the result of base^exponent
     */
    public static int of(int base, int exponent) {
        int result = 1;
        for (int i = 0; i < exponent; i++) {
            result *= base;
        }
        return result;
    }
}
