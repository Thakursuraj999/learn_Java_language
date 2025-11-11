public class Workers {

    private String name;

    private String birthDate;
    
    protected String endDate;

    public Workers(){

    }

    public Workers(String name, String birthDate){
        this.name = name;
        this.birthDate = birthDate;
    }

    public int getAge(){
        return 2025 - Integer.parseInt(birthDate.substring(6));
    }

    public double collectPay(){
        return 0.0;
    }

    public void terminate(String endDate){
        this.endDate = endDate;
    }
    @Override
    public String toString(){
        return "Name: " + name + "\nBirth Date: " + birthDate + "\nEnd Date: " + endDate;
    }

}
