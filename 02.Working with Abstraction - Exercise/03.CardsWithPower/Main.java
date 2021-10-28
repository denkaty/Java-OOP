package CardsWithPower_03;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        String cardName = bufferedReader.readLine();
        String suitName = bufferedReader.readLine();

        int cardPower = calculateCardPower(CardPower.valueOf(cardName), SuitPower.valueOf(suitName));
        System.out.println(String.format("Card name: %s of %s; Card power: %d",
                cardName, suitName, cardPower));
    }

    private static int calculateCardPower(CardPower cardPower, SuitPower suitPower) {
        return cardPower.getCardPower() + suitPower.getSuitPower();
    }
}
