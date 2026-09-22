public class Calculator {
    public int add(int a,int b){
        return a+b;
    }

    public double add(double a, double b){
        return a+b;
    }
    public int add(int a, int b,int c){
        return a+b+c;
    }
    public String add(String a,String b){
        return a+b;
    }
    public static void main(String[] args){
        Calculator calc=new Calculator();

        System.out.println("add(int,int):"+calc.add(10,20));
        System.out.println("add(double,double):"+calc.add(12.5,7.5));
        System.out.println("add(int,int,int):"+calc.add(3,5,7));
        System.out.println("add(String,String)"+calc.add("Hello","Muskhan"));

    }
}
