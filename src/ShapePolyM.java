import java.util.Scanner;

public class ShapePolyM {
    public double area(){
        return 0.0;
    }
    static class Rectangle extends Shape{
        private double length, width;

        public Rectangle(double length,double width){
            this.length=length;
            this.width=width;
        }
        @Override
        public double area(){
            return length* width;
        }
    }
    static class circle extends Shape{
        private double radius;

        public circle(double radius){
            this.radius=radius;
        }
        @Override
        public double area(){
            return Math.PI*radius*radius;
        }
    }
    static class Triangle extends Shape{
        private double base,height;

        public Triangle(double height,double base){
            this.height=height;
            this.base=base;
        }
        @Override
        public double area(){
            return 0.5*base*height;
        }
    }

    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter Rectangle length and width: ");
        double rLength=sc.nextDouble();
        double rWidth =sc.nextDouble();

        System.out.println("Enter Circle Radius ");
        double cRadius=sc.nextDouble();

        System.out.println("Enter Trangle Base and height: ");
        double tBase=sc.nextDouble();
        double tHeight=sc.nextDouble();

        Shape[] shapes=new Shape[]{
                new Rectangle(rLength,rWidth),
                new circle(cRadius),
                new Triangle(tBase,tHeight),
        };
        for(Shape s: shapes){
            System.out.println("Shape Area:"+s.area());
        }
    }
}
