class Circle extends Shape {
    private double r;

    public Circle(double radius) {
        this.r = radius;
    }

    @Override
    double findArea() {
        return Math.PI * r * r;
    }

    @Override
    Shape getShap() {
        return new Circle(4);
    }

}