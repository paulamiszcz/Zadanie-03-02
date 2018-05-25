public class Test {
    public static void main(String[] args) {
        ShapeCalculator sc = new ShapeCalculator();

        Square square = new Square(8);
        double result1 = sc.squareArea(square);

        Rectangle rectangle = new Rectangle(4.5, 9);
        double result2 = sc.rectPerimeter(rectangle);

        Circle circle = new Circle(3.14, 7);
        double result3 = sc.circleArea(circle);

        Triangle triangle = new Triangle(15,8.9,20.8);
        double result4 = sc.trianglePerimeter(triangle);

        System.out.println("Pole kwadratu to " + result1);
        System.out.println("Obwód prostokąta to: " + result2);
        System.out.println("Pole koła to: " + result3);
        System.out.println("Obwód trjójąta to: " + result4);

    }
}
