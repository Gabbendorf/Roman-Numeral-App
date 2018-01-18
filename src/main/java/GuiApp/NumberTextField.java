package GuiApp;

import javafx.scene.control.TextField;

public class NumberTextField implements AppTextField {

    private final TextField textField;

    public NumberTextField(TextField textField) {
        this.textField = textField;
        this.textField.setPromptText("Number from 1 to 3999");
    }

    @Override
    public String getText() {
        return textField.getText();
    }

    @Override
    public TextField actualTextField() {
        return textField;
    }
}
