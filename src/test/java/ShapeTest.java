import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import shape.*;

public class ShapeTest {

    @Test
    public void testTriangleArea() {
        Shape triangle = new Triangle(3, 4);
        assertEquals(6.0, triangle.calculateArea(), 0.001);
    }

    @Test
    public void testRectangleArea() {
        Shape rectangle = new Rectangle(3, 4);
        assertEquals(12.0, rectangle.calculateArea(), 0.001);
    }

    @Test
    public void testSquareArea() {
        Shape square = new Square(4);
        assertEquals(16.0, square.calculateArea(), 0.001);
    }

    @Test
    public void testRhombusArea() {
        Shape rhombus = new Rhombus(5, 6);
        assertEquals(15.0, rhombus.calculateArea(), 0.001);
    }
}
