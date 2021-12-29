package MilitaryElite_06.Enums;

public enum State {
    INPROGRESS("inProgress"),
    FINISHED("finished");

    private String state;

    State(String state) {
        this.state = state;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }
}
