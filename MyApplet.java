import java.applet.Applet;
import java.awt.*;

@SuppressWarnings("removal")
public class MyApplet extends Applet {
    public void init() {
        System.out.println("Init method called");
    }

    public void start() {
        System.out.println("Start method called");
    }

    public void paint(Graphics g) {
        g.drawString("Hello, Applet!", 20, 20);
    }

    public void stop() {
        System.out.println("Stop method called");
    }

    public void destroy() {
        System.out.println("Destroy method called");
    }
}
