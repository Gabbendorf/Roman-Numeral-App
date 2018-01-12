public class GameFlow {

    private final UI ui;
    private final NumberConverter numberConverter;

    public GameFlow(UI ui, NumberConverter numberConverter) {
        this.ui = ui;
        this.numberConverter = numberConverter;
    }

    public void run() {
        int numberToConvert = ui.askForNumberToConvert();
        ui.printConvertedNumber(numberToConvert, numberConverter.convertedNumber(numberToConvert));
        if (ui.askToPlayAgain().equals("y")) {
            run();
        }
    }
}
