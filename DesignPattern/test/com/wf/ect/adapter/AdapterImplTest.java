package com.wf.ect.adapter;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class AdapterImplTest {

	AdapterImpl adapterImpl;
	
	
	@Test
	public void testPlayOldPlayerVLCMP4ForMP3(){
		String formatPlayed;
		formatPlayed=adapterImpl.playOldPlayerVLCMP4("MP3");
		assertEquals("Playing MP3 in Old Player", formatPlayed);
	}
	
	@Test
	public void testPlayOldPlayerVLCMP4ForMP4(){
		String formatPlayed;
		formatPlayed=adapterImpl.playOldPlayerVLCMP4("MP4");
		assertEquals("Playing MP4 in new Player", formatPlayed);
	}
	
	@Test
	public void testPlayOldPlayerVLCMP4ForVLC(){
		String formatPlayed;
		formatPlayed=adapterImpl.playOldPlayerVLCMP4("VLC");
		assertEquals("Playing VLC in new Player", formatPlayed);
	}
	
	@Before
	public void setUp() throws Exception {
		 adapterImpl=new AdapterImpl();
	}

	@Test
	public void test() {
		assertNotNull(adapterImpl);
	}
	

}
