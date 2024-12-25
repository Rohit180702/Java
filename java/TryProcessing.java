import processing.core.PApplet;

public class TryProcessing extends PApplet {

    public static final int WIDTH = 640;
    public static final int HEIGHT = 480;
    public static final int DIAMETER = 10;

    int[] xPositions = {0, 0, 0, 0};  
    int[] speeds = {1, 2, 3, 4};     

    public static void main(String[] args) {
        PApplet.main(TryProcessing);
    }

    @Override
    public void settings() {
        size(WIDTH, HEIGHT);
    }

    @Override
    public void setup() {
    }

    @Override
    public void draw() {
        for (int i = 0; i  xPositions.length; i++) {
            float yPosition = (i + 1)  HEIGHT  (xPositions.length + 1); 
            ellipse(xPositions[i], yPosition, DIAMETER, DIAMETER);        
            xPositions[i] += speeds[i];                                
        }
    }
}