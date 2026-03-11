package gtiit.geometry_application;

class Circle {
    private Float radius;
    final static Float PI = 3.14f;

    Circle(Float radius) {
        this.radius = radius;
    };

    Float radius() {
        return this.radius;
    }

    Float diameter() {
        return 2 * this.radius;
    }

    Float area() {
        return PI * this.radius() * this.radius();
    }

    Float circumference() {
        return PI * this.diameter();
    }
}
