
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.swing.*;
import java.io.File;

    public class MusicPlayer {

        void playMusic(String musicLocation) {

            try {

                File musicPath = new File(musicLocation);

                if(musicPath.exists()) {

                    System.out.println("Successful");

                    AudioInputStream audioInput = AudioSystem.getAudioInputStream(musicPath);
                    Clip clip = AudioSystem.getClip();
                    clip.open(audioInput);
                    clip.start();

                    /*
                    clip.loop(Clip.LOOP_CONTINUOUSLY);

                    JOptionPane.showMessageDialog(null, "Hit okay to pause");
                    long clipTimePosition = clip.getMicrosecondPosition();
                    clip.stop();

                    JOptionPane.showMessageDialog(null, "Hit okay to resume");
                    clip.setMicrosecondPosition(clipTimePosition);
                    clip.start();

                    JOptionPane.showMessageDialog(null, "Hit okay to stop");
                    */
                }
                else {
                    System.out.println("Doesn't exist");
                }
            }
            catch (Exception e) {

                JOptionPane.showMessageDialog(null, "Error!");
            }
        }
    }




