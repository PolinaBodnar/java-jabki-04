import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class MainTest {

    @Test
    public void testSumRange() {
        assertEquals(15, Main.sumRange(1, 5));
    }

    @Test
    public void testAddIntegers() {
        assertEquals(9, Main.add(4, 5));
    }

    @Test
    public void testAddStrings() {
        assertEquals("Домашняя" + "работа_04", Main.add("Домашняя", "работа_04"));
    }

    @Test
    public void testFindMax() {
        int[] arr = {1, 7, 3, 9, 2};
        assertEquals(9, Main.findMax(arr));
    }

    @Test
    public void testFactorial() {
        assertEquals(120, Main.factorial(5));
    }

    @Test
    public void testCalculateAreaCircle() {
        assertEquals(Math.PI * 4 * 4, Main.calculateArea(4), 0.0001);
    }

    @Test
    public void testCalculateAreaRectangle() {
        assertEquals(20, Main.calculateArea(4, 5), 0.0001);
    }

    @Test
    public void testAverage() {
        assertEquals(5.0, Main.average(4, 5, 6), 0.0001);
    }

    @Test
    public void testHypotenuse() {
        assertEquals(5.0, Main.hypotenuse(3, 4), 0.0001);
    }
}
