import java.util.*;
public class PrimeNumberBetween1ToN {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter the value of n :");
            int n = sc.nextInt();
            primeCheckers pc = new primeCheckers();
            for(int i=1;i<=n;i++){
                if(pc.isPrime(i)){
                    System.out.print(i+" ");
                }
            }
        }
    }
}
class primeCheckers{
    boolean isPrime(int n){
        if(n<=1){
            return false;
        }
        else{
            for(int i=2;i<=Math.sqrt(n);i++){
                if(n%i==0){
                    return false;           
                }
            }
            return true;
        }
    }
}
