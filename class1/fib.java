

import java.util.*;
@SuppressWarnings("resource")

public class fib {

    public static int fibonacci(int n) {
        if (n <= 1) {
            return n;
        }
        return fibonacci(n - 1) + fibonacci(n - 2);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int prev = 0;
        int curr = 1;
        for (int i = 1; i < n; i++) {
            int temp = prev;
            prev = curr;
            curr = temp + curr;
        }
        System.out.println(curr);
        System.out.println(fibonacci(n));
    }
}

