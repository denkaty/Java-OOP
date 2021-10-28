package CardSuits_01;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        String input = bufferedReader.readLine();

        if (input.equals("Card Suits")) {
            System.out.println("Card Suits:");
            for (CardSuitsEnum cardSuit : CardSuitsEnum.values()) {
                System.out.println(String.format("Ordinal value: %d; Name value: %s", cardSuit.getOrdinalValue(), cardSuit.name()));
            }
        }
    }
}
