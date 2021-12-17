package SayHello_03;

public  abstract class PersonImp implements Person {
    private String name;

    protected PersonImp(String name) {
        this.name = name;
    }

    @Override
    public String getName() {
        return null;
    }

    @Override
    public String sayHello() {
        return "Hello";
    }
}
