public class Square extends Rectangle{
    double sideLength;
//    Square(double sideLength){
//        this.sideLength = sideLength;
//    }

    public Square() {
        this.sideLength = sideLength;
    }
    double width1 = super.width;
    double height1 = super.height;

    @Override
    public double getArea(){
        return sideLength * sideLength;
    }
    @Override
    public double getPerimeter() {

        return 4 * sideLength;
    }
}
