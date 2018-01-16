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
        GridPane grid = new GridPane();
        grid.setPadding(new Insets(10, 10, 10, 10));
        grid.setHgap(5);
        grid.setVgap(5);

        NumberTextField numberField = new NumberTextField(new TextField());
        grid.add(numberField.actualTextField(), 0, 0);

        ConvertedNumberLabel label = new ConvertedNumberLabel(new Label());

        ConvertButton convertButton = new ConvertButton(new Button());
        grid.add(convertButton.actualButton(), 1, 0);

        convertButton.setOnAction(event -> {
            NumberConverter numberConverter = new NumberConverter();
            int numberToConvert = Integer.parseInt(numberField.getText());
            String convertedNumber = numberConverter.convertedNumber(numberToConvert);
            label.setText(convertedNumber);
        });

        grid.add(label.actualLabel(), 0, 5);

        Scene scene = new Scene(grid, 300, 300);
        primaryStage.setTitle("Roman Numeral Converter");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
