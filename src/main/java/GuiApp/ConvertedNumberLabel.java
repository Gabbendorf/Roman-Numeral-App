package GuiApp;

import javafx.scene.control.Label;

public class ConvertedNumberLabel implements AppLabel {

    private final Label label;

    public ConvertedNumberLabel(Label label) {
        this.label = label;
    }

    @Override
    public void setText(String text) {
        label.setText(text);
    }

    @Override
    public Label actualLabel() {
        return label;
    }
}
