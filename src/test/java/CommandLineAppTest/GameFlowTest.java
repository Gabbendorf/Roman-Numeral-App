package CommandLineAppTest;

import CommandLineApp.GameFlow;
import CommandLineApp.NumberConverter;
import CommandLineApp.UI;
import org.junit.*;
import java.io.*;
import static org.junit.Assert.*;

public class GameFlowTest {

    private ByteArrayOutputStream output;

    @Before
    public void setUp() {
        output = new ByteArrayOutputStream();
    }

    @Test
    public void runsProgram() {
        UI ui = new UI(new PrintStream(output), new ByteArrayInputStream("47\nn".getBytes()));
        NumberConverter numberConverter = new NumberConverter();
        GameFlow gameFlow = new GameFlow(ui, numberConverter);

        gameFlow.run();

        assertTrue(output.toString().contains("The Roman number for 47 is: XLVII"));
    }

    @Test
    public void runsProgramTwice() {
        UI ui = new UI(new PrintStream(output), new ByteArrayInputStream("1\ny\n5\nn".getBytes()));
        NumberConverter numberConverter = new NumberConverter();
        GameFlow gameFlow = new GameFlow(ui, numberConverter);

        gameFlow.run();

        assertTrue(output.toString().contains("The Roman number for 1 is: I."));
        assertTrue(output.toString().contains("The Roman number for 5 is: V."));
    }
}