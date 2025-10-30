import java.util.Scanner;
public class SecondsToMinutesAndHours {
    public static void main(String[] args) {
        try(Scanner sc = new Scanner(System.in)){
            System.out.println("Enter minutes: ");
            int minute = sc.nextInt();
            System.out.print("Enter seconds: ");
            int second = sc.nextInt();
            String times= getDurationString(second);
            String time = getDurationString(minute, second);
            if(minute == 0) System.out.println(times);
            else System.out.println(time);
        }
    }
    public static String getDurationString(int second){
        if(second < 0){
            return "Invalid Value";
        }
        int minute = second/60;
        int hour = minute/60;
        int remainingSecond = second%60;
        int remainingMinute = minute%60;
        return hour + "h " + remainingMinute + "m " + remainingSecond + "s";
    }
    public static String getDurationString(int minute, int second){
        if(minute < 0 || second < 0 || second >59){
            return "Invalid Value";
        }
        int hour = minute/60;
        int remainingSecond = second%60;
        int remainingMinute = minute%60;
        return hour + "h " + remainingMinute + "m " + remainingSecond + "s";
        
    }
}
