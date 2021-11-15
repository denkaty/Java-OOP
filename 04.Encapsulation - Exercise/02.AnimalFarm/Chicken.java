package AnimalFarm_02;

public class Chicken {
    private String name;
    private int age;

    public Chicken(String name, int age) {
        setName(name);
        setAge(age);
    }

    public String getName() {
        return name;
    }

    private void setName(String name) {
        if (name.length() < 1 || name.equals(" ")) {
            throw new IllegalStateException("Name cannot be empty.");
        }
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    private void setAge(int age) {
        if (age < 0 || age > 15) {
            throw new IllegalStateException("Age should be between 0 and 15.");
        }
        this.age = age;
    }

    private double calculateProductPerDay() {
        double productPerDay;
        if (getAge() < 6) {
            productPerDay = 2;
        } else if (getAge() < 12) {
            productPerDay = 1;
        } else {
            productPerDay = 0.75;
        }

        return productPerDay;
    }

    public double productPerDay() {

        return calculateProductPerDay();
    }

    @Override
    public String toString() {
        return String.format("Chicken %s (age %d) can produce %.02f eggs per day.",
                this.getName(), this.getAge(), this.productPerDay());
    }
}
