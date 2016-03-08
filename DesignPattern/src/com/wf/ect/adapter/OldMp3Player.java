package com.wf.ect.adapter;

public class OldMp3Player {

	MediaPlayerAdapter mediaPlayerAdapter=new MediaPlayerAdapter();
	public String play(String type){
		String formatPlayed;
		if(type.equalsIgnoreCase("MP3"))
			formatPlayed="Playing MP3 in Old Player";
		else if(type.equalsIgnoreCase("MP4")|| type.equalsIgnoreCase("VLC")){
			formatPlayed=mediaPlayerAdapter.play(type);
		}
			
		else 
			formatPlayed="Unsupported Format in Old Player";
		return formatPlayed;
	}	
	
	
}
