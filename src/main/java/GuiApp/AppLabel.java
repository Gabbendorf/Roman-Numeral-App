package GuiApp;

import javafx.scene.control.Label;

public class AppLabel {

    private final Label label;

    public AppLabel(Label label) {
        this.label = label;
        this.label.setText("Number from 1 to 3999");
    }

    public Label actualLabel() {
        return label;
    }
 }
