import java.util.*;
public class CheckArmstrong {
    public static void main(String[] args) {
        int num;
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter a number to check: ");
            num = sc.nextInt();
        }
        armstrongs am = new armstrongs();
        if(am.isArmstrong(num)){
            System.out.println(num+" is an armstrong number.");
        }else{
            System.out.println(num+" is not an armstrong number.");
        }
    }
}
class armstrongs{
    boolean isArmstrong(int n){
        n = Math.abs(n);
        int onum = n;
        int sum = 0;
        int count = 0;
        int temp = n;
        while(temp>0){
            temp /= 10;
            count++;
        }
        for(int i=0;i<count;i++){
            int digit = n%10;
            sum += Math.pow(digit, count);
            n /= 10;
        }
        return sum == onum;
    }
}
