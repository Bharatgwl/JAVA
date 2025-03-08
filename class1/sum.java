

import java.util.*;
@SuppressWarnings("resource")

public class sum {

    public static int getsum(int[] arr, int n) {
        int sum = 0;
        for (int i : arr) {
            sum += i;
        }
        return sum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        int sum = getsum(arr, n);
        System.out.println("sum of the elements is " + sum);

    }
}
