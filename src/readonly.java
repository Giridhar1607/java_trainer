public class readonly {
    private final String empId;
    private String name;
    private double salary;

    public readonly(String empId,String name,double initialSalary){
        this.empId=empId;
        this.name=name;
        setSalary(initialSalary);
    }
    public String getEmpId(){
        return empId;
    }
    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name=name;
    }

    public void setSalary(double salary){
        if(salary<=0){
            System.out.println("Salary must be greater than 0");
            return;
        }
        this.salary=salary;
        System.out.println("Salary Update sucessfuly");
    }



    public static void main(String [] args){
        readonly emp= new readonly("EMP-401","Giridhar",65000.0);
        System.out.println("Employee ID: "+emp.getEmpId());

        emp.setName("Muskhan");
        System.out.println("Updated Name : "+emp.getName());

        emp.setSalary(72000.0);
        emp.setSalary(-5000.0);
    }
}
