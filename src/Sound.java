import java.io.File;

import javax.sound.sampled.*;

public class Sound {
	
		
		public static void hit(){

			try{
				
				File smash = new File("bump.wav");
				
				AudioInputStream audioInputStream = 
						AudioSystem.getAudioInputStream(smash);
				Clip clip = AudioSystem.getClip();
				clip.open(audioInputStream);
				clip.start();
			}
			
			catch(Exception e){
				
			}
			
			
		}
		public static void gameover(){

			try{
				
				File smash = new File("gameover.wav");
				
				AudioInputStream audioInputStream = 
						AudioSystem.getAudioInputStream(smash);
				Clip clip = AudioSystem.getClip();
				clip.open(audioInputStream);
				clip.start();
			}
			
			catch(Exception e){
				
			}
			
			
		}
	
	

}