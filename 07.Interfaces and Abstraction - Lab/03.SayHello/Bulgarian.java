package SayHello_03;

public class Bulgarian extends PersonImp implements Person {

    public Bulgarian(String name) {
        super(name);
    }

    @Override
    public String sayHello() {
        return "Здравей";
    }
}
