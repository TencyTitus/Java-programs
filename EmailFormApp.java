import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

public class EmailFormApp extends Application {

    @Override
    public void start(Stage stage) {
        TextField emailField = new TextField();
        emailField.setPromptText("Enter your email");

        Button submitBtn = new Button("Submit");
        Label statusLabel = new Label();

        submitBtn.setOnAction(e -> {
            String email = emailField.getText();
            if (email.contains("@") && email.contains(".")) {
                statusLabel.setText("Valid");
                statusLabel.setTextFill(Color.GREEN);
            } else {
                statusLabel.setText("Invalid");
                statusLabel.setTextFill(Color.RED);
            }
        });

        VBox root = new VBox(15, emailField, submitBtn, statusLabel);
        root.setStyle("-fx-alignment: center; -fx-padding: 20;");

        stage.setScene(new Scene(root, 300, 200));
        stage.setTitle("Email Validation Form");
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}
