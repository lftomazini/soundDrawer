package hw03;

import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 *
 * @author lffct001
 */
public class AudioViewer extends JFrame {
    int[] array = {82, 73, 70, 70, 70, 32, 19, 0, 87, 65, 86, 69, 102, 109, 116, 32, 16, 0, 0, 0, 1, 0, 2, 0, 68, -84, 0, 0, 16, -79, 2, 0, 4, 0, 16, 0, 76, 73, 83, 84, 26, 0, 0, 0, 73, 78, 70, 79, 73, 83, 70, 84, 14, 0, 0, 0, 76, 97, 118, 102, 53, 54, 46, 52, 48, 46, 49, 48, 49, 0, 100, 97, 116, 97, 0, 32, 19, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};

    public int HEIGHT = maximum(array) * 4;
    public int WIDTH = array.length;

    public AudioViewer() {
        this.setTitle("Points");
        this.setSize(WIDTH, HEIGHT);
//        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel panel = new Draw();
        this.add(panel);
        this.validate();
        this.repaint();
    }

    public int maximum(int[] a) {
        int max = a[0];
        for (int counter = 1; counter < a.length; counter++) {
            if (a[counter] > max) {
                max = a[counter];
            }
        }
        return max;
    }

    class Draw extends JPanel {
        public double BORDER = 0.8;
        public double SPACE = 0.01;

        @Override
        protected void paintComponent(Graphics g) {
            int[] array = {82, 73, 70, 70, 70, 32, 19, 0, 87, 65, 86, 69, 102, 109, 116, 32, 16, 0, 0, 0, 1, 0, 2, 0, 68, -84, 0, 0, 16, -79, 2, 0, 4, 0, 16, 0, 76, 73, 83, 84, 26, 0, 0, 0, 73, 78, 70, 79, 73, 83, 70, 84, 14, 0, 0, 0, 76, 97, 118, 102, 53, 54, 46, 52, 48, 46, 49, 48, 49, 0, 100, 97, 116, 97, 0, 32, 19, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
            super.paintComponent(g);
            g.setColor(Color.BLACK);
            for (int i = 0; i < 100; i++) {
                g.drawLine((int) (i * SPACE * (this.getWidth())),
                           (int) ((this.getHeight() / 2) - array[i] * SPACE / 2 * (this.getHeight() * BORDER)),
                           (int) (i * SPACE * (this.getWidth())),
                           (int) ((this.getHeight() / 2) + array[i] * SPACE / 2 * (this.getHeight() * BORDER)));
            }
        }
    }
}
