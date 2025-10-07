import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class ShapeApp extends Application {
    @Override
    public void start(Stage primaryStage) {
        ShapeModel model = new ShapeModel();
        ShapeView view = new ShapeView();
        new ShapeController(model, view);

        Scene scene = new Scene(view.getView());
        primaryStage.setTitle("Shape Drawer");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}