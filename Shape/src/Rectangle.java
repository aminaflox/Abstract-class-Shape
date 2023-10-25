public class Rectangle extends Shape{
    double width;
    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    double height;
    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }


    @Override
    public double getArea() {
        return height * width;
    }

    @Override
    public double getPerimeter() {
        return 2 * (width + height);
    }
}
