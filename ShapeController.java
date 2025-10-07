import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Rectangle;

public class ShapeController {
    private ShapeModel model;
    private ShapeView view;

    public ShapeController(ShapeModel model, ShapeView view) {
        this.model = model;
        this.view = view;

        // Bind label to shape count
        view.countLabel.textProperty().bind(model.shapeCountProperty().asString("Shapes: %d"));

        // Handle Draw button
        view.drawButton.setOnAction(e -> drawShape());

        // Handle Clear All button
        view.clearButton.setOnAction(e -> clearShapes());

        // Update model when ComboBox changes
        view.shapeComboBox.setOnAction(e -> model.setShapeType(view.shapeComboBox.getValue()));
    }

    private void drawShape() {
        String type = model.getShapeType();
        if ("Circle".equals(type)) {
            Circle circle = new Circle(30, Color.LIGHTBLUE);
            circle.setCenterX(Math.random() * (view.shapePane.getWidth() - 60) + 30);
            circle.setCenterY(Math.random() * (view.shapePane.getHeight() - 60) + 30);
            view.shapePane.getChildren().add(circle);
        } else if ("Rectangle".equals(type)) {
            Rectangle rect = new Rectangle(60, 40, Color.LIGHTGREEN);
            rect.setX(Math.random() * (view.shapePane.getWidth() - 60));
            rect.setY(Math.random() * (view.shapePane.getHeight() - 40));
            view.shapePane.getChildren().add(rect);
        }
        model.incrementCount();
    }

    private void clearShapes() {
        view.shapePane.getChildren().clear();
        model.resetCount();
    }
}