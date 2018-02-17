//NOTE: this code works with Java 7, with Java 8 it will fail on timeout

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

class Solution {
    public static void main(String[] argh) {
        Scanner in = new Scanner(System.in);
        Map<String, Integer> phoneBook = new HashMap<>();

        int n = in.nextInt();
        in.nextLine();

        for (int i = 0; i < n; i++) {
            String name = in.nextLine();
            int phone = in.nextInt();
            phoneBook.put(name, phone);
            in.nextLine();
        }
        while (in.hasNext()) {
            String name = in.nextLine();
            Integer number = phoneBook.get(name);
            if (number == null) {
                System.out.println("Not found");
            } else {
                System.out.println(name + "=" + number);
            }
        }
    }
}
