package CommandLineAppTest;

import CommandLineApp.UI;
import org.junit.*;
import java.io.*;
import static org.junit.Assert.*;

public class UITest {

    private ByteArrayOutputStream output;

    @Before
    public void setUp() {
        output = new ByteArrayOutputStream();
    }

    @Test
    public void promptsUserForNumberToConvert() {
        UI ui = newUIWith("3");

        int numberChosen = ui.askForNumberToConvert();

        assertTrue(output.toString().contains("Choose a number from 1 to 3999:"));
        assertEquals(3, numberChosen);
    }

    @Test
    public void printsConvertedRomanNumber() {
        UI ui = newUIWith("someInput");

        ui.printConvertedNumber(11, "XI");

        assertTrue(output.toString().contains("The Roman number for 11 is: XI."));
    }

    @Test
    public void printsMessageToPlayAgain() {
        UI ui = newUIWith("y");

        String userAnswer = ui.askToPlayAgain();

        assertTrue(output.toString().contains("Another number to convert? y/n"));
        assertEquals("y", userAnswer);
    }

    private UI newUIWith(String inputString) {
        ByteArrayInputStream input = new ByteArrayInputStream(inputString.getBytes());

        return new UI(new PrintStream(output), input);
    }
}