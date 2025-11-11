public class Employee extends Workers{
    private long employwwId;
    private String hireDate;
    private static int employeeNumber = 1;

    public Employee(){

    }
    public Employee(String name, String birthDate, String hireDate){
        super(name, birthDate);
        this.employwwId = Employee.employeeNumber++;
        this.hireDate = hireDate;
    }
    @Override
    public String toString(){
        return super.toString() + "\nEmployee ID: " + employwwId + "\nHire Date: " + hireDate;
    }
}
