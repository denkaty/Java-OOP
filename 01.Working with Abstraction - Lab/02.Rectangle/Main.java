package Rectangle_02;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int[] coordinates = Arrays.stream(bufferedReader.readLine().split("\\s+"))
                .mapToInt(Integer::parseInt)
                .toArray();

        Point2D bottomLeft = new Point2D(coordinates[0], coordinates[1]);
        Point2D topRight = new Point2D(coordinates[2], coordinates[3]);

        Rectangle rectangle = new Rectangle(bottomLeft, topRight);

        int n = Integer.parseInt(bufferedReader.readLine());
        for (int i = 0; i < n; i++) {
            coordinates = Arrays.stream(bufferedReader.readLine().split("\\s+"))
                    .mapToInt(Integer::parseInt)
                    .toArray();
            Point2D coordinatesOfPoints = new Point2D(coordinates[0], coordinates[1]);
           boolean isContained = rectangle.contains(coordinatesOfPoints);
            System.out.println(isContained);
        }
    }

}
