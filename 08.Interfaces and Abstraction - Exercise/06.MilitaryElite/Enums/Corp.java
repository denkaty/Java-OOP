package MilitaryElite_06.Enums;

public enum Corp {
    AIRFORCES("Airforces"),
    MARINES("Marines");

    private String name;

    Corp(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
