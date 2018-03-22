import java.util.BitSet;
import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int operations = sc.nextInt();

        BitSet b1 = new BitSet(size);
        BitSet b2 = new BitSet(size);

        for (int i = 0; i < operations; i++) {
            String operation = sc.next();
            int set = sc.nextInt();
            int setOrIndex = sc.nextInt();

            switch (operation) {
                case "AND":
                    if (set == 1) {
                        b1.and(b2);
                    } else {
                        b2.and(b1);
                    }
                    break;
                case "OR":
                    if (set == 1) {
                        b1.or(b2);
                    } else {
                        b2.or(b1);
                    }
                    break;
                case "XOR":
                    if (set == 1) {
                        b1.xor(b2);
                    } else {
                        b2.xor(b1);
                    }
                    break;
                case "FLIP":
                    if (set == 1) {
                        b1.flip(setOrIndex);
                    }
                    else {
                        b2.flip(setOrIndex);
                    }
                    break;
                case "SET":
                    if (set == 1) {
                        b1.set(setOrIndex);
                    }else {
                        b2.set(setOrIndex);
                    }
                    break;
                default:
                    System.err.println("Should not even be there!");
                    return;
            }

            System.out.println(b1.cardinality() + " " + b2.cardinality());
        }

    }
}
