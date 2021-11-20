package PizzaCalories_04;

public class Topping {
    private String toppingType;
    private double weight;

    public Topping(String toppingType, double weight) {
        setToppingType(toppingType);
        setWeight(weight);

    }

    private void setToppingType(String toppingType) {
        boolean contains = false;
        for (ToppingTypes_Enum value : ToppingTypes_Enum.values()) {
            if (toppingType.equals(value.toString())) {
                this.toppingType = toppingType;
                contains = true;
                break;
            }
        }
        if (!contains){
            throw new IllegalStateException("Cannot place " + this.toppingType + " on top of your pizza.");
        }
    }

    private void setWeight(double weight) {
        if (weight < 1 || weight > 50) {
            throw new IllegalStateException(this.toppingType + " weight should be in the range [1..50].");
        }
        this.weight = weight;
    }

    public double calculateCalories() {
        double calories = this.weight * 2;
        if (this.toppingType.equals(ToppingTypes_Enum.Meat.toString())) {
            calories *= 1.2;
        } else if (this.toppingType.equals(ToppingTypes_Enum.Veggies.toString())) {
            calories *= 0.8;
        } else if (this.toppingType.equals(ToppingTypes_Enum.Cheese.toString())) {
            calories *= 1.1;
        } else if (this.toppingType.equals(ToppingTypes_Enum.Sauce.toString())) {
            calories *= 0.9;
        }

        return calories;
    }
}
