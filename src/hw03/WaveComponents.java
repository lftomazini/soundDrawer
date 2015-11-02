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
    public WaveUtility song;
    
    public final double BORDER = 0.8;
    public final double SPACE = 0.01;
    
    public WaveComponents(WaveUtility obj, int height, int width) throws IOException{
        song = obj;
        samplesPerPixel = song.getBytes().length/width;
        WaveUtility song = new WaveUtility();
    }
    
    public int getSamplePerPixel() {
        samplesPerPixel = song.getBytes().length/this.getWidth();
        return samplesPerPixel;
        }

    public void setSamplesPerPixel(int sample) {
        samplesPerPixel = sample;
    }
    
    
    @Override
    public void paintComponent(Graphics g) {
        
        int[] array = WaveUtility.convertToIntArray(song.WAVtoByte());
        //int[] array = {82, 73, 70, 70, 70, 32, 19, 0, 87, 65, 86, 69, 102, 109, 116, 32, 16, 0, 0, 0, 1, 0, 2, 0, 68, -84, 0, 0, 16, -79, 2, 0, 4, 0, 16, 0, 76, 73, 83, 84, 26, 0, 0, 0, 73, 78, 70, 79, 73, 83, 70, 84, 14, 0, 0, 0, 76, 97, 118, 102, 53, 54, 46, 52, 48, 46, 49, 48, 49, 0, 100, 97, 116, 97, 0, 32, 19, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
        super.paintComponent(g);
        g.setColor(Color.BLACK);
        g.drawLine(0, getHeight() / 2, getWidth(), getHeight() / 2);
        for (int i = 0; i < 100; i += samplesPerPixel) {
            g.drawLine((int) (i * SPACE * (this.getWidth())),
                       (int) ((this.getHeight() / 2) - array[i] * SPACE / 2 * (this.getHeight() * BORDER)),
                       (int) (i * SPACE * (this.getWidth())),
                       (int) ((this.getHeight() / 2) + array[i] * SPACE / 2 * (this.getHeight() * BORDER)));
        }
    }
}

