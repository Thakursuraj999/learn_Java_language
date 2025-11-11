



public class Main {
    public static void main(String[] args) {
        Employee tim = new Employee("Tim", "11/11/1985",  "01/01/2020");
        System.out.println(tim);
        System.out.println("Age: " + tim.getAge());
        System.out.println("Pay: " + tim.collectPay());
        SalariedEmployee jane = new SalariedEmployee("Jane", "05/05/1990", "02/02/2021", 35000);
        System.out.println(jane);
        System.out.println("Joe's paycheck = $" + jane.collectPay());

        jane.retire();
        System.out.println("Joe's paycheck after retirement = $" + jane.collectPay());
        HourlyEmployee mary = new HourlyEmployee("mary", "03/03/1980", "03/03/2019", 15.00);
        System.out.println("Mary's paycheck = $" + mary.collectPay());
        System.out.println("Mary's Holiday pay = $" + mary.getDoublePay());



    }
}