package GuiAppTest;

import GuiApp.AppTextField;
import javafx.scene.control.TextField;

public class TextFieldDouble implements AppTextField {

    private String text;

    public String getText() {
        return text;
    }

    public void setTextToConvert(String someText) {
        text = someText;
    }

    @Override
    public TextField actualTextField() {
        return null;
    }
}
