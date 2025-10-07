import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ColorPicker;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

public class ColorPickerApp extends Application {

    private final Color defaultColor = Color.LIGHTGRAY;

    @Override
    public void start(Stage stage) {
        StackPane colorPane = new StackPane();
        colorPane.setPrefSize(300, 200);
        colorPane.setStyle("-fx-background-color: " + toRgbString(defaultColor) + ";");

        ColorPicker colorPicker = new ColorPicker(defaultColor);
        Button resetBtn = new Button("Reset");

        // Listener updates pane style whenever color is picked
        colorPicker.setOnAction(e -> 
            colorPane.setStyle("-fx-background-color: " + toRgbString(colorPicker.getValue()) + ";")
        );

        resetBtn.setOnAction(e -> {
            colorPicker.setValue(defaultColor);
            colorPane.setStyle("-fx-background-color: " + toRgbString(defaultColor) + ";");
        });

        VBox root = new VBox(15, colorPicker, resetBtn, colorPane);
        root.setStyle("-fx-alignment: center; -fx-padding: 20;");

        stage.setScene(new Scene(root, 350, 300));
        stage.setTitle("Color Picker Example");
        stage.show();
    }

    private String toRgbString(Color c) {
        return String.format("rgb(%d,%d,%d)",
                (int) (c.getRed() * 255),
                (int) (c.getGreen() * 255),
                (int) (c.getBlue() * 255));
    }

    public static void main(String[] args) {
        launch();
    }
}
