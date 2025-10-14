public class NthFibonacci{
    public static int fib(int n) {
        if (n <= 1) {  // base case
            return n;
        }
        return fib(n - 1) + fib(n - 2); // recursive calls
    }

    public static void main(String[] args) {
        int n = 10;
        System.out.println("Fibonacci of " + n + " = " + fib(n));
    }
}
