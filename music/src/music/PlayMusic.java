package music;


import java.io.File;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.sound.sampled.FloatControl;
import javax.swing.JOptionPane;

public class PlayMusic {
	void playMusic(String musicLocation,int play,float volume) {
		try{
			File musicPath = new File(musicLocation);
			AudioInputStream audioInput = AudioSystem.getAudioInputStream(musicPath);
			Clip clip = AudioSystem.getClip();
			clip.open(audioInput);
			if(play==1) {
			clip.start();
			FloatControl gainControl = 
			         (FloatControl) clip.getControl(FloatControl.Type.MASTER_GAIN);
			     gainControl.setValue(-volume); // controle de volume baise par le nombre inscrit de decibel
			//clip.loop(Clip.LOOP_CONTINUOUSLY);    //pour jouer clip en boucle
			//JOptionPane.showMessageDialog(null, "press ok to stop"); //pour mettre un prompt pour arreter metre if play 2 en commentaire
			}
			if(play ==2) {
			clip.stop();
			}
			
		}
			
		catch(Exception ex)
		{
			ex.printStackTrace();
		}
}
	
}
//main devrais resembler a sa
//	String cheminAcces="The Pirate Shanty.wav";//placer le file en .wav dans le premier fichier du projet
//PlayMusic music = new PlayMusic();
//music.playMusic(cheminAcces,1); //mettre le int a 2 pour stop