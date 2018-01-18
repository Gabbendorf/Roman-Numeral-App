package GuiAppTest;

import GuiApp.AppLabel;

public class AppLabelDouble implements AppLabel {

    public String text;

    @Override
    public void setText(String someText) {
        text = someText;
    }
}
