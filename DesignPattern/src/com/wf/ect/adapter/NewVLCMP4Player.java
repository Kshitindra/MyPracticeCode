package com.wf.ect.adapter;

public class NewVLCMP4Player {

public String play(String format){

	String formatPlayed;
	if(format.equalsIgnoreCase("MP3"))
		formatPlayed="Playing MP3 in new Player";
	else if(format.equalsIgnoreCase("MP4"))
		formatPlayed= "Playing MP4 in new Player";
	else if(format.equalsIgnoreCase("VLC"))
		formatPlayed="Playing VLC in new Player";
	else 
		formatPlayed="Unsupported format in New Player";
	return formatPlayed;
}
}
