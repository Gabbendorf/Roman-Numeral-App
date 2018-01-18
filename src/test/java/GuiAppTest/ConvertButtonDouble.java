package GuiAppTest;

import GuiApp.AppButton;
import javafx.event.EventHandler;
import javafx.scene.control.Button;

public class ConvertButtonDouble implements AppButton {

    public boolean wasCalled = false;

    @Override
    public void setOnAction(EventHandler event) {
        wasCalled = true;
    }

    @Override
    public Button actualButton() {
        return null;
    }
}
