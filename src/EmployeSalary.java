import java.util.Scanner;

public class EmployeSalary {
    public String name;
    public double baseSalary;

    public EmployeSalary(String name, double baseSalary){
        this.name=name;
        this.baseSalary=baseSalary;
    }
    public double calculateSalary(){
        return baseSalary;
    }
    static class Manager extends EmployeSalary {
        public Manager(String name, double baseSalary){
            super(name,baseSalary);
        }
        @Override
        public double calculateSalary(){
            return super.calculateSalary()*1.20;
        }
    }
    static class developer extends EmployeSalary {
        public developer(String name,double baseSalary){
            super(name,baseSalary);
        }
        @Override
        public double calculateSalary(){
            return (super.calculateSalary()*1.10)+5000;
        }
    }

        public static void main(String[] args){
            Scanner sc=new Scanner(System.in);
            System.out.print("Enter employee Name and base salary");
            EmployeSalary emp= new EmployeSalary(sc.next(),sc.nextDouble());
            Manager mgr= new Manager(sc.next(),sc.nextDouble());
            developer dev= new developer(sc.next(),sc.nextDouble());

            System.out.println(emp.name+"Salary: "+emp.calculateSalary());
            System.out.println(mgr.name+"Salary: "+mgr.calculateSalary());
            System.out.println(dev.name+"Salart: "+dev.calculateSalary());

        }
}

