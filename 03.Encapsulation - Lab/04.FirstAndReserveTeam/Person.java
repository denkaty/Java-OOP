package FirstAndReserveTeam_04;


import java.text.DecimalFormat;

public class Person {
    private String firstName;
    private String lastName;
    private int age;
    private double salary;

    public Person(String firstName, String lastName, int age, double salary) {
        setFirstName(firstName);
        setLastName(lastName);
        setAge(age);
        setSalary(salary);
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        if (firstName.length() < 3) {
            throw new IllegalStateException("First name cannot be less than 3 symbols");
        }
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        if (lastName.length() < 3) {
            throw new IllegalStateException("Last name cannot be less than 3 symbols");
        }
        this.lastName = lastName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age < 1) {
            throw new IllegalStateException("Age cannot be zero or negative integer");
        }
        this.age = age;
    }
    public double getSalary() {
        return this.salary;
    }
    public void setSalary(double salary) {
        if (salary < 460) {
            throw new IllegalStateException("Salary cannot be less than 460 leva");
        }
        this.salary = salary;
    }

    public void increaseSalary(double bonus) {
        if (this.age < 30) {
            this.salary+= getSalary() * bonus / 200;
        }else {
            this.salary+= getSalary() * bonus / 100;
        }
    }


    @Override
    public String toString() {
        DecimalFormat decimalFormat = new DecimalFormat("#.0##");
        return String.format("%s %s gets %s leva", this.firstName, this.lastName, decimalFormat.format(this.salary));
    }
}
