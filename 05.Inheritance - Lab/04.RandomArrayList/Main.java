package RandomArrayList_04;

public class Main {

    public static void main(String[] args) {
        RandomArrayList<String> words = new RandomArrayList<>();
        words.add("first");
        words.add("second");
        words.add("third");

        System.out.println(words.getRandomElement());
        System.out.println(words.getRandomElement());
        System.out.println(words.getRandomElement());
    }
}
