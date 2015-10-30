/* *****************************************
 * CSCI205 - Software Engineering and Design
 *
 * Fall 2015
 *
 * Name: Luis Felipe Franco Candeo Tomazini & Anmol Singh
 * Date: Oct 28, 2015
 * Time: 4:18:01 PM
 *
 * Project: csci205_hw03
 * Package: hw03
 * File: AudioViewerClient
 * Description:
 *
 * ****************************************
 */
package hw03;

import java.awt.EventQueue;

/**
 *
 * @author lffct001
 */
public class AudioViewerClient {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {

            @Override
            public void run() {
                AudioViewer frame = new AudioViewer();
                frame.setVisible(true);
            }
        });
    }
}
