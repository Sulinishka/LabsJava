import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SwapTest {

    @Test
    void Swap() {
        int[] anArray = new int[]{
                1, 7, 5
        };
        boolean h = new Swap().swap(0, 2, anArray);
        assertTrue(h);
        assertArrayEquals(new int[]{
                5, 7, 1
        }, anArray);
    }
}