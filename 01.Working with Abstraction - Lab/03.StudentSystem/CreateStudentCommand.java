package StudentSystem_03;

public class CreateStudentCommand {


    public static Student createStudent(String[] args) {
        var name = args[1];
        var age = Integer.parseInt(args[2]);
        var grade = Double.parseDouble(args[3]);

        Student student = new Student(name, age, grade);
        return student;
    }
}
