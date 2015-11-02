/* *****************************************
 * CSCI205 - Software Engineering and Design
 *
 * Fall 2015
 *
 * Name: Luis Felipe Franco Candeo Tomazini & Anmol Singh
 * Date: Nov 1, 2015
 * Time: 4:45:36 PM
 *
 * Project: csci205_hw03
 * Package: hw03
 * File: WaveComponents
 * Description:
 *
 * ****************************************
 */
package hw03;

import java.awt.Color;
import java.awt.Graphics;
import java.io.IOException;
import javax.swing.JComponent;

/**
 *
 * @author as062
 */
public class WaveComponents extends JComponent {
    
    public int samplesPerPixel;
    public int width;
    public int height;
    public WaveUtility song;
    
    public final double BORDER = 0.8;
    public final double SPACE = 0.01;
    
    public WaveComponents(WaveUtility obj, int height, int width) throws IOException{
        this.song = obj;
        this.samplesPerPixel = song.getBytes().length/width;
        this.width = width;
        this.height = height;
    }
        
    public int getSamplePerPixel() {
        return samplesPerPixel;
        }

    public void setSamplesPerPixel(int sample) {
        samplesPerPixel = sample;
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
    public void paintComponent(Graphics g) {
        
        byte[] array = song.WAVtoByte();
        for (int a = 0; a < 50; a ++) {
            System.out.println(array[a]);
        }
        super.paintComponent(g);
        g.setColor(Color.BLACK);
        g.drawLine(0, getHeight() / 2, getWidth(), getHeight() / 2);
        for (int i = 0; i < array.length - samplesPerPixel; i += samplesPerPixel) {
            g.drawLine((int) (i * SPACE * (this.width)),
                       (int) ((this.height / 2) - array[i] * SPACE / 2 * (this.height * BORDER)),
                       (int) (i * SPACE * (this.width)),
                       (int) ((this.height / 2) + array[i] * SPACE / 2 * (this.height * BORDER)));
        }
    }
}

