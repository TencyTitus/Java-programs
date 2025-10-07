import javafx.scene.control.*;
import javafx.scene.layout.*;
import javafx.scene.layout.Pane;

public class ShapeView {
    public ComboBox<String> shapeComboBox = new ComboBox<>();
    public Button drawButton = new Button("Draw Shape");
    public Button clearButton = new Button("Clear All");
    public Pane shapePane = new Pane();
    public Label countLabel = new Label("Shapes: 0");

    public VBox getView() {
        shapeComboBox.getItems().addAll("Circle", "Rectangle");
        shapeComboBox.setValue("Circle");

        HBox controls = new HBox(10, shapeComboBox, drawButton, clearButton, countLabel);
        VBox layout = new VBox(10, controls, shapePane);
        layout.setPrefSize(500, 400);

        return layout;
    }
}