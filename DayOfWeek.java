import java.util.Scanner;
public class DayOfWeek {
    public static void main(String[] args) {
        try(Scanner sc = new Scanner(System.in)){
            System.out.println("Enter the day number: ");
            int day = sc.nextInt();
            String dayString = dayOfWeek(day);
            System.out.println("The "+day+"th day is: "+dayString);
        }
    }
    public static String dayOfWeek(int day){
        return switch(day){
            case 0 -> "Sunday";
            case 1 -> "Monday";
            case 2 -> "Tuesday";
            case 3 -> "Wednesday";
            case 4 -> "Thursday";
            case 5 -> "Friday";
            case 6 -> "Saturday";
            default -> "Invalid Day";
        };
    }
}
