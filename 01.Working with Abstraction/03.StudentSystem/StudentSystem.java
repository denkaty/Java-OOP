package StudentSystem_03;

import java.util.HashMap;
import java.util.Map;

public class StudentSystem {
    private Map<String, Student> studentMap;

    public StudentSystem() {
        this.studentMap = new HashMap<>();
    }

    public Map<String, Student> getStudentMap() {
        return this.studentMap;
    }

    public String parseCommand(String[] args) {
        String result = null;

        if (args[0].equals("Create")) {
            Student student = CreateStudentCommand.createStudent(args);
            this.studentMap.putIfAbsent(student.getName(), student);
        } else if (args[0].equals("Show")) {
            ShowStudentCommand showStudentCommand = new ShowStudentCommand(this.studentMap.get(args[1]));
            result = showStudentCommand.execute();
        } else {
            result = new ExitCommand().execute();
        }

        return result;


    }
}
