import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseWheelEvent;
import java.util.ArrayList;
import java.util.Random;

public class BubllePixelPanel extends JPanel {
    Random r = new Random();
    ArrayList<Bubble> bubbleList;
    int size = 25;

    public BubllePixelPanel() {
        Color color;
        color = new Color(r.nextInt(256),
                r.nextInt(256),
                r.nextInt(256));
        bubbleList = new ArrayList<Bubble>();
        setBackground(Color.BLACK);
        //testBubbles();
        addMouseListener(new bubbleListener());
        addMouseMotionListener(new bubbleListener());
        addMouseWheelListener(new bubbleListener());
    }

    public void testBubbles() {
        for (int i = 0; i < 10000; i++) {
            int x = r.nextInt(1600);
            int y = r.nextInt(900);
            int size = r.nextInt(50);
            bubbleList.add(new Bubble(x, y, size));

        }
        repaint();
    }

    private class bubbleListener extends MouseAdapter {
        public void mousePressed(MouseEvent e) {
            bubbleList.add(new Bubble(e.getX(), e.getY(), size));
            repaint();
        }

        public void mouseDragged(MouseEvent e) {
            bubbleList.add(new Bubble(e.getX(), e.getY(), size));
            repaint();
        }

        public void mouseWheelMoved(MouseWheelEvent e) {
            if (System.getProperty("os.name").startsWith("Mac")) {
                size += e.getUnitsToScroll();
            } else {
                size -= e.getUnitsToScroll();
            }
        }

    }

    private class Bubble {
        private int x, y, size;
        private Color color;

        public Bubble(int newX, int newY, int newSize) {
            x = (newX / newSize) * newSize + newSize / 2;
            y = (newY / newSize) * newSize + newSize / 2;
            size = newSize;
            color = new Color(r.nextInt(256),
                    r.nextInt(256),
                    r.nextInt(256));


        }

        public void draw(Graphics canvas) {
            canvas.setColor(color);
            canvas.fillRect(x - size / 2, y - size / 2, size, size);
        }

    }

    public void paintComponent(Graphics canvas) {
        super.paintComponent(canvas);
        for (Bubble b : bubbleList) {
            b.draw(canvas);
        }
    }

}