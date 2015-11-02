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
    private BoundedRangeModel zoomRange;
    private boolean Play_Button;
    
    public WaveModel() {
        this.Play_Button = true;
        this.zoomRange = new DefaultBoundedRangeModel(0, 100, -100, 100);
    }

    public BoundedRangeModel getTempRange() {
        return zoomRange;
    }

    public void setTempRange(BoundedRangeModel tempRange) {
        this.zoomRange = tempRange;
    }

    public boolean isPlay_Button() {
        return Play_Button;
    }

    public void setPlay_Button(boolean Play_Button) {
        this.Play_Button = Play_Button;
    }

}
