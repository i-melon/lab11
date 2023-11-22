class Rectangle extends Shape {
    private double l;
    private double w;

    public Rectangle(double length, double width) {
        this.l= length;
        this.w = width;
    }

    @Override
    double findArea() {
        return l * w;
    }

    @Override
    Shape getShap() {
        return new Rectangle(4, 6);
    }
}