
import java.util.Scanner;
public class MinMaxChallange {
    public static void main (String[] args){
        double min = 0;
        double max = 0;
        int loopcounter = 0;
        try (Scanner scanner = new Scanner(System.in)) {
            while(true){
                System.out.println("Enter number: ");
                String input = scanner.nextLine();
                try {
                    double number = Double.parseDouble(input);
                    System.out.println("You entered: " + number);
                    if (loopcounter == 0) {
                        min = max = number;
                    } 
                    else if(number > max){
                        max = number;
                    }else if( number < min){
                        min = number;
                    }
                    loopcounter++;
                    
                } catch (NumberFormatException e) {
                    System.out.println("Invalid input.");
                    break;
                }
                System.out.println("Current Min: " + min+ " and Max: " + max);
            }
        }  
    }
}
