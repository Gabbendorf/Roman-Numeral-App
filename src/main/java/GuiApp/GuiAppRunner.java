package GuiApp;

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

        AppTextField number = new AppTextField(new TextField());
        GridPane.setConstraints(number.actualTextField(), 0, 0);
        grid.getChildren().add(number.actualTextField());

        AppLabel label = new AppLabel(new Label());
        grid.getChildren().add(label.actualLabel());

        ConvertButton convertButton = new ConvertButton(new Button());
        GridPane.setConstraints(convertButton.actualButton(), 1, 0);
        grid.getChildren().add(convertButton.actualButton());

        Scene scene = new Scene(grid, 300, 300);
        primaryStage.setTitle("Roman Numeral Converter");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
