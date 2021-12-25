package FoodShortage_04;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedHashMap;
import java.util.Map;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(bufferedReader.readLine());
        Map<String, Buyer> buyerMap = new LinkedHashMap<>();
        for (int i = 0; i < n; i++) {
            String[] tokens = bufferedReader.readLine().split("\\s+");

            Buyer buyer= null;

            String name = tokens[0];
            int age = Integer.parseInt(tokens[1]);

            if (tokens.length == 4) {
                String id = tokens[2];
                String birthDate = tokens[3];

                buyer = new Citizen(name, age, id, birthDate);
            } else if (tokens.length == 3) {
                String group = tokens[2];

                buyer = new Rebel(name, age, group);
            }

            if (buyer != null) {
                buyerMap.putIfAbsent(name, buyer);
            }

        }

        String input = "";
        while (!"End".equals(input = bufferedReader.readLine())) {
            String buyer = input;

            for (Map.Entry<String, Buyer> stringBuyerEntry : buyerMap.entrySet()) {
                if (stringBuyerEntry.getKey().equals(buyer)){
                    stringBuyerEntry.getValue().buyFood();
                }
            }
        }

        int totalFood = 0;
        for (Map.Entry<String, Buyer> stringBuyerEntry : buyerMap.entrySet()) {
            totalFood += stringBuyerEntry.getValue().getFood();
        }
        System.out.println(totalFood);


    }
}
