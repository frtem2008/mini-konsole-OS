import javax.swing.*;
import java.io.FileNotFoundException;
import java.io.IOException;

public class BubllePixelDraw extends JFrame {

    public static void run() throws InterruptedException, IOException {
        begin();
        Main.Admin();
    }

    public static void begin() throws InterruptedException {
        JFrame frame = new JFrame("Графический редактор 1.0");
        frame.getContentPane().add(new BubllePixelPanel());
        frame.setSize(new java.awt.Dimension(1920, 1080));
        frame.setVisible(true);

    }

}
