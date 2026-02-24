import java.util.*;

class Student {
    private int id;
    private String fname;
    private double cgpa;

    public Student(int id, String fname, double cgpa) {
        this.id = id;
        this.fname = fname;
        this.cgpa = cgpa;
    }

    public int getId() {
        return id;
    }

    public String getFname() {
        return fname;
    }

    public double getCgpa() {
        return cgpa;
    }
}

public class StudentSorting {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = Integer.parseInt(in.nextLine());

        List<Student> studentList = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            int id = in.nextInt();
            String fname = in.next();
            double cgpa = in.nextDouble();
            studentList.add(new Student(id, fname, cgpa));
        }

        // Sorting using Comparator
        Collections.sort(studentList, Comparator
                .comparing(Student::getCgpa).reversed()
                .thenComparing(Student::getFname)
                .thenComparing(Student::getId));

        // Print only first names
        for (Student st : studentList) {
            System.out.println(st.getFname());
        }

        in.close();
    }
}
