import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;

public class ShapeModel {
    private final StringProperty shapeType = new SimpleStringProperty("Circle");
    private final SimpleIntegerProperty shapeCount = new SimpleIntegerProperty(0);

    // Shape type property
    public String getShapeType() {
        return shapeType.get();
    }

    public void setShapeType(String s) {
        shapeType.set(s);
    }

    public StringProperty shapeTypeProperty() {
        return shapeType;
    }

    // Shape count property
    public int getShapeCount() {
        return shapeCount.get();
    }

    public void incrementCount() {
        shapeCount.set(shapeCount.get() + 1);
    }

    public void resetCount() {
        shapeCount.set(0);
    }

    public SimpleIntegerProperty shapeCountProperty() {
        return shapeCount;
    }
}