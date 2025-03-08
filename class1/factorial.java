
import java.util.*;

@SuppressWarnings("resource")

public class factorial {

    public static long  factorialrec(long n) {
        if (n <= 1) {
            return 1;
        }
        return n * factorialrec(n - 1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long  fact = 1;
        for (int i = 1; i <= n; i++) {
            fact = fact * i;
        }
        System.out.println("factorial using iterative method = " + fact);

        System.out.println("factorial using recursive method = " + factorialrec(n));
    }
}
