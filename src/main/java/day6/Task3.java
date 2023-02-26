package day6;

public class Task3 {
    public static void main(String[] args) {
        Teacher teacher = new Teacher("Иван Иванович", "программирование");
        Student student = new Student("Татьяна");
        teacher.evaluate(student);
    }
}
