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
//
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Rectangle;
import java.io.IOException;
import javax.swing.JComponent;
import javax.swing.Scrollable;

/**
 *
 * @author as062
 */
public class WaveComponents extends JComponent implements Scrollable  {
    
    /**
     *
     */
    public int samplesPerPixel;

    /**
     *
     */
    public int width;

    /**
     *
     */
    public int height;

    /**
     *
     */
    public byte[] byteArray;
    
    /**
     *
     */
    public final double BORDER = 0.8;

    /**
     *
     */
    public final double SPACE = 0.01;
    
    /**
     * Constructs the WaveCOmponent constructor to draw lines
     * @param byteArray : Array of bytes form the song file
     * @param height : height of the scroll pane
     * @param width :width of the scroll pane
     * @throws IOException
     */
    public WaveComponents(byte[] byteArray, int height, int width) throws IOException{
        this.byteArray = byteArray;
        this.samplesPerPixel = byteArray.length/width;
        this.width = width;
        this.height = height;
    }
        
    /**
     *
     * @return samplesPerPixel
     */
    public int getSamplePerPixel() {
        return samplesPerPixel;
        }

    /**
     *
     * @param sample 
     */
    public void setSamplesPerPixel(int sample) {
        samplesPerPixel = sample;
    }
        
    @Override
    public void paintComponent(Graphics g) {
        
        super.paintComponent(g);
        g.setColor(Color.BLACK);
        g.drawLine(0, getHeight() / 2, getWidth(), getHeight() / 2);
        System.out.println(samplesPerPixel);
        System.out.println(byteArray.length);
        int i=0;
        for (int j = 0; j < byteArray.length - samplesPerPixel; j += samplesPerPixel) {
            g.drawLine((int) (i * SPACE * (this.getWidth())),
                       (int) ((this.getHeight() / 2) - this.byteArray[i] * SPACE / 2 * (this.getHeight() * BORDER)),
                       (int) (i * SPACE * (this.getWidth())),
                       (int) ((this.getHeight() / 2) + this.byteArray[i] * SPACE / 2 * (this.getHeight() * BORDER)));
            i++;
        }
    }

    @Override
    public Dimension getPreferredScrollableViewportSize() {
        return new Dimension(341, 482);
    }

    @Override
    public int getScrollableUnitIncrement(Rectangle visibleRect, int orientation, int direction) {
        return 10;
    }

    @Override
    public int getScrollableBlockIncrement(Rectangle visibleRect, int orientation, int direction) {
        return 10;
    }

    @Override
    public boolean getScrollableTracksViewportWidth() {
        return false;
    }

    @Override
    public boolean getScrollableTracksViewportHeight() {
        return false;
    }
    
    @Override
    public Dimension getPreferredSize() {
        return new Dimension(341, 482);
    }
}

