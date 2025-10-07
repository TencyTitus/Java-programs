import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.Label;
import javafx.scene.control.Slider;
import javafx.scene.layout.VBox;
import javafx.scene.text.Font;
import javafx.scene.text.FontPosture;
import javafx.scene.text.FontWeight;
import javafx.stage.Stage;

public class FontChangerApp extends Application {

    @Override
    public void start(Stage stage) {
        Label sampleLabel = new Label("Sample Text");
        sampleLabel.setFont(Font.font("Arial", FontWeight.NORMAL, FontPosture.REGULAR, 20));

        ChoiceBox<String> styleBox = new ChoiceBox<>();
        styleBox.getItems().addAll("Normal", "Bold", "Italic", "Bold Italic");
        styleBox.setValue("Normal");

        Slider sizeSlider = new Slider(10, 36, 20);
        sizeSlider.setShowTickLabels(true);
        sizeSlider.setShowTickMarks(true);

        // Listener updates font whenever style or size changes
        Runnable updateFont = () -> {
            String style = styleBox.getValue();
            double size = sizeSlider.getValue();
            FontWeight weight = FontWeight.NORMAL;
            FontPosture posture = FontPosture.REGULAR;

            switch (style) {
                case "Bold": weight = FontWeight.BOLD; break;
                case "Italic": posture = FontPosture.ITALIC; break;
                case "Bold Italic": weight = FontWeight.BOLD; posture = FontPosture.ITALIC; break;
            }
            sampleLabel.setFont(Font.font("Arial", weight, posture, size));
        };

        styleBox.setOnAction(e -> updateFont.run());
        sizeSlider.valueProperty().addListener((obs, oldV, newV) -> updateFont.run());

        VBox root = new VBox(15, sampleLabel, styleBox, sizeSlider);
        root.setStyle("-fx-alignment: center; -fx-padding: 20;");

        stage.setScene(new Scene(root, 350, 200));
        stage.setTitle("Font Changer");
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}
