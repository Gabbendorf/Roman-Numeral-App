package GuiApp;

import javafx.scene.control.TextField;

public class AppTextField {

    private final TextField textField;

    public AppTextField(TextField textField) {
        this.textField = textField;
        this.textField.setPromptText("Number from 1 to 3999");
    }

    public TextField actualTextField() {
        return textField;
    }
}
