import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        boolean exit = false;
        while (!exit){
           System.out.println("\nPlease choose a shape type, tap: \n1 for Rectangle \n2 for Circle \n3 for Triangle \n4 for Square \n5 for Exit");
           int userChoice = sc.nextInt();
           switch (userChoice){
               case 1:
                   System.out.println("Provide values for rectangle:");
                   Rectangle rectangle = new Rectangle();
                   System.out.print("Width: ");
                   rectangle.width = sc.nextDouble();
                   System.out.print("Height: ");
                   rectangle.height = sc.nextDouble();
                   System.out.println("Area of rectangle is: " + rectangle.getArea() + "\nPerimeter of rectangle is: "+ rectangle.getPerimeter());
                   break;
               case 2:
                   System.out.println("Provide values for circle:");
                   Circle circle = new Circle();
                   System.out.print("Radius: ");
                   circle.radius = sc.nextDouble();
                   System.out.println("Area of circle is: " + circle.getArea() + "\nPerimeter of circle is: " + circle.getPerimeter());
                   break;
               case 3:
                   System.out.println("Provide values for triangle:");
                   Triangle triangle = new Triangle();
                   System.out.print("1st side: ");
                   triangle.side1 = sc.nextDouble();
                   System.out.print("2nd side: ");
                   triangle.side2 = sc.nextDouble();
                   System.out.print("3rd side: ");
                   triangle.side3 = sc.nextDouble();
                   System.out.println("Area is " + triangle.getArea() + "\nPerimeter is " + triangle.getPerimeter());
                   break;
               case 4:
                   System.out.println("Provide values for square:");
                   Square square = new Square();
                   System.out.print("Side length: ");
                   square.sideLength = sc.nextDouble();
                   System.out.println("Area is " + square.getArea() + "\nPerimeter is " + square.getPerimeter());
                   break;
               case 5:
                   exit = true;
                   break;
           }
        }
    }
}