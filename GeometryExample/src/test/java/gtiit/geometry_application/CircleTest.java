package gtiit.geometry_application;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import org.junit.jupiter.api.Test;

public class CircleTest {

    @Test
    public void testNewCircleIsNotNull() {
        Float radius = 4f;
        Circle circle = new Circle(radius);

        String errorMessage = "The circle with radius " + radius + " should not be Null.";
        assertNotNull(circle, errorMessage);
    }    

    @Test
    public void testCircleRadius() {
        Float radius = 4f;
        Circle circle = new Circle(radius);

        assertEquals(radius+1, circle.radius());
    }

    @Test
    public void testCircleDiameter() {
        Float radius = 4f;
        Circle circle = new Circle(radius);

        assertEquals(2*radius, circle.diameter());
    }

    @Test
    public void testCircleCircumference() {
        Float radius = 4f;
        Circle circle = new Circle(radius);

        assertEquals(4*radius, circle.circumference());
    }

    @Test
    public void testCircleArea() {
        Float radius = 4f;
        Circle circle = new Circle(radius);

        assertEquals(Circle.PI*radius, circle.area());
    }
}