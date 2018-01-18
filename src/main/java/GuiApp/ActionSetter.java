package GuiApp;

import CommandLineApp.NumberConverter;

public class ActionSetter {

    private final NumberConverter numberConverter;
    private final AppTextField textField;
    private final AppLabel label;

    public ActionSetter(NumberConverter numberConverter, AppTextField textField, AppLabel label) {
        this.numberConverter = numberConverter;
        this.textField = textField;
        this.label = label;
    }

    public void addClickHandler(AppButton button) {
        button.setOnAction(event -> {
            int numberToConvert = Integer.parseInt(textField.getText());
            String convertedNumber = numberConverter.convertedNumber(numberToConvert);
            label.setText(convertedNumber);
        });
    }
}
