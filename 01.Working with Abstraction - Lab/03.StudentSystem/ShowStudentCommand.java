package StudentSystem_03;

public class ShowStudentCommand {
    private Student student;


    public ShowStudentCommand(Student student) {
        this.student = student;
    }

    public String execute(){
       if (student!=null){
           return this.student.toString();
       }
       return null;
    }
}
