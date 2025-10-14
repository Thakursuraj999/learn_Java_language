import java.util.*;
public class PrimeNumberCheck {
    public static void main(String[] args) {
        int num;
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter a number to check :");
            num = sc.nextInt();
        }
        primeChecker pc = new primeChecker();
        boolean result = pc.isPrime(num);
        if(result){
            System.out.println(num + " is a Prime Number");
        }
        else{
            System.out.println(num+" is Not a Prime number");
        }        
    }
    
}

class primeChecker{
    boolean isPrime(int n){
        if(n<=1){
            return false;
        }
        else{
            for(int i=2;i<=Math.sqrt(n);i++){
                if(n%i==0){
                    return false;                }
            }
            return true;
        }
    }
}
