import java.awt.*;

public class MyAppletRunner {
    public static void main(String[] args) {
        System.out.println("Dev Jayswal \n0901AM221031\nMyAppletRunner.main() called");
        Frame frame = new Frame("My Applet Container");
        MyApplet applet = new MyApplet();
        applet.init();
        frame.add(applet);
        frame.setSize(300, 200);
        frame.setVisible(true);
        applet.start();
    }
}
