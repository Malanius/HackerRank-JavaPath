import java.util.Arrays;
import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        System.err.println(n);

        int[] a = new int[n];

        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }

        System.err.println(Arrays.toString(a));

        int count = 0;
        for (int j = 0; j < n; j++) {
            int sum = 0;
            for (int k = j; k < n; k++) {
                sum = a[k] + sum;
                if (sum < 0) {
                    count++;
                }
            }
        }

        System.out.println(count);
    }
}
