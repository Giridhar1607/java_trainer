import java.util.*;
public class Employebase {
    protected String name;
    protected int id;

    public Employebase(String name, int id){
        this.name=name;
        this.id=id;
    }

    public double calculatepay() {
        return id;
    }

    public String getName(){
        return name;
    }

    static class SalariedEmployee extends Employebase{
        private double monthlySalary;

        public SalariedEmployee(String name,int id,double monthlySalary){
            super(name,id);
            this.monthlySalary=monthlySalary;
        }

        public double calculatepay(){
            return monthlySalary;
        }
    }

    static class HourlyEmployee extends Employebase{
        private double hoursWorked;
        private double hourlyRate;

        public HourlyEmployee(String name,int id,double hoursWorked, double hourlyRate){
            super(name,id);
            this.hoursWorked=hoursWorked;
            this.hourlyRate=hourlyRate;
        }
        public double calculatepay(){
            if(hoursWorked<=40){
                return  hoursWorked*hourlyRate;
            }else{
                return (40 * hourlyRate)+((hoursWorked-40)*hourlyRate*1.5);
            }
        }
    }

    static class CommissionEmployee extends Employebase{
        private double sales;
        private double commissionRate;

        public CommissionEmployee(String name,int id,double sales, double commissionRate){
            super(name,id);
            this.sales=sales;
            this.commissionRate=commissionRate;
        }

        public double calculatepay(){
            return sales * commissionRate;
        }
    }


    public static void  processPayroll(Employebase[] staff) {
        double totalPayout = 0;
        System.out.println(" PAYROLL SUMMARY");
        for(Employebase emp:staff){
            double pay=emp.calculatepay();
            totalPayout+=pay;
            System.out.println("ID: "+emp.id+", name: "+emp.getName()+", Pay: "+pay);
        }
        System.out.println();
        System.out.println("Total payroll Cost"+totalPayout);
    }

    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number of employees to add:");
        int count=sc.nextInt();
        Employebase[] staff=new Employebase[count];
        for(int i=0;i<count;i++){
            System.out.println("Chose type of employee");
            System.out.println("1. Salaried");
            System.out.println("2.Hourly");
            System.out.println("3.Commission");
            System.out.print("Selection: ");

            int type=sc.nextInt();
            System.out.println("Enter Id");
            int id=sc.nextInt();
            System.out.println("Enter Name");
            String name=sc.next();

            switch(type){
                case 1:
                    System.out.print("Every Month Salary");
                    double salary=sc.nextDouble();
                    staff[i]=new SalariedEmployee(name, id, salary);
                    break;
                case 2:
                    System.out.print("Enter Hours Worked and Hourly Rate:");
                    double hours=sc.nextDouble();
                    double rate=sc.nextDouble();
                    staff[i]= new HourlyEmployee(name, id, hours, rate);
                    break;
                case 3:
                    System.out.println("Enter Sales amount and Commission Rate");
                    double sales =sc.nextDouble();
                    double commRate=sc.nextDouble();
                    staff[i]=new CommissionEmployee(name,id,sales,commRate);
                    break;
                default:
                    System.out.println("Invalid type,setting default salaried");
                    staff[i]=new SalariedEmployee(name,id,0);
                    break;
            }
        }
        processPayroll(staff);
    }

}
