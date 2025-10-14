import java.util.*;
public class FacttorialLoop {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int n = sc.nextInt();
            Factorial f = new Factorial();
            f.fact(n);
        }
    }
}
class Factorial{
    void fact(int n){
        if(n < 0){
            System.out.print("Invalid imput.");
        }
        else if(n == 0){
            System.out.print("0");
        }
        else{
            int factorial = 1;
            for(int i = 1;i<=n;i++){
                factorial *=i;
            }
            System.out.print(factorial);
        }

    }
}
