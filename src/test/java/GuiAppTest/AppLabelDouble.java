package GuiAppTest;

import GuiApp.AppLabel;
import javafx.scene.control.Label;

public class AppLabelDouble implements AppLabel {

    public String text;

    @Override
    public void setText(String someText) {
        text = someText;
    }

    @Override
    public Label actualLabel() {
        return null;
    }

    public String getText() {
        return text;
    }
}
