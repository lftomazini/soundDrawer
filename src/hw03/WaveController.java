/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hw03;

import static hw03.WaveUtility.play;
import static hw03.WaveUtility.stop;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JPanel;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

/**
 *
 * @author as062
 */
public class WaveController extends JPanel implements ActionListener,
                                                      ChangeListener {

    private WaveModel theModel;
    private WaveView theView;

    int[] array = {82, 73, 70, 70, 70, 32, 19, 0, 87, 65, 86, 69, 102, 109, 116, 32, 16, 0, 0, 0, 1, 0, 2, 0, 68, -84, 0, 0, 16, -79, 2, 0, 4, 0, 16, 0, 76, 73, 83, 84, 26, 0, 0, 0, 73, 78, 70, 79, 73, 83, 70, 84, 14, 0, 0, 0, 76, 97, 118, 102, 53, 54, 46, 52, 48, 46, 49, 48, 49, 0, 100, 97, 116, 97, 0, 32, 19, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};

    public int HEIGHT = maximum(array) * 4;
    public int WIDTH = array.length;

    public WaveController(WaveModel theModel, WaveView theView) {
        this.theModel = theModel;
        this.theView = theView;
//        updateViewFromModel();
        theView.getBtnPlay().addActionListener(this);
        theView.getBtnRewind().addActionListener(this);
        theView.getBtnStop().addActionListener(this);
        theView.getSliderZoom().addChangeListener(this);
        theView.getNewOption().addActionListener(this);
        theView.getOpenOption().addActionListener(this);
        theView.getExitOption().addActionListener(this);
//        theView.getScrollView().addChangeListener(this);

        this.setSize(WIDTH, HEIGHT);

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

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == theView.getBtnPlay()) {
            play("/home/accounts/student/l/lffct001/Desktop/john_cena.wav");
        }

        if (e.getSource() == theView.getBtnRewind()) {
        }

        if (e.getSource() == theView.getBtnStop()) {
            stop("/home/accounts/student/l/lffct001/Desktop/john_cena.wav");
        }

        if (e.getSource() == theView.getOpenOption()) {
            WaveUtility.song.chooseFile();
        }

        if (e.getSource() == theView.getExitOption()) {
            WaveUtility.displayExitMessage();
            theView.dispose();
        }
        if (e.getSource() == theView.getNewOption()) {
            WaveUtility.song.chooseFile();
        }
    }

    @Override
    public void stateChanged(ChangeEvent e
    ) {
        if (e.getSource() == theView.getSliderZoom()) {
        }

//        if (e.getSource() == theView.getScrollView()) {
//        }
    }
}

class Draw extends JPanel {
    public double BORDER = 0.8;
    public double SPACE = 0.01;

    @Override
    protected void paintComponent(Graphics g) {
        int[] array = {82, 73, 70, 70, 70, 32, 19, 0, 87, 65, 86, 69, 102, 109, 116, 32, 16, 0, 0, 0, 1, 0, 2, 0, 68, -84, 0, 0, 16, -79, 2, 0, 4, 0, 16, 0, 76, 73, 83, 84, 26, 0, 0, 0, 73, 78, 70, 79, 73, 83, 70, 84, 14, 0, 0, 0, 76, 97, 118, 102, 53, 54, 46, 52, 48, 46, 49, 48, 49, 0, 100, 97, 116, 97, 0, 32, 19, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
        super.paintComponent(g);
        g.setColor(Color.BLACK);
        g.drawLine(0, getHeight() / 2, getWidth(), getHeight() / 2);
        for (int i = 0; i < 100; i++) {
            g.drawLine((int) (i * SPACE * (this.getWidth())),
                       (int) ((this.getHeight() / 2) - array[i] * SPACE / 2 * (this.getHeight() * BORDER)),
                       (int) (i * SPACE * (this.getWidth())),
                       (int) ((this.getHeight() / 2) + array[i] * SPACE / 2 * (this.getHeight() * BORDER)));
        }
    }
}
