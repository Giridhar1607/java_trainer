interface InShape {
    double calculateArea();

    double calculatePerimeter();

    class Rectangle implements InShape {
        private double length;
        private double width;

        public Rectangle(double lenght, double width){
            this.length=lenght;
            this.width=width;
        }
        @Override
        public double calculateArea(){
            return length*width;
        }
        @Override
        public double calculatePerimeter(){
            return 2*(length+width);
        }
    }

    class Circle implements InShape {
        private double radius;


        public Circle(double radius){
            this.radius=radius;

        }
        @Override
        public double calculateArea(){
            return 3.14* radius*radius;
        }
        @Override
        public double calculatePerimeter(){
            return 2*3.14*radius;
        }
    }

    public static void main(String[] args){
        InShape rect = new Rectangle(5.0,4.0);
        InShape circle = new Circle(3.0);

        System.out.println("Rectangle Area: "+rect.calculateArea());
        System.out.println("Rectangle Premium: "+rect.calculatePerimeter());
        System.out.println("Circle Area: "+circle.calculateArea());
        System.out.println("Circle perimeter: "+circle.calculatePerimeter());
    }
}
