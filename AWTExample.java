import java.awt.*;

public class AWTExample {
    public static void main(String[] args) {
        System.out.println("Dev Jayswal \n0901AM221031");
        // Create a frame
        Frame frame = new Frame("AWT Example");
        
        // Create a label
        Label label = new Label("Hello, AWT!");
        
        // Add the label to the frame
        frame.add(label);
        
        // Set frame size and make it visible
        frame.setSize(300, 200);
        frame.setVisible(true);
    }
}
