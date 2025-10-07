import javafx.application.Application;
import javafx.beans.binding.Bindings;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.Slider;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;

public class CircleResizeApp extends Application {

    @Override
    public void start(Stage stage) {
        Circle circle = new Circle(50, Color.CORNFLOWERBLUE);

        Slider slider = new Slider(10, 100, 50); // min=10, max=100, initial=50
        Label radiusLabel = new Label();

        // Bind circle radius directly to slider value
        circle.radiusProperty().bind(slider.valueProperty());

        // Bind label text to slider value (rounded)
        radiusLabel.textProperty().bind(
                Bindings.createStringBinding(
                        () -> "Radius: " + (int) slider.getValue(),
                        slider.valueProperty()
                )
        );

        VBox root = new VBox(15, circle, slider, radiusLabel);
        root.setStyle("-fx-alignment: center; -fx-padding: 20;");

        stage.setScene(new Scene(root, 300, 300));
        stage.setTitle("Circle Resizer");
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}
