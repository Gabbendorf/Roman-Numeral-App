package GuiAppTest;

import GuiApp.AppButton;
import javafx.event.EventHandler;
import javafx.scene.control.Button;

public class ConvertButtonDouble implements AppButton {

    private EventHandler eventHandler;
    public boolean wasCalled = false;

    @Override
    public void setOnAction(EventHandler event) {
        eventHandler = event;
        wasCalled = true;
    }

    @Override
    public Button actualButton() {
        return null;
    }

    public void press() {
        eventHandler.handle(null);
    }
}
