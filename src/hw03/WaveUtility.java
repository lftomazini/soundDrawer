/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hw03;

import static hw03.WAVAudioFile.CHANNELS;
import static hw03.WAVAudioFile.IS_BIG_ENDIAN;
import static hw03.WAVAudioFile.NUMBER_OF_BITS;
import static hw03.WAVAudioFile.SAMPLE_RATE;
import static hw03.WAVAudioFile.SIGNED;
import java.awt.HeadlessException;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.nio.file.Paths;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.sound.sampled.AudioFormat;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.sound.sampled.DataLine;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.Mixer;
import javax.sound.sampled.UnsupportedAudioFileException;
import javax.swing.JOptionPane;
import sun.audio.AudioPlayer;
import sun.audio.AudioStream;

/**
 *
 * @author as062
 */
public class WaveUtility extends Waveforms {
    public static WAVAudioFile song;

    public WaveUtility() throws IOException {
        super();
        try {
            song = new WAVAudioFile();
        } catch (IOException e) {
            System.out.println("error");
        }
    }

    /**
     * @see -
     * http://stackoverflow.com/questions/6057530/how-to-convert-the-byte-array-into-an-integer-array
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
    public static void play(String path) {
        try {
//            InputStream in = new FileInputStream(path);
//            AudioStream sample = new AudioStream(in);
//            AudioPlayer.player.start(sample);
//            Scanner scanner = new Scanner(System.in);

            File file = new File(path);
            AudioInputStream ais;
            AudioInputStream finalInputStream = null;
            ais = AudioSystem.getAudioInputStream(file);

            DataLine.Info info;
            info = new DataLine.Info(Clip.class, ais.getFormat());
            Mixer mixer = AudioSystem.getMixer(null);
            Clip clip = (Clip) mixer.getLine(info);
            clip.open(ais);
            //            clip.open(audioInStream);
            clip.start();
            try {
                while (!clip.isRunning()) {
                    Thread.sleep(10);
                }
                while (clip.isRunning()) {
                    Thread.sleep(10);
                }
            } catch (InterruptedException interruptedException) {
            }
            clip.close();
        } catch (FileNotFoundException f) {
            System.out.println("Invalid file path");
        } catch (IOException e) {
            System.out.println("IOException occurred");
        } catch (UnsupportedAudioFileException ex) {
            Logger.getLogger(WaveUtility.class.getName()).log(Level.SEVERE, null,
                                                              ex);
        } catch (LineUnavailableException ex) {
            Logger.getLogger(WaveUtility.class.getName()).log(Level.SEVERE, null,
                                                              ex);
        }
    }

    public static void stop(String path) {
        try {
            InputStream in = new FileInputStream(path);
            AudioStream sample = new AudioStream(in);
            AudioPlayer.player.stop(sample);

        } catch (FileNotFoundException f) {
            System.out.println("Invalid file path");
        } catch (IOException e) {
            System.out.println("IOException occurred");
        }

    }

    public static void displayExitMessage() {
        int sFinal = JOptionPane.showConfirmDialog(null,
                                                   "Exiting the program",
                                                   "Goodbye!",
                                                   JOptionPane.PLAIN_MESSAGE,
                                                   0, null);
    }

    public void generateWave(double duration, float frequency,
                             float amplitude) {
        try {
            double twoPiF = 2
                            * Math.PI
                            * frequency;
            byte[] bytes
                   = new byte[(int) (duration
                                     * 2 * SAMPLE_RATE)];
            for (int i = 0; i < bytes.length; i++) {
                double time = i / SAMPLE_RATE;
                bytes[i] = (byte) (amplitude
                                   * Math.sin(twoPiF
                                              * time));

                InputStream buffer = new ByteArrayInputStream(bytes);
                this.aFormat = new AudioFormat((float) SAMPLE_RATE,
                                               NUMBER_OF_BITS,
                                               CHANNELS,
                                               SIGNED, IS_BIG_ENDIAN);
                this.aIS = new AudioInputStream(buffer, this.getAFormat(),
                                                bytes.length);
                buffer.close();
            }
        } catch (IOException e) {
            System.out.println("IOException occurred");
        }
    }

    public void chooseFile() {
        try {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Type the file location");
            song.s_path = scanner.next();
            song.path = Paths.get(s_path);
            song.bytes = this.WAVtoByte();
        } catch (HeadlessException e) {
            System.out.println("Headless exception occurred here");
        }
    }
}
