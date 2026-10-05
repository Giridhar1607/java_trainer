package Task1Interface;
public class Main {

    public static void main(String[] args) {


        Rectangle rectangle = new Rectangle(10, 5);
        Circle circle = new Circle(7);

        System.out.println("Rectangle");
        System.out.println("Area      : " + rectangle.calculateArea());
        System.out.println("Perimeter : " + rectangle.calculatePerimeter());

        System.out.println();

        System.out.println("Circle");
        System.out.println("Area      : " + circle.calculateArea());
        System.out.println("Perimeter : " + circle.calculatePerimeter());
    }
}
