package PizzaCalories_04;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    private static BufferedReader bufferedReader;
    private static Pizza pizza;

    public static void main(String[] args) throws IOException {
        bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        try {
            getPizzaTokens();
            getDoughTokens();
            addToppings();

            System.out.println(String.format("%s - %.02f", pizza.getName(), pizza.getOverallCalories()));

        } catch (IllegalStateException exception) {
            System.out.println(exception.getMessage());
        }
    }

    private static void getPizzaTokens() throws IOException {
        String[] pizzaTokens = bufferedReader.readLine().split("\\s+");
        String pizzaName = pizzaTokens[1];
        int numberOfToppings = Integer.parseInt(pizzaTokens[2]);

        pizza = new Pizza(pizzaName, numberOfToppings);

    }

    private static void getDoughTokens() throws IOException {
        String[] doughTokens = bufferedReader.readLine().split("\\s+");
        String flourType = doughTokens[1];
        String bakingTechnique = doughTokens[2];
        double weightInGrams = Double.parseDouble(doughTokens[3]);

        Dough dough = new Dough(flourType, bakingTechnique, weightInGrams);
        pizza.setDough(dough);
    }

    private static void addToppings() throws IOException {
        for (int i = 0; i < pizza.getToppingsCount(); i++) {
            String[] toppingTokens = bufferedReader.readLine().split("\\s+");
            String toppingType = toppingTokens[1];
            double weightInGrams = Double.parseDouble(toppingTokens[2]);

            Topping topping = new Topping(toppingType, weightInGrams);
            pizza.addTopping(topping);
        }

    }
}
