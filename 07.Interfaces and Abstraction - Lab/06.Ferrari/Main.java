package Ferrari_06;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        String driverName = bufferedReader.readLine();

        Ferrari ferrari = new Ferrari(driverName);

        System.out.println(ferrari.toString());
    }
}
