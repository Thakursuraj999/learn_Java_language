import java.util.*;
public class FibonacciFenerator{
    @SuppressWarnings("ConvertToTryWithResources")
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of Fibonacci terms to generate: ");
        int n = sc.nextInt();
        Fibonacci fibo = new Fibonacci();
        fibo.generator(n);
        sc.close();
    }
}
class Fibonacci{
    int a = 0, b = 1, c;
    void generator(int n){
        System.out.print(a +" "+b+" ");
        for(int i=2;i<n;i++){
            c = a+b;
            System.out.print(c+" ");
            a = b;
            b = c;
        }
    }
}