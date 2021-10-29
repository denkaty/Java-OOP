package JediGalaxy_05;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] dimensions = readArray(scanner.nextLine());
        int rows = dimensions[0];
        int cols = dimensions[1];

        int[][] matrix = createMatrix(rows, cols);

        String command = scanner.nextLine();
        long sum = 0;
        while (!command.equals("Let the Force be with you")) {
            int[] petersLocation = readArray(command);
            int[] evilPowersLocation = readArray(scanner.nextLine());

            matrix = evilDestroysStars(matrix, evilPowersLocation);

            sum = peterCollectsStars(matrix, sum, petersLocation);

            command = scanner.nextLine();
        }

        System.out.println(sum);


    }

    private static int[] readArray(String s) {
        return Arrays.stream(s.split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();
    }

    private static int[][] createMatrix(int rows, int cols) {
        int[][] matrix = new int[rows][cols];

        int value = 0;
        for (int row = 0; row < rows; row++) {
            for (int cow = 0; cow < cols; cow++) {
                matrix[row][cow] = value++;
            }
        }
        return matrix;
    }

    private static int[][] evilDestroysStars(int[][] matrix, int[] evilPowersLocation) {
        int evilPowersRow = evilPowersLocation[0];
        int evilPowersCow = evilPowersLocation[1];
        while (evilPowersRow >= 0 && evilPowersCow >= 0) {
            if (evilPowersRow < matrix.length && evilPowersCow < matrix[0].length) {
                matrix[evilPowersRow][evilPowersCow] = 0;
            }
            evilPowersRow--;
            evilPowersCow--;
        }
        return matrix;
    }

    private static long peterCollectsStars(int[][] matrix, long sum, int[] petersLocation) {
        int petersRow = petersLocation[0];
        int petersCow = petersLocation[1];
        while (petersRow >= 0 && petersCow < matrix[1].length) {
            if (petersRow < matrix.length && petersCow >= 0 && petersCow < matrix[0].length) {
                sum += matrix[petersRow][petersCow];
            }

            petersCow++;
            petersRow--;
        }
        return sum;
    }
}
