public class AreaCalculator {
    public static int calculateArea(int side) {
        return side * side;
    }

    public static double calculateArea(double length, double width) {
        return length * width;
    }
    public static float calculateArea(float radius){
        return 3.14159f * radius * radius;
    }


    public static void main(String[] args) {
        int sqArea = calculateArea(5);
        double recArea = calculateArea(4.5, 8.0);
        float cirArea = calculateArea(3.0f);

        System.out.println(sqArea);
        System.out.println(recArea);
        System.out.println(cirArea);
    }
}
