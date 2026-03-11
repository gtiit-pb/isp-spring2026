package gtiit.geometry_application;

class Rectangle {
    private Float base;
    private Float height;

    Rectangle(Float base, Float height) {
        this.base = base;
        this.height = height;
    };

    Float base() {
        return this.base;
    }
    
    Float height() {
        return this.height;
    }

    Float area() {
        return this.base * this.height;
    }

    Float perimeter() {
        return 2 * (this.base + this.height);
    }
}
