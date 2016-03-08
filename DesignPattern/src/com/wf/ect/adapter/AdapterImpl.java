package com.wf.ect.adapter;

public class AdapterImpl {
 
	OldMp3Player oldPlayer=new OldMp3Player();
	
	public String playOldPlayerVLCMP4(String format){
		
		return oldPlayer.play(format);
	}
}
