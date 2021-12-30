package CollectionHierarchy_07;

import CollectionHierarchy_07.entities.AddCollection;
import CollectionHierarchy_07.entities.AddRemoveCollection;
import CollectionHierarchy_07.entities.MyListImpl;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        AddCollection addCollection = new AddCollection();
        AddRemoveCollection addRemoveCollection = new AddRemoveCollection();
        MyListImpl myListCollection = new MyListImpl();

        String[] elementsToAdd = bufferedReader.readLine().split("\\s+");
        int amountOfRemoveOperations = Integer.parseInt(bufferedReader.readLine());

        int[][] firstOutput = new int[3][elementsToAdd.length];
        for (int i = 0; i < elementsToAdd.length; i++) {
            String currentElement = elementsToAdd[i];

            firstOutput[0][i] = addCollection.add(currentElement);
            firstOutput[1][i] = addRemoveCollection.add(currentElement);
            firstOutput[2][i] = myListCollection.add(currentElement);
        }

        String[][] secondOutput = new String[2][amountOfRemoveOperations];
        for (int i = 0; i < amountOfRemoveOperations; i++) {
            secondOutput[0][i] = addRemoveCollection.remove();
            secondOutput[1][i] = myListCollection.remove();
        }

        printOutput(firstOutput, secondOutput);

    }

    private static void printOutput(int[][] firstOutput, String[][] secondOutput) {
        StringBuilder stringBuilder = new StringBuilder();
        for (int[] row : firstOutput) {
            for (int col : row) {
                stringBuilder.append(col);
                stringBuilder.append(" ");
            }
            stringBuilder.append(System.lineSeparator());
        }

        for (String[] row : secondOutput) {
            for (String col : row) {
                stringBuilder.append(col);
                stringBuilder.append(" ");
            }
            stringBuilder.append(System.lineSeparator());
        }

        System.out.println(stringBuilder.toString().trim());


    }
}
