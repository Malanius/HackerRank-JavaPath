//Locked code

import java.util.*;

interface AdvancedArithmetic {
    int divisor_sum(int n);
}

//Unlocked
class MyCalculator implements AdvancedArithmetic {

    @Override
    public int divisor_sum(int n) {
        Set<Integer> divisors = new HashSet<>(); //Set, as we are interested in only one occurrence of each divisor, so we can freely do following:

        divisors.add(1); //All numbers are divisible by 1
        divisors.add(n); //All numbers are divisible by itself

        for (int i = 2; i < n; i++) {
            if (n % i == 0) {
                divisors.add(i);
            }
        }

        return divisors.stream().mapToInt(Integer::intValue).sum();
    }
}

//Locked code
class Solution {
    public static void main(String[] args) {
        MyCalculator my_calculator = new MyCalculator();
        System.out.print("I implemented: ");
        ImplementedInterfaceNames(my_calculator);
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.print(my_calculator.divisor_sum(n) + "\n");
        sc.close();
    }

    /*
     *  ImplementedInterfaceNames method takes an object and prints the name of the interfaces it implemented
     */
    static void ImplementedInterfaceNames(Object o) {
        Class[] theInterfaces = o.getClass().getInterfaces();
        for (int i = 0; i < theInterfaces.length; i++) {
            String interfaceName = theInterfaces[i].getName();
            System.out.println(interfaceName);
        }
    }
}
