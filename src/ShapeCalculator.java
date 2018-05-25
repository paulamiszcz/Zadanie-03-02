class ShapeCalculator {
    double squareArea(Square square) {
        return square.a * square.a;
    }

    double circleArea(Circle circle) {
        return circle.pi * (circle.r * circle.r);
    }

    double trianglePerimeter(Triangle triangle) {
        return triangle.a + triangle.b + triangle.c;
    }

    double rectPerimeter(Rectangle rectangle) {
        return rectangle.a + rectangle.b + rectangle.a + rectangle.b;
    }
}
