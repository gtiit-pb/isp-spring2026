package gtiit.geometry_application;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import org.junit.jupiter.api.Test;

public class RectangleTest {

    @Test
    public void testNewRectangleIsNotNull() {
        Float base = 4f;
        Float height = 5f;
        Rectangle rectangle = new Rectangle(base, height);

        assertNotNull(rectangle);
    }    

    @Test
    public void testRectangleSides() {
        Float base = 4f;
        Float height = 5f;
        Rectangle rectangle = new Rectangle(base, height);

        assertEquals(base+1, rectangle.base());
        assertEquals(height, rectangle.height());
    }

    @Test
    public void testRectangleArea() {
        Float base = 4f;
        Float height = 5f;
        Rectangle rectangle = new Rectangle(base, height);

        assertEquals(base*height, rectangle.area());
    }

    @Test
    public void testRectanglePerimeter() {
        Float base = 4f;
        Float height = 5f;
        Rectangle rectangle = new Rectangle(base, height);

        assertEquals(2*base*height, rectangle.perimeter());
    }

    @Test
    public void testSquareRectangleValuesMatchSquareValues() {
        Float side = 4f;
        Rectangle Rectangle = new Rectangle(side, side);
        Square square = new Square(side);

        assertEquals(Rectangle.base(), square.side());
        assertEquals(Rectangle.height(), square.side());
        assertEquals(Rectangle.perimeter(), square.perimeter());
        assertEquals(Rectangle.area(), square.area());
    }
}