import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collections;

public class Solution {

    public static void main(String[] args) throws ClassNotFoundException {
        Class student = Class.forName("Student");
        Method[] methods = student.getDeclaredMethods();

        ArrayList<String> methodList = new ArrayList<>();
        for (Method method : methods) {
            methodList.add(method.getName());
        }

        Collections.sort(methodList);
        for (String name : methodList) {
            System.out.println(name);
        }
    }

}
