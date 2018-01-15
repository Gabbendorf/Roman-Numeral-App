package GuiApp;

import javafx.scene.control.TextField;

public class AppTextField {

    private final TextField textField;

    public AppTextField(TextField textField) {
        this.textField = textField;
    }

    public TextField actualTextField() {
        return textField;
    }
}
