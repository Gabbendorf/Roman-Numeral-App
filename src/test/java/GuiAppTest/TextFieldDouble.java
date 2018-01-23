package GuiAppTest;

import GuiApp.AppTextField;
import javafx.scene.control.TextField;

public class TextFieldDouble implements AppTextField {

    public String getText() {
        return "44";
    }

    @Override
    public TextField actualTextField() {
        return null;
    }
}
