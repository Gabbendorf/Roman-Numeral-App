package GuiAppTest;

import GuiApp.AppTextField;
import javafx.scene.control.TextField;

public class TextFieldDouble implements AppTextField {

    @Override
    public String getText() {
        return "some text";
    }

    @Override
    public TextField actualTextField() {
        return null;
    }
}
