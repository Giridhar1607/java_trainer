abstract class ShapeAbs {
    abstract double area();

    public void display(){
        System.out.println("This is a Shape.");
    }

    static class Circle extends ShapeAbs{
        private double radius;

        public Circle(double radius){
            this.radius=radius;
        }
        @Override
        double area(){
            return 3.14*radius*radius;
        }
    }
    static class Square extends ShapeAbs{
        private double side;
        public Square (double side){
            this.side=side;
        }
        @Override
        double area(){
            return side*side;
        }
    }

    public static void main(String[] args){
        ShapeAbs myCircle =new Circle(5.0);
        ShapeAbs mySquare =new Square(4.0);

        myCircle.display();
        System.out.println("Circle Area: "+myCircle.area());
        System.out.println();

        mySquare.display();
        System.out.println("Square Area: "+mySquare.area());
        
    }
}
