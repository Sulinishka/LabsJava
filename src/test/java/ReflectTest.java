import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ReflectTest {

    @Test
    void reverseArray() {
        Reflect reflect1 = new Reflect();
        String yarra = "fdsa";

        assertEquals(yarra, reflect1.reverseArray("asdf"));
    }

}