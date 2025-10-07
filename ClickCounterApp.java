import javafx.application.Application;
import javafx.beans.property.IntegerProperty;
import javafx.beans.property.SimpleIntegerProperty;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class ClickCounterApp extends Application {

    private final IntegerProperty count = new SimpleIntegerProperty(0);

    @Override
    public void start(Stage stage) {
        Button clickBtn = new Button("Click Me");
        Button resetBtn = new Button("Reset");
        Label countLabel = new Label();

        // Bind label text to count property
        countLabel.textProperty().bind(count.asString());

        clickBtn.setOnAction(e -> count.set(count.get() + 1));
        resetBtn.setOnAction(e -> count.set(0));

        HBox buttons = new HBox(10, clickBtn, resetBtn);
        VBox root = new VBox(15, buttons, countLabel);
        root.setStyle("-fx-alignment: center; -fx-padding: 20;");

        stage.setScene(new Scene(root, 250, 150));
        stage.setTitle("Click Counter");
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}
