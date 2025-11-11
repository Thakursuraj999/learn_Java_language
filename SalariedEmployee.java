

public class SalariedEmployee extends Employee{
    private double annualSalary;
    private boolean isRetired;
    public SalariedEmployee(String name, String birthDate, String hireDate, double annualSalary){
        super(name, birthDate, hireDate);
        this.annualSalary = annualSalary;
        this.isRetired = false;
    }
    @Override
    public double collectPay(){
        double paycheck = annualSalary / 26;
        double adjustedPay = (isRetired) ? paycheck * 0.9 : paycheck;
        return (int)adjustedPay;
    }
    public void retire(){
        terminate("12/12/2025");
        isRetired = true;

    }
}
