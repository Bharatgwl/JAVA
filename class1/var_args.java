public class var_args {
    public static void main(String[] args) {
        System.out.println(sum(1, 20, 3, 4, 5));
    }
   
    public static int sum(int... arr) { // treating variable as an array of integers using ...
        int sum = 0;
        for (int i : arr) {
            sum += i;
        }
        return sum;
    }
}
