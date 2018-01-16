package GuiApp;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.control.Button;

public class ConvertButton {

    private final Button button;

    public ConvertButton(Button button) {
        this.button = button;
        this.button.setText("Convert");
    }

    public Button actualButton() {
        return button;
    }
}
