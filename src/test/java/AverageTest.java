import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AverageTest {


    @Test
    void matrixToArray() {
        Average average1 = new Average();
        int[][] twodimension = new int[][]{
                {
                        1, 2
                }, {
                3, 4
        }
        };
        int[] ondim = new int[]{
                1, 2, 3, 4
        };
        assertArrayEquals(ondim, average1.matrixToArray(twodimension));
    }


    @Test
    void arrayAverage1() {
        Average average1 = new Average();
        int[] ondim = new int[]{
                1,2,3
        };
        assertEquals(2,average1.arrayAverage1(ondim));
    }
}