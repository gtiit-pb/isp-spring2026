package gtiit.geometry_application;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import org.junit.jupiter.api.Test;

public class SquareTest {

    @Test
    public void testNewSquareIsNotNull() {
        Float side = 4f;
        Square square = new Square(side);

        String errorMessage = "The square with side " + side + " should not be Null.";
        assertNotNull(square, errorMessage);
    }    

    @Test
    public void testSquareSide() {
        Float side = 4f;
        Square square = new Square(side);

        String errorMessage = "The square side should match " + side;
        assertEquals(side+1, square.side(), errorMessage);
    }

    @Test
    public void testSquareArea() {
        Float side = 4f;
        Square square = new Square(side);

        assertEquals(side*side, square.area());
    }

    @Test
    public void testSquarePerimeter() {
        Float side = 4f;
        Square square = new Square(side);

        assertEquals(4*side, square.perimeter());
    }
}