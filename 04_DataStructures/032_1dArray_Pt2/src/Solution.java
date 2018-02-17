import java.util.Arrays;
import java.util.Scanner;

public class Solution {
    public static boolean canWin(int leap, int[] game) {
        System.err.printf("%s | leap: %d%n", Arrays.toString(game),leap);
        for (int i = 0; i < game.length; i++) {
            System.err.println("At index: " + i);
            if (((i + leap) >= game.length) || ((i + 1) >= game.length)) {
                System.err.println("Able to move outside, win!");
                return true;
            } else if ((leap > 0) && (game[i + leap] == 0)) {
                i = i + leap;
                System.err.println("Leaped to index " + i);
            } else if (game[i + 1] == 0) {
                System.err.println("Moved to " + (i + 1));
            } else if (((i - 1) > 0) && game[i - 1] == 0) {
                System.err.println("Moved backwards to " + (i - 1));
            } else {
                System.err.println("Unable to move, can't win.");
                return false;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int q = scan.nextInt();
        while (q-- > 0) {
            int n = scan.nextInt();
            int leap = scan.nextInt();

            int sum = 0;

            int[] game = new int[n];
            for (int i = 0; i < n; i++) {
                int num = scan.nextInt();
                sum += num;
                game[i] = num;
            }

            if (sum == 0) {
                System.out.println("YES"); //All zeroes, we can win
            } else {
                //System.out.println((canWin(leap, game)) ? "YES" : "NO");
                System.out.println((isSolvable(leap, game, 0)) ? "YES" : "NO");
            }
        }
        scan.close();
    }

    private static boolean isSolvable(int m, int[] arr, int i) {
        if (i < 0 || arr[i] == 1) return false;
        if ((i == arr.length - 1) || i + m > arr.length - 1) return true;

        arr[i] = 1;
        return isSolvable(m, arr, i + 1) || isSolvable(m, arr, i - 1) || isSolvable(m, arr, i + m);
    }
}
