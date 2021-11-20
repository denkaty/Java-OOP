package PizzaCalories_04;

public class Dough {
    private String flourType;
    private String bakingTechnique;
    private double weight;

    public Dough(String flourType, String bakingTechnique, double weight) {
        setFlourType(flourType);
        setBakingTechnique(bakingTechnique);
        setWeight(weight);
    }

    private void setWeight(double weight) {
        if (weight < 1 || weight > 200) {
            throw new IllegalStateException("Dough weight should be in the range [1..200].");
        }
        this.weight = weight;
    }

    private void setFlourType(String flourType) {
        boolean contains = false;
        for (FlourTypes_Enum value : FlourTypes_Enum.values()) {
            if (flourType.equals(value.toString())) {
                this.flourType = flourType;
                contains = true;
                break;
            }
        }
        if (!contains) {
            throw new IllegalStateException("Invalid type of dough.");
        }
    }

    private void setBakingTechnique(String bakingTechnique) {
        boolean contains = false;

        for (BakingTechnique_Enum value : BakingTechnique_Enum.values()) {
            if (bakingTechnique.equals(value.toString())){
                this.bakingTechnique = bakingTechnique;
                contains = true;
                break;
            }
        }
        if (!contains){
            throw new IllegalStateException("Invalid type of dough.");
        }
    }

    public double calculateCalories() {
        double calories = this.weight * 2;
        if (this.flourType.equals(FlourTypes_Enum.White.toString())) {
            calories *= 1.5;
        } else if (this.flourType.equals(FlourTypes_Enum.Wholegrain.toString())) {
            calories *= 1.0;
        }

        if (this.bakingTechnique.equals(BakingTechnique_Enum.Crispy.toString())) {
            calories *= 0.9;
        } else if (this.bakingTechnique.equals(BakingTechnique_Enum.Chewy.toString())) {
            calories *= 1.1;
        } else if (this.bakingTechnique.equals(BakingTechnique_Enum.Homemade.toString())) {
            calories *= 1.0;
        }
        return calories;
    }
}
