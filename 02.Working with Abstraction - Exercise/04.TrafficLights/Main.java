package TrafficLights_04;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        TrafficLightsEnum[] lights = Arrays.stream(bufferedReader.readLine().split(" "))
                .map(TrafficLightsEnum::valueOf)
                .toArray(TrafficLightsEnum[]::new);

        int n = Integer.parseInt(bufferedReader.readLine());

        TrafficLightsEnum[] trafficLights = TrafficLightsEnum.values();
        for (int i = 0; i < n; i++) {
            for (int g = 0; g < lights.length; g++) {
                TrafficLightsEnum light = lights[g];
                int nextIndex = light.ordinal() + 1;
                TrafficLightsEnum value = trafficLights[nextIndex% trafficLights.length];
                lights[g] = value;
                System.out.print(value + " ");
            }
            System.out.println();
        }
    }
}
