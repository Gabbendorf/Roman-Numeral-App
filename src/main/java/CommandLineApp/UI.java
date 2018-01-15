package CommandLineApp;

import java.io.*;
import java.util.Scanner;

public class UI {

    private final PrintStream output;
    private final Scanner input;

    public UI(PrintStream output, InputStream input) {
        this.output = output;
        this.input = new Scanner(input);
    }

    public int askForNumberToConvert() {
        output.println("Choose a number from 1 to 3999:");
        return Integer.parseInt(input.nextLine());
    }

    public void printConvertedNumber(int numberChosen, String convertedNumber) {
        output.println(String.format("The Roman number for %s is: %s.",
                Integer.toString(numberChosen), convertedNumber));
    }

    public String askToPlayAgain() {
        output.println("Another number to convert? y/n");
        return input.nextLine();
    }
}
