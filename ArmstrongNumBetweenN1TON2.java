import java.util.*;
public class ArmstrongNumBetweenN1TON2 {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter first number N1: ");
            int N1 = sc.nextInt();
            System.out.println("Enter the second number N2: ");
            int N2 = sc.nextInt();
            armstrong am = new armstrong();
            // System.out.println("Armstrong numbers between "+N1+" And "+N2+" are: ");
            for(int i = N1;i<=N2;i++){
                if(am.isArmstrong(i)){
                    System.out.print(i+" ");
                }
            }
        }
    }
}
class armstrong{
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