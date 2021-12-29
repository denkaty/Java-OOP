package Telephony_05;

import java.util.List;

public class Smartphone implements Callable, Browsable {
    private List<String> numbers;
    private List<String> urls;

    public Smartphone(List<String> numbers, List<String> urls) {
        this.numbers = numbers;
        this.urls = urls;
    }


    @Override
    public String call() {
        StringBuilder stringBuilder = new StringBuilder();

        for (int i = 0; i < this.numbers.size(); i++) {
            String currentNumber = this.numbers.get(i);
            boolean containsDifferentFromDigit = false;


            for (char currentChar : currentNumber.toCharArray()) {
                if (!Character.isDigit(currentChar)){
                    if (i < this.numbers.size()-1){
                        stringBuilder.append("Invalid number!");
                        stringBuilder.append(System.lineSeparator());
                    }else {
                        stringBuilder.append("Invalid number!");
                    }

                    containsDifferentFromDigit = true;
                    break;
                }
            }

            if (!containsDifferentFromDigit){
                if (i < this.numbers.size() - 1) {
                    stringBuilder.append(String.format("Calling... %s", this.numbers.get(i)));
                    stringBuilder.append(System.lineSeparator());
                } else {
                    stringBuilder.append(String.format("Calling... %s", this.numbers.get(i)));
                }
            }

        }

        return stringBuilder.toString();
    }

    @Override
    public String browse() {
        StringBuilder stringBuilder = new StringBuilder();

        for (int i = 0; i < this.urls.size(); i++) {
            String currentUrl = this.urls.get(i);
            boolean containsDigit = false;

            for (char currentChar : currentUrl.toCharArray()) {
                if (Character.isDigit(currentChar)) {
                    if (i<this.urls.size()-1){
                        stringBuilder.append("Invalid URL!");
                        stringBuilder.append(System.lineSeparator());
                    }else {
                        stringBuilder.append("Invalid URL!");
                    }

                    containsDigit = true;
                    break;
                }
            }

            if (!containsDigit) {
                if (i < this.urls.size() - 1) {
                    stringBuilder.append(String.format("Browsing: %s!", this.urls.get(i)));
                    stringBuilder.append(System.lineSeparator());
                } else {
                    stringBuilder.append(String.format("Browsing: %s!", this.urls.get(i)));
                }
            }

        }

        return stringBuilder.toString();
    }
}
