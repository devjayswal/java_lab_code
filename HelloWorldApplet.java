import java.applet.Applet;
import java.awt.*;

public class HelloWorldApplet extends Applet {
    public void paint(Graphics g) {
        g.drawString("Hello Java", 20, 20);
    }
}
