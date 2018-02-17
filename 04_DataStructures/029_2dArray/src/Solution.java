import java.util.Scanner;

public class Solution {

    private static final int hourglassOffset = 2;

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int arr[][] = new int[6][6];
        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < 6; j++) {
                arr[i][j] = in.nextInt();
            }
        }
        int maxSum = Integer.MIN_VALUE;
        for (int row = 0; row < arr.length - hourglassOffset; row++) {
            for (int col = 0; col < (arr[row].length - hourglassOffset); col++) {
                int currentSum = getHourglassSum(arr, row, col);
                if (currentSum > maxSum) {
                    maxSum = currentSum;
                }
            }
        }
        System.out.println(maxSum);
    }

    private static int getHourglassSum(int[][] array, int startRow, int startCol) {
        //System.err.printf("getHourglassSum(startRow: %d; startCol: %d) - start.%n", startRow, startCol);
        int sum = 0;
        for (int i = startCol; i < (startCol + hourglassOffset + 1); i++) {
            sum += array[startRow][i];
        }
        sum += array[startRow + 1][startCol + 1];
        for (int i = startCol; i < (startCol + hourglassOffset + 1); i++) {
            sum += array[startRow + 2][i];
        }
        return sum;
    }
}
