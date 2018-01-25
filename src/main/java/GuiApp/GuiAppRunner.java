package GuiApp;

import CommandLineApp.NumberConverter;
import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class GuiAppRunner extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception {
        primaryStage.setTitle("Roman Numeral Converter");
        GridPane grid = new GridPane();
        setSizeForGrid(grid);
        Scene scene = new Scene(grid, 300, 300);
        NumberTextField numberField = new NumberTextField(new TextField());
        ConvertedNumberLabel label = new ConvertedNumberLabel(new Label());
        ConvertButton convertButton = new ConvertButton(new Button());
        ActionSetter actionSetter = new ActionSetter(new NumberConverter(), numberField, label);

        grid.add(numberField.actualTextField(), 0, 0);
        grid.add(convertButton.actualButton(), 1, 0);
        actionSetter.addClickHandler(convertButton);
        grid.add(label.actualLabel(), 0, 5);

        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }

    private void setSizeForGrid(GridPane grid) {
        grid.setPadding(new Insets(10, 10, 10, 10));
        grid.setHgap(5);
        grid.setVgap(5);
    }
}
