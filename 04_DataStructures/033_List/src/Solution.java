import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Integer> list = new ArrayList<>();

        int listSize = sc.nextInt();
        sc.nextLine();
        //System.err.println("List size: " + listSize);

        for (int i = 0; i < listSize; i++) {
            int element = sc.nextInt();
            list.add(element);
        }
        //System.err.println(list.toString());
        sc.nextLine();

        int queries = sc.nextInt();
        sc.nextLine();

        for (int q = 0; q < queries; q++) {
            String action = sc.nextLine();
            if (action.equals("Insert")) {
                int index = sc.nextInt();
                int element = sc.nextInt();
                //System.err.printf("Inserting %d at index %d.%n", element, index);
                list.add(index, element);
            } else if (action.equals("Delete")) {
                int index = sc.nextInt();
                //System.err.printf("Deleting element at index %d.%n", index);
                list.remove(index);
            }
            if (q < queries - 1) {
                sc.nextLine();
            }
        }

        StringBuilder answer = new StringBuilder();
        for (Integer i : list) {
           answer.append(i).append(" ");
        }

        System.out.println(answer.toString().trim());
    }

}

