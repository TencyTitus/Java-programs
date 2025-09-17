import javafx.scene.paint.Color;

public class ColorModel {
    private Color currentColor;
    private final Color defaultColor;
    
    public ColorModel() {
        this.defaultColor = Color.LIGHTGRAY;
        this.currentColor = defaultColor;
    }
    
    // Getters and setters
    public Color getCurrentColor() { return currentColor; }
    public void setCurrentColor(Color color) { this.currentColor = color; }
    public void resetColor() { this.currentColor = defaultColor; }
}
