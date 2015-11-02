/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hw03;

import java.awt.Button;
import javax.swing.JButton;
import javax.swing.JMenuItem;
import javax.swing.JScrollBar;
import javax.swing.JScrollPane;
import javax.swing.JSlider;
import javax.swing.SwingWorker;

/**
 *
 * @author as062
 */
public class WaveView extends javax.swing.JFrame {

    private static SwingWorker<Void, String> worker; 
    /**
     * Creates new form Main
     */
    public WaveView() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        y_Axis_0 = new javax.swing.JLabel();
        y_Axis_1 = new javax.swing.JLabel();
        y_Axis_2 = new javax.swing.JLabel();
        y_Axis_3 = new javax.swing.JLabel();
        y_Axis_4 = new javax.swing.JLabel();
        sliderZoom = new javax.swing.JSlider();
        Zoom = new javax.swing.JLabel();
        btnPlay = new java.awt.Button();
        btnStop = new java.awt.Button();
        btnRewind = new java.awt.Button();
        buttonPlus = new javax.swing.JButton();
        buttonMinus = new javax.swing.JButton();
        drawArea = new javax.swing.JScrollPane();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        newOption = new javax.swing.JMenuItem();
        New_Open_Separate = new javax.swing.JPopupMenu.Separator();
        openOptio = new javax.swing.JMenuItem();
        Open_Exit_Separator = new javax.swing.JPopupMenu.Separator();
        exitOption = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Wave");

        y_Axis_0.setText("0.0     -");

        y_Axis_1.setText("0.5     -");

        y_Axis_2.setText("1.0     -");

        y_Axis_3.setText("-0.5    -");

        y_Axis_4.setText("-1.0    -");

        sliderZoom.setMinimum(-100);
        sliderZoom.setValue(0);

        Zoom.setText("Zoom");

        btnPlay.setLabel("Play");

        btnStop.setLabel("Stop");
        btnStop.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnStopActionPerformed(evt);
            }
        });

        btnRewind.setLabel("Rewind");

        buttonPlus.setText("Zoom-in");

        buttonMinus.setText("Zoom-out");

        jMenuBar1.setBackground(new java.awt.Color(120, 120, 120));

        jMenu1.setText("File");

        newOption.setText("New");
        newOption.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                newOptionActionPerformed(evt);
            }
        });
        jMenu1.add(newOption);
        jMenu1.add(New_Open_Separate);

        openOptio.setBackground(new java.awt.Color(190, 130, 150));
        openOptio.setText("Open");
        jMenu1.add(openOptio);
        jMenu1.add(Open_Exit_Separator);

        exitOption.setText("Exit");
        jMenu1.add(exitOption);

        jMenuBar1.add(jMenu1);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(2, 2, 2)
                                        .addComponent(btnPlay, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addComponent(btnStop, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                                .addComponent(buttonPlus)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(buttonMinus)
                                .addGap(121, 121, 121))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(60, 60, 60)
                                .addComponent(Zoom, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(sliderZoom, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(17, 17, 17))))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(y_Axis_3, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(y_Axis_1, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(y_Axis_2, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(y_Axis_4, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(y_Axis_0, javax.swing.GroupLayout.Alignment.TRAILING))
                                .addGap(0, 0, 0))
                            .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(btnRewind, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 70, Short.MAX_VALUE)))
                        .addComponent(drawArea, javax.swing.GroupLayout.PREFERRED_SIZE, 482, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addComponent(y_Axis_2)
                        .addGap(1, 1, 1)
                        .addComponent(btnRewind, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(27, 27, 27)
                        .addComponent(y_Axis_1)
                        .addGap(13, 13, 13)
                        .addComponent(btnPlay, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(21, 21, 21)
                        .addComponent(y_Axis_0)
                        .addGap(13, 13, 13)
                        .addComponent(btnStop, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(y_Axis_3)
                        .addGap(70, 70, 70)
                        .addComponent(y_Axis_4))
                    .addComponent(drawArea, javax.swing.GroupLayout.PREFERRED_SIZE, 341, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(14, 14, 14)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(buttonPlus)
                            .addComponent(buttonMinus))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 15, Short.MAX_VALUE)
                        .addComponent(sliderZoom, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(Zoom)))
                .addGap(0, 0, 0))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void newOptionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_newOptionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_newOptionActionPerformed

    private void btnStopActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnStopActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnStopActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(WaveView.class.getName()).log(
                    java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(WaveView.class.getName()).log(
                    java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(WaveView.class.getName()).log(
                    java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(WaveView.class.getName()).log(
                    java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                worker = new  <Void, String>(){

                    /**
                     * @see - https://www.youtube.com/watch?v=qbrE6idMsWU
                     * @return - null
                     * @throws Exception 
                     */
                    @Override
                    protected Void doInBackground() throws Exception {
                        //Thread.sleep(2000);
                        return null;
                    }
                    
                    @Override 
                    protected void done() {
                    }
                };
                worker.execute();
                
                new WaveView().setVisible(true);
            }
        });
    }

    public JMenuItem getExitOption() {
        return exitOption;
    }

    public JMenuItem getNewOption() {
        return newOption;
    }

    public JMenuItem getOpenOption() {
        return openOptio;
    }

    public JButton getButtonMinus() {
        return buttonMinus;
    }

    public JButton getButtonPlus() {
        return buttonPlus;
    }

    public JScrollPane getDrawArea() {
        return drawArea;
    }

    public Button getBtnPlay() {
        return btnPlay;
    }

    public Button getBtnRewind() {
        return btnRewind;
    }

    public Button getBtnStop() {
        return btnStop;
    }

//    public JScrollBar getScrollView() {
//        return scrollView;
//    }

    public JSlider getSliderZoom() {
        return sliderZoom;
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPopupMenu.Separator New_Open_Separate;
    private javax.swing.JPopupMenu.Separator Open_Exit_Separator;
    private javax.swing.JLabel Zoom;
    private java.awt.Button btnPlay;
    private java.awt.Button btnRewind;
    private java.awt.Button btnStop;
    private javax.swing.JButton buttonMinus;
    private javax.swing.JButton buttonPlus;
    private javax.swing.JScrollPane drawArea;
    private javax.swing.JMenuItem exitOption;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem newOption;
    private javax.swing.JMenuItem openOptio;
    private javax.swing.JSlider sliderZoom;
    private javax.swing.JLabel y_Axis_0;
    private javax.swing.JLabel y_Axis_1;
    private javax.swing.JLabel y_Axis_2;
    private javax.swing.JLabel y_Axis_3;
    private javax.swing.JLabel y_Axis_4;
    // End of variables declaration//GEN-END:variables
}