package day6;

public class Teacher {
    String name;
    String subject;

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

//        number = (int) (Math.random() * (10 - 1)) + 1;

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
            case 5:
                s = "отлично";
                break;
            default:
                throw new IllegalStateException("Unexpected value: " + ball);
        }
        System.out.println("Преподаватель " + name + " оценил студента с именем " + student.name + " по предмету " + subject + " на оценку " + s);
    }
}
