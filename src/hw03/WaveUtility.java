/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hw03_practice;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Scanner;
import sun.audio.AudioPlayer;
import sun.audio.AudioStream;

/**
 *
 * @author as062
 */
public class WaveUtility {
    
    /**
     * @see - http://stackoverflow.com/questions/6057530/how-to-convert-the-byte-array-into-an-integer-array
     * 
     * @param input: byte array
     * @return - result: integer array  
     */
    public static int[] convertToIntArray(byte[] input) {
        int[] result = new int[input.length];
        for (int i = 0; i < input.length; i++) {
            result[i] = input[i] & 0xff; // Range 0 to 255, not -128 to 127
        }
        return result;
    }
    
    /**
     * 
     * @param path: Path of the file 
     */
    public static void play(String path){
        try {
            InputStream in = new FileInputStream(path);
            AudioStream sample = new AudioStream(in);
            AudioPlayer.player.start(sample);
            Scanner scanner = new Scanner(System.in);

            System.out.println("Press any key to go back to menu");
            if (scanner.hasNext()) {
                AudioPlayer.player.stop(sample);
            }
        } catch (FileNotFoundException f) {
            System.out.println("Invalid file path");
        } catch (IOException e) {
            System.out.println("IOException occurred");
        }
    }
    
    
}

