package CommandLineApp;

public class CommandLineAppRunner {

    public static void main(String[] args) {
        UI ui = new UI(System.out, System.in);
        NumberConverter numberConverter = new NumberConverter();
        GameFlow gameFlow = new GameFlow(ui, numberConverter);

        gameFlow.run();
    }
}
