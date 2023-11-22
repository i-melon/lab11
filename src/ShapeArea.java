class ShapeArea {
    private String blogName;

    ShapeArea(String blogName){
        this.blogName = blogName;
    }

    public static void main(String[] args) {
        Shape circle = new Circle(6);
        Shape rectangle = new Rectangle(1, 6);
        Shape triangle = new Triangle(3, 8);
        ShapeArea ns = new ShapeArea("Aidyn");

        System.out.println(circle.findArea());
        System.out.println(rectangle.findArea());
        System.out.println(triangle.findArea());
        System.out.println(ns.blogName);

        Shape circle2 = circle.getShap();
        Shape rectangle2 = rectangle.getShap();
        Shape triangle2 = triangle.getShap();

        System.out.println(circle2.findArea());
        System.out.println(rectangle2.findArea());
        System.out.println(triangle2.findArea());

        System.out.println(circle2.setShape(new Circle(9)).findArea());
        System.out.println(rectangle2.setShape(new Rectangle(9,9)).findArea());
        System.out.println(triangle2.setShape(new Triangle(9,9)).findArea());
    }
}