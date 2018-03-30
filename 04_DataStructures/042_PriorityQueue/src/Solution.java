import java.util.*;

class Student {
    private final int id;
    private final String name;
    private final double cgpa;

    private Student(int id, String name, double cgpa) {
        this.id = id;
        this.name = name;
        this.cgpa = cgpa;
    }

    static Student createStudent(String event) {
        Scanner sc = new Scanner(event);
        sc.next();
        String name = sc.next();
        double cgpa = sc.nextDouble();
        int id = sc.nextInt();
        return new Student(id, name, cgpa);
    }

    int getId() {
        return id;
    }

    String getName() {
        return name;
    }

    double getCgpa() {
        return cgpa;
    }

}

class Priorities {

    List<Student> getStudents(List<String> events) {
        PriorityQueue<Student> queue = new PriorityQueue<>(events.size(),
                Comparator.comparing(Student::getCgpa).reversed()
                        .thenComparing(Student::getName)
                        .thenComparing(Student::getId));

        for (String event : events) {
            if (event.startsWith("ENTER")) {
                queue.add(Student.createStudent(event));
            } else {
                queue.poll();
            }
        }

        ArrayList<Student> students = new ArrayList<>();
        while (!queue.isEmpty()) {
            students.add(queue.poll());
        }

        return students;

    }
}

//Locked code below
public class Solution {
    private final static Scanner scan = new Scanner(System.in);
    private final static Priorities priorities = new Priorities();

    public static void main(String[] args) {
        int totalEvents = Integer.parseInt(scan.nextLine());
        List<String> events = new ArrayList<>();

        while (totalEvents-- != 0) {
            String event = scan.nextLine();
            events.add(event);
        }

        List<Student> students = priorities.getStudents(events);

        if (students.isEmpty()) {
            System.out.println("EMPTY");
        } else {
            for (Student st : students) {
                System.out.println(st.getName());
            }
        }
    }
}
