package ValidationData_03;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(bufferedReader.readLine());
        List<Person> personList = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            String[] tokens = bufferedReader.readLine().split("\\s+");

            try {
                ValidationData_03.Person person = new ValidationData_03.Person(tokens[0], tokens[1], Integer.parseInt(tokens[2]), Double.parseDouble(tokens[3]));
                personList.add(person);
            }
            catch (IllegalStateException exception){
                System.out.println(exception.getMessage());
            }
        }
        double bonus = Double.parseDouble(bufferedReader.readLine());
        for (ValidationData_03.Person person : personList) {
            person.increaseSalary(bonus);
            System.out.println(person.toString());
        }

    }
}

