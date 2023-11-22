
class Triangle extends Shape {
    private double base;
    private double height;

    public Triangle(double base, double height) {
        this.base = base;
        this.height = height;
    }

    @Override
    double findArea() {
        return 0.5 * base * height;
    }

    @Override
    Shape getShap() {
        return new Triangle(5, 5);
    }
}