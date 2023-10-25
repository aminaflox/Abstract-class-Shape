public class Triangle extends Shape{
    double side1, side2, side3;

    @Override
    public double getArea() {
//        double s = getPerimeter() / 2;
        double sides = (side1 + side2 + side3)/2;
        return Math.sqrt(sides * (sides - side1) * (sides - side2) * (sides - side3));
    }

    @Override
    public double getPerimeter() {
        return side1 + side2 + side3;
    }
}
