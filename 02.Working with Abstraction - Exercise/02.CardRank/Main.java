package CardRank_02;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        String input = bufferedReader.readLine();
        if (input.equals("Card Ranks")) {
            System.out.println("Card Ranks:");
            for (CardRanksEnum cardRank : CardRanksEnum.values()) {
                System.out.println(String.format("Ordinal value: %d; Name value: %s", cardRank.ordinal(), cardRank.name()));
            }

        }

    }
}
