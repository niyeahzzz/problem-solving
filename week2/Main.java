import java.util.*;

class Person {
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    // Static method for filtering
    public static boolean isOlderThan(Person p, int ageLimit) {
        return p.getAge() > ageLimit;
    }
}

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        List<Person> persons = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            String name = sc.next();
            int age = sc.nextInt();
            persons.add(new Person(name, age));
        }

        int ageLimit = sc.nextInt();

        // 1️⃣ Sort alphabetically by name (method reference)
        persons.stream()
                .map(Person::getName)
                .sorted()
                .forEach(name -> System.out.print(name + " "));
        System.out.println();

        // 2️⃣ Filter persons older than ageLimit (static method reference)
        persons.stream()
                .filter(p -> Person.isOlderThan(p, ageLimit))
                .map(Person::getName)
                .forEach(name -> System.out.print(name + " "));
        System.out.println();

        // 3️⃣ Convert all names to uppercase (instance method reference)
        persons.stream()
                .map(Person::getName)
                .map(String::toUpperCase)
                .forEach(name -> System.out.print(name + " "));
    }
}
