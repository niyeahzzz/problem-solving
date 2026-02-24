import java.util.*;

class Student {
    String name;
    int marks;

    Student(String name, int marks) {
        this.name = name;
        this.marks = marks;
    }

    public String getName() {
        return name;
    }

    public int getMarks() {
        return marks;
    }
}

public class TopKStudents {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        List<Student> students = new ArrayList<>();

        for (int i = 0; i < N; i++) {
            String name = sc.next();
            int marks = sc.nextInt();
            students.add(new Student(name, marks));
        }

        int K = sc.nextInt();

        students.stream()
                .sorted(Comparator
                        .comparing(Student::getMarks).reversed()
                        .thenComparing(Student::getName))
                .limit(K)
                .map(Student::getName)
                .forEach(name -> System.out.print(name + " "));
    }
}
