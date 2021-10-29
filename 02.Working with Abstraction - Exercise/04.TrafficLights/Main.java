package TrafficLights_04;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        TrafficLightsEnum[] inputLights = Arrays.stream(bufferedReader.readLine().split(" "))
                .map(TrafficLightsEnum::valueOf)
                .toArray(TrafficLightsEnum[]::new);

        int n = Integer.parseInt(bufferedReader.readLine());


        for (int i = 0; i < n; i++) {
            for (int g = 0; g < inputLights.length; g++) {
                TrafficLightsEnum currentLight = inputLights[g];

                switch (currentLight.name()){
                    case "RED":
                        inputLights[g] = TrafficLightsEnum.GREEN;
                        break;
                    case "GREEN":
                        inputLights[g] = TrafficLightsEnum.YELLOW;
                        break;
                    case "YELLOW":
                        inputLights[g] = TrafficLightsEnum.RED;
                        break;
                }
                System.out.print(inputLights[g] + " ");
            }
            System.out.println();
        }
    }
}
