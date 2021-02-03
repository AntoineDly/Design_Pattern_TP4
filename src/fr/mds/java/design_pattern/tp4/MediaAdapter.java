package fr.mds.java.design_pattern.tp4;

public class MediaAdapter implements MediaPlayer {

	public String audioType = "mp3";
	private AudioPlayer AudioPlayer = new AudioPlayer();
	private Mp4Player Mp4Player = new Mp4Player();
	private VlcPlayer VlcPlayer = new VlcPlayer();
	
	
	
	public MediaAdapter(String audioType) {
		this.audioType = audioType;
	}



	@Override
	  public void play(String audioType, String fileName) {
	    switch (audioType) {
	    case "mp3":
	    	AudioPlayer.play(audioType, fileName);
	      break;

	    case "mp4":
	    	Mp4Player.play(audioType, fileName);
	      break;
	    
	    case "vlc":
		  	VlcPlayer.play(audioType, fileName);
	      break;
	    }
	  }
}
