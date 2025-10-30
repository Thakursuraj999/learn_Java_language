import java.util.Scanner;
public class FeetAndInchToCentimeter {
    public static void main(String[] args) {
        try(Scanner sc = new Scanner(System.in)){
            System.out.println("Enter feet: ");
            int feet = sc.nextInt();
            System.out.println("Enter inch: ");
            int inch = sc.nextInt();
            double centimeter = 0;
            if(inch < 0 || inch > 12 || feet < 0){
                System.out.println("Invalid feet or inch parameters");
            }
            else if(inch > 0 && feet == 0){
            centimeter = inchToCentimeter(inch);
            }
            else{
            centimeter = feetAndInchToCentimeter(feet, inch);
            }
            System.out.println("Centimeter = " + centimeter);
        }   
    }
    public static double inchToCentimeter(int inch){
        double centimeter = inch * 2.54;
        return centimeter;
    }
    public static double feetAndInchToCentimeter(int feet, int inch){

        int totalInch = (feet * 12) + inch;
        double centimeter = totalInch * 2.54;
        return centimeter;
    }
}

