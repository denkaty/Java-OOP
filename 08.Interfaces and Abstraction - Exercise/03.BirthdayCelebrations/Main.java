package BirthdayCelebrations_03;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        String input = "";
        List<Birthable> birthableList = new ArrayList<>();
        while (!"End".equals(input = bufferedReader.readLine())) {
            String[] tokens = input.split("\\s+");

            String className = tokens[0];
            if (className.equals("Citizen")) {
                String name = tokens[1];
                int age = Integer.parseInt(tokens[2]);
                String id = tokens[3];
                String birthDate = tokens[4];

                Citizen citizen = new Citizen(name, age, id, birthDate);
                birthableList.add(citizen);
            } else if (className.equals("Robot")) {
                String model = tokens[1];
                String id = tokens[2];

                Robot robot = new Robot(model, id);
            } else if (className.equals("Pet")) {
                String name = tokens[1];
                String birthdate = tokens[2];

                Pet pet = new Pet(name, birthdate);
                birthableList.add(pet);
            }
        }

        String year = bufferedReader.readLine();
        for (Birthable birthable : birthableList) {
            if (birthable.getBirthDate().split("/")[2].equals(year)) {
                System.out.println(birthable.getBirthDate());
            }
        }

    }
}