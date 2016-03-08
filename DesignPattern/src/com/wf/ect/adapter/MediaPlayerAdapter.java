package com.wf.ect.adapter;

public class MediaPlayerAdapter {

	NewVLCMP4Player newPlayer=new NewVLCMP4Player();
	
	
	public String play(String format){
		String formatPlayed;
		if(format.equalsIgnoreCase("MP4") || format.equalsIgnoreCase("VLC") ){
			formatPlayed= newPlayer.play(format);
		}
		else
			formatPlayed="Unsupported Format";
		return formatPlayed;
	}

	public NewVLCMP4Player getNewPlayer() {
		return newPlayer;
	}


	public void setNewPlayer(NewVLCMP4Player newPlayer) {
		this.newPlayer = newPlayer;
	}
}
