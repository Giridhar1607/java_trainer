public class Shape {
    public double area(){
        return 0.0;
    }
    static class Rectangle extends Shape{
        private double length;
        private double width;

        public Rectangle(double length,double width){
            this.length=length;
            this.width=width;
        }
        @Override
        public double area(){
            return length*width;
        }
    }
    static class Circle extends Shape{
        private double radius;

        public Circle(double radius){
            this.radius=radius;
        }
        @Override
        public double area(){
            return Math.PI*radius*radius;
        }
    }
    public static void main(String[] args){
        Shape[] shapes= new Shape[]{
                new Rectangle(5.0,4.0),
                new Circle(3.0),
                new Rectangle(10.0,2.0),
                new Shape()
        };

        for(Shape shape:shapes){
            System.out.println("Shape Area:%.2f\n"+shape.area());
        }
    }
}
