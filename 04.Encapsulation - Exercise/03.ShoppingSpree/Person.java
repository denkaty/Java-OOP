package ShoppingSpree_03;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Person {
    private String name;
    private double moneys;
    private List<Product> products;

    public Person(String name, double moneys) {
        this.setName(name);
        this.setMoney(moneys);
        this.products = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    private void setName(String name) {
        if (name.trim().isEmpty()) {
            throw new IllegalArgumentException("Name cannot be empty");
        }
        this.name = name;
    }

    public double getMoneys() {
        return moneys;
    }

    private void setMoney(double moneys) {
        if (moneys < 0) {
            throw new IllegalArgumentException("Money cannot be negative");
        }
        this.moneys = moneys;
    }

    private List<Product> getProducts() {
        return products;
    }

    public void buyProduct(Product product) {
        if (this.moneys - product.getCost() >= 0) {
            this.setMoney(this.getMoneys() - product.getCost());
            this.products.add(product);
            System.out.println(String.format("%s bought %s", this.getName(), product.getName()));
        } else {
            System.out.println(String.format("%s can't afford %s", this.getName(), product.getName()));
        }
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        if (this.getProducts().size()==0) {
            stringBuilder.append(String.format("%s – Nothing bought", this.getName()));
        } else {
            stringBuilder.append(this.getName())
                    .append(" - ")
                    .append(this.getProducts().stream()
                            .map(Product::getName)
                            .collect(Collectors.joining(", ")));

        }
        return stringBuilder.toString();
    }
}
