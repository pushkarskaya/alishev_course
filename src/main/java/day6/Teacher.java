package day6;

public class Teacher {
    private String name;
    private String subject;

    public Teacher(String name, String subject) {
        this.name = name;
        this.subject = subject;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public void evaluate(Student student) {
        int ball = (2 + (int) (Math.random() * (6 - 2)));
        String s;
        switch (ball) {
            case 2:
                s = "неудовлетворительно";
                break;
            case 3:
                s = "удовлетворительно";
                break;
            case 4:
                s = "хорошо";
                break;
            default:
                s = "отлично";

        }
        System.out.println("Преподаватель " + name + " оценил студента с именем " + student.getName() + " по предмету " + subject + " на оценку " + s);
    }
}
