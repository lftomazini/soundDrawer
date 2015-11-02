/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hw03;

//
import javax.swing.BoundedRangeModel;
import javax.swing.DefaultBoundedRangeModel;
/**
 *
 * @author as062
 */
public class WaveModel {
    private byte[] array;
    private boolean Play_Button;
    
    /**
     *
     */
    public WaveModel() {
        this.array = null;
        this.Play_Button = true;
    }

    /**
     *
     * @param array: array of sound bytes
     */
    public void setBytes(byte[] array) {
        this.array = array;
    }

    /**
     *
     * @return byteArray: array of sound bytes
     */
    public byte[] getBytes() {
        return this.array;
    }

    /**
     *
     * @return Play_Button : boolean value
     */
    public boolean isPlay_Button() {
        return Play_Button;
    }

    /**
     *
     * @param Play_Button : a boolean value
     */
    public void setPlay_Button(boolean Play_Button) {
        this.Play_Button = Play_Button;
    }

}
