package day9.Task1;

public class Task1 {
    public static void main(String[] args) {
        Student student = new Student("Иван", "Группа 1");
        Teacher teacher = new Teacher("Мария Сергеевна", "Информатика");
        System.out.println(student.getGroupName());
        System.out.println(teacher.getSubjectName());
        student.printInfo();
        teacher.printInfo();
    }

}
