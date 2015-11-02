/* *****************************************
 * CSCI205 - Software Engineering and Design
 *
 * Fall 2015
 *
 * Name: Luis Felipe Franco Candeo Tomazini & Anmol Singh
 * Date: Nov 1, 2015
 * Time: 9:11:25 PM
 *
 * Project: csci205_hw03
 * Package: hw03
 * File: test
 * Description:
 *
 * ****************************************
 */
package hw03;

import java.io.IOException;
import javax.swing.JFrame;
import javax.swing.JScrollPane;

/**
 *
 * @author as062
 */
public class test extends JFrame{
    public static void main(String[] arg) throws IOException {
        JFrame frame = new JFrame();
        frame.setSize(1000, 1000);
        WaveUtility song = new WaveUtility();
        song.chooseFile();
        byte[] array = song.WAVtoByte();
        WaveComponents wave = new WaveComponents(song, 1000, 1000);
        JScrollPane jsp = new JScrollPane();
        jsp.setViewportView(wave);
        frame.add(jsp);
        frame.add(wave);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(EXIT_ON_CLOSE);
    }
}
