import java.util.Scanner;
import javax.sound.sampled.*;
import java.io.File;
import java.io.IOException;


public class Audio {
    public static void main(String[] args) throws UnsupportedAudioFileException, LineUnavailableException, IOException {
        Scanner sc = new Scanner(System.in);

        File file = new File("sunflower-street-drumloop-85bpm-163900.wav");
        AudioInputStream audioStream = AudioSystem.getAudioInputStream(file);
        Clip clip = AudioSystem.getClip();
        clip.open(audioStream);

        String response = "";
        while(!response.equals("Q")){
            System.out.println("P = Play  S = Stop  R = Reset  Q = Quit");
            System.out.println("Enter your choice: ");

            response = sc.next();
            response = response.toUpperCase();
            switch(response){
                case ("P"): 
                    clip.start();
                    break;
                case ("S"):
                    clip.stop();
                    break;
                case ("R"):
                    clip.setMicrosecondPosition(0);
                    break;
                case ("Q"):
                    clip.close();
                    break;
                default:
                    System.out.println("Not a valid response, choose P,Q,R or S");
            }
        }

        System.out.println("Byeee :3 :) !!!");


    }

}
