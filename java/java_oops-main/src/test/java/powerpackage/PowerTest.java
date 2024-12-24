package powerpackage;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

class PowerTest {
    @Test
    void oneRaisedToOneIsOne() {
        assertEquals(1, PowerFinder.of(1, 1));
    }

    @Test
    void twoRaisedToOneIsTwo() {
        assertEquals(2, PowerFinder.of(2, 1));
    }

    @Test
    void twoRaisedToTwoIsFour() {
        assertEquals(4, PowerFinder.of(2, 2));
    }

    @Test
    void threeRaisedToTwoIsNine() {
        assertEquals(9, PowerFinder.of(3, 2)); // 3 * 3
    }
}
