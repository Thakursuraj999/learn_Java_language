import java.util.*;
public class FactorialRecursion {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter a number: ");
            int n = sc.nextInt();
            Fcatorial f = new Fcatorial();
            int result = f.fact(n);
            System.out.println("Factorial of " + n + " is: " + result);
        }  
    }
}

class Fcatorial{
    int fact(int n){
        if(n<=1){
            return 1;
        }
        else{
            return n*fact(n-1);
        }
    }
}