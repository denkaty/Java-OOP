package ShoppingSpree_03;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        List<String> personInput = Arrays.stream(bufferedReader.readLine().split(";"))
                .collect(Collectors.toList());
        Map<String, Person> people = new LinkedHashMap<>();
        for (String currentPerson : personInput) {
            String[] currentPersonInfo = currentPerson.split("=");
            String currentPersonName = currentPersonInfo[0];
            double currentPersonMoneys = Double.parseDouble(currentPersonInfo[1]);

            Person person = new Person(currentPersonName, currentPersonMoneys);
            people.putIfAbsent(currentPersonName, person);
        }

        List<String> productInput = Arrays.stream(bufferedReader.readLine().split(";"))
                .collect(Collectors.toList());
        Map<String, Product> products = new LinkedHashMap<>();
        for (String currentProduct : productInput) {
            String[] currentProductInfo = currentProduct.split("=");
            String currentProductName = currentProductInfo[0];
            double currentProductCost = Double.parseDouble(currentProductInfo[1]);

            Product product = new Product(currentProductName, currentProductCost);
            products.putIfAbsent(currentProductName, product);
        }


        String command = "";
        while (!"END".equals(command = bufferedReader.readLine())) {
            String[] tokens = command.split("\\s+");
            String personName = tokens[0];
            String productName = tokens[1];

            if (people.containsKey(personName) && products.containsKey(productName)) {
                Person person = people.get(personName);
                Product product = products.get(productName);

                person.buyProduct(product);
                people.get(personName).buyProduct(products.get(productName));
            }
        }


        for (Person person : people.values()) {
            System.out.println(person.toString());
        }


    }
}
