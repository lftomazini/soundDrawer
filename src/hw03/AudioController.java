/* *****************************************
 * CSCI205 - Software Engineering and Design
 *
 * Fall 2015
 *
 * Name: Luis Felipe Franco Candeo Tomazini & Anmol Singh
 * Date: Oct 28, 2015
 * Time: 3:29:07 PM
 *
 * Project: csci205_hw03
 * Package: hw03
 * File: AudioController
 * Description:
 *
 * ****************************************
 */
package hw03;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

/**
 *
 * @author lffct001
 */
public class AudioController implements ActionListener, ChangeListener {
    private AudioModel theModel;
    private NewMainView theView;

    private void updateViewFromModel() {
        System.out.println("TODO");
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == theView.menuSelectionChanged()) {
            theModel.updateViewFromModel();
        }
    }

    @Override
    public void stateChanged(ChangeEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
