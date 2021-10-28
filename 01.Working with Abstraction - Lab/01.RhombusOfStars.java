import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class RhombusOfStars_01 {

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(bufferedReader.readLine());

        String rhombus = createRhombus(n);

        System.out.println(rhombus);
    }

    private static String createRhombus(int n) {
        StringBuilder rhombus = new StringBuilder();

        rhombus.append(createTopHalf(n));
        rhombus.append(createBottomHalf(n));

        return rhombus.toString();
    }

    private static String createTopHalf(int n) {
        StringBuilder topHalf = new StringBuilder();
        for (int rows = 1; rows <= n; rows++) {
            topHalf.append(repeatSequence(n - rows, " "));

            topHalf.append(repeatSequence(rows, "* "));
            topHalf.append(System.lineSeparator());
        }

        return topHalf.toString();
    }

    private static String createBottomHalf(int n) {
        StringBuilder bottomHalf = new StringBuilder();
        for (int rows = 1; rows <= n - 1; rows++) {
            bottomHalf.append(repeatSequence(rows, " "));

            bottomHalf.append(repeatSequence(n - rows, "* "));
            bottomHalf.append(System.lineSeparator());
        }

        return bottomHalf.toString();
    }

    private static String repeatSequence(int i, String s) {
        StringBuilder out = new StringBuilder();
        for (int spaces = 1; spaces <= i; spaces++) {
            out.append(s);
        }
        return out.toString();
    }
}