package ClassBoxDataValidation_01;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        double length = Double.parseDouble(bufferedReader.readLine());
        double width = Double.parseDouble(bufferedReader.readLine());
        double height = Double.parseDouble(bufferedReader.readLine());

        try {
            Box box = new Box(length, width, height);

            double surfaceArea = box.calculateSurfaceArea();
            double lateralSurfaceArea = box.calculateLateralSurfaceArea();
            double volume = box.calculateVolume();

            System.out.println(String.format("Surface Area - %.02f", surfaceArea));
            System.out.println(String.format("Lateral Surface Area - %.02f", lateralSurfaceArea));
            System.out.println(String.format("Volume – %.02f", volume));
        } catch (IllegalStateException exception) {
            System.out.println(exception.getMessage());
        }


    }

}
