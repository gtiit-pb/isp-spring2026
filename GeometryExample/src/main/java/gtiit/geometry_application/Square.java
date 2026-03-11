package gtiit.geometry_application;

public class Square {
    private Float side;

    Square(Float side) {
        this.side = side;
    };

    Float side() {
        return this.side;
    }
    
    Float area() {
        return this.side * this.side;
    }

    Float perimeter() {
        return 4 * this.side;
    }
}

