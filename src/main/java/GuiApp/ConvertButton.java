package GuiApp;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.control.Button;

public class ConvertButton implements AppButton {

    private final Button button;

    public ConvertButton(Button button) {
        this.button = button;
        this.button.setText("Convert");
    }

    @Override
    public void setOnAction(EventHandler<ActionEvent> event) {
        button.setOnAction(event);
    }

    @Override
    public Button actualButton() {
        return button;
    }
}
