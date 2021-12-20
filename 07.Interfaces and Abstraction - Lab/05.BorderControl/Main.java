package BorderControl_05;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        List<Identifiable> identifiableList = new ArrayList<>();
        String input = "";
        while (!"End".equals(input = bufferedReader.readLine())) {
            String[] tokens = input.split("\\s+");

            Identifiable identifiable = null;

            if (tokens.length == 3) {
                String name = tokens[0];
                int age = Integer.parseInt(tokens[1]);
                String id = tokens[2];

                identifiable = new Citizen(name, age, id);
            } else if (tokens.length == 2) {
                String model = tokens[0];
                String id = tokens[1];

                identifiable = new Robot(model, id);
            }
            identifiableList.add(identifiable);
        }

        String lastDigits = bufferedReader.readLine();
        for (Identifiable identifiable : identifiableList) {
            String id = identifiable.getId();

            if (id.endsWith(lastDigits)){
                System.out.println(id);
            }
        }

    }
}
