package Telephony_05;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        List<String> numbersToCall = Arrays.asList(bufferedReader.readLine().split("\\s+"));
        List<String> sitesToVisit = Arrays.asList(bufferedReader.readLine().split("\\s+"));

        Smartphone smartphone = new Smartphone(numbersToCall,sitesToVisit);
        System.out.println(smartphone.call());
        System.out.println(smartphone.browse());


    }
}
