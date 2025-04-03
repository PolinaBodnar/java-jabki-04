import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class MainTest {
    @Test
    void printHello() {
        Main.printHello("Hello");
    }

    @Test
    void hello() {
        String name = "Котик";
        assertEquals("Hello " + name, Main.hello(name));  // Исправлено: используем assertEquals вместо Assertions
    }

    @Test
    void multiply() {
        double d = 2, f = 3;
        assertEquals(d * f, Main.multiply(d, f));  // Исправлено: используем assertEquals вместо Assertions
    }

    void MainTest() {
        int a = 2, b = 3;
        assertEquals(a * b, Main.multiply(a, b));  // Исправлено: используем assertEquals вместо Assertions
    }

    @Test
    void factorial() {
        assertEquals(6, Main.factorial(3)); // 3! = 6
    }
}
