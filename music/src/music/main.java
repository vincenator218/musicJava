package music;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String cheminAcces="The Pirate Shanty.wav";
		PlayMusic music = new PlayMusic();
		music.playMusic(cheminAcces,1,15);
		try {
			Thread.sleep(10000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		music.playMusic(cheminAcces, 2,15);
		
	}

}
