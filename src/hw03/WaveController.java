/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hw03;

import static hw03.WAVAudioFile.HOME;
import static hw03.WaveUtility.play;
import static hw03.WaveUtility.stop;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JComponent;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

/**
 *
 * @author as062
 */
public class WaveController extends JPanel implements ActionListener {

    private WaveModel theModel;
    private WaveView theView;
    private WaveUtility song;
    private WaveComponents scrollPanel; 

    public WaveController(WaveModel theModel, WaveView theView, WaveComponents scrollPanel) {
        this.theModel = theModel;
        this.theView = theView;
        this.scrollPanel = scrollPanel;
        
        theView.getBtnPlay().addActionListener(this);
        theView.getBtnRewind().addActionListener(this);
        theView.getBtnStop().addActionListener(this);
        theView.getNewOption().addActionListener(this);
        theView.getOpenOption().addActionListener(this);
        theView.getExitOption().addActionListener(this);
        theView.getButtonMinus().addActionListener(this);
        theView.getButtonPlus().addActionListener(this);
        theView.getDrawArea().setViewportView(this.scrollPanel);
        
        this.setSize(WIDTH, HEIGHT);

        JScrollPane panel = new JScrollPane();
        this.add(panel);
        this.validate();
        this.repaint();
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == theView.getBtnPlay()) {
            if (theModel.isPlay_Button() == true) {
                theModel.setPlay_Button(false);
                play(WaveUtility.thePath);
            }
        }

        if (e.getSource() == theView.getBtnRewind()) {
            if (theModel.isPlay_Button() == false) {
                theModel.setPlay_Button(true);
            }
        }

        if (e.getSource() == theView.getBtnStop()) {
            if (theModel.isPlay_Button() == true) {
                stop(WaveUtility.thePath);
                theModel.setPlay_Button(true);
            }
        }

        if (e.getSource() == theView.getOpenOption()) {
            song.getFile();
        }

        if (e.getSource() == theView.getExitOption()) {
            WaveUtility.displayExitMessage();
            theView.dispose();
        }
        if (e.getSource() == theView.getNewOption()) {
            theView.getNewFile().setVisible(true);
            try {
                WaveUtility waveSong = new WaveUtility();
                if (e.getSource() == theView.getBtnOK()) {
                    System.out.println("here");
                    waveSong.generateWave(Double.parseDouble(theView.getTxtDuration().getText()), Float.parseFloat(theView.getTxtSampleRate().getText()), Double.parseDouble(theView.getTxtFrequency().getText()));
                    WaveUtility.convertToWAV("wave.wav");
                    waveSong.chooseGenerated(HOME + "/wave.wav");
                    System.out.println("hey");
                    theView.getNewFile().setVisible(false);

                }

            } catch (IOException ex) {
                Logger.getLogger(WaveController.class.getName()).log(
                        Level.SEVERE,
                        null, ex);
            }
        }
        
        if (e.getSource() == theView.getButtonMinus()) {
            System.out.println("Zoom out");
            scrollPanel.setSamplesPerPixel((int)(0.8*scrollPanel.getSamplePerPixel()));
            scrollPanel.repaint();
                    }
        if (e.getSource() == theView.getButtonPlus()) {
            System.out.println("Zoom in");
            scrollPanel.setSamplesPerPixel((int)(1.2*scrollPanel.getSamplePerPixel()));             
            scrollPanel.repaint();
        }    
    }
}
