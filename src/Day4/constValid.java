package Day4;

class Employee{
    String empId;
    String name;
    double salary;

    public Employee(String empId,String name,double salary){
        boolean isValidId =empId != null && empId.startsWith("EMP");
        boolean isValidSalary =salary>0;

        if(isValidId && isValidSalary){
            this.empId=empId;
            this.name=name;
            this.salary=salary;
        }else{
            System.out.println("Validation Error! default value for entry: "+name);
            this.empId="EMP000";
            this.name="Invalid";
            this.salary=0.0;
        }
    }
    public Employee(){
        this("EMP000","Default",1.0);
    }
    public void display(){
        System.out.println("ID: "+empId+", Name: "+name+" , Salary: "+salary);
    }
}

public class constValid {
    public static void main(String[] args){
        Employee e1=new Employee("EMP001","RAVI",8000.0);
        e1.display();
        Employee e2= new Employee("ABC001","suresh",40000.0);
        e2.display();
        Employee e3 =new Employee("Emp102","Ramesh",-100.0);
        e3.display();
        Employee e4= new Employee();
        e4.display();

    }
}