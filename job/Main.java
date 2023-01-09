package job;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        System.out.println("_-#-_-#-_-#-_-#-_-#-_-#-_-#-_-#-_-#-_-#-_-#-_-#-_-#-_-#-_-#-_");

        List<Student> listStudents = new ArrayList<>();
        listStudents.add(new Student("Сидашов", LocalDate.of(2002, 10, 19), 4.9f));
        listStudents.add(new Student("Романов", LocalDate.of(2001, 12, 12), 5.0f));
        listStudents.add(new Student("Кулешов", LocalDate.of(1999, 1, 13), 3.1f));
        listStudents.add(new Student("Командиров", LocalDate.of(2002, 10, 19), 4.9f));
        listStudents.add(new Student("Карагичев", LocalDate.of(2001, 12, 12), 5.0f));
        listStudents.add(new Student("Симонов", LocalDate.of(1999, 1, 13), 3.1f));
        listStudents.add(new Student("Алдашев", LocalDate.of(1992, 3, 8), 3.2f));
        listStudents.add(new Student("Григорьев", LocalDate.of(1996, 2, 23), 3.3f));
        listStudents.add(new Student("Яковлев", LocalDate.of(1984, 8, 30), 3.0f));
        listStudents.add(new Student("Викторианов", LocalDate.of(2000, 9, 9), 4.0f));

        StudentGroup studentGroup = new StudentGroup(listStudents);
        for (Student student : studentGroup) {
            System.out.println(student);
        }
        System.out.println("_-#-_-#-_-#-_-#-_-#-_-#-_-#-_-#-_-#-_-#-_-#-_-#-_-#-_-#-_-#-_");

    }
}
