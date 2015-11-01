/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hw03;

import javax.swing.BoundedRangeModel;
import javax.swing.DefaultBoundedRangeModel;
/**
 *
 * @author as062
 */
public class WaveModel {
    private BoundedRangeModel tempRange;
    private boolean Play_Button;
    private boolean Stop_Button;
    private boolean Rewind_Button;
    
    public WaveModel() {
        this.Play_Button = true;
        this.Stop_Button = false;
        this.Rewind_Button = false;
        this.tempRange = new DefaultBoundedRangeModel(0, -100, 100, 200);
    }

    public BoundedRangeModel getTempRange() {
        return tempRange;
    }

    public void setTempRange(BoundedRangeModel tempRange) {
        this.tempRange = tempRange;
    }

    public boolean isPlay_Button() {
        return Play_Button;
    }

    public void setPlay_Button(boolean Play_Button) {
        this.Play_Button = Play_Button;
    }

    public boolean isStop_Button() {
        return Stop_Button;
    }

    public void setStop_Button(boolean Stop_Button) {
        this.Stop_Button = Stop_Button;
    }

    public boolean isRewind_Button() {
        return Rewind_Button;
    }

    public void setRewind_Button(boolean Rewind_Button) {
        this.Rewind_Button = Rewind_Button;
    }
}
