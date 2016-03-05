package com.kjain.system;

import java.io.IOException;

import com.kjain.recollect.VarArgs;
import com.kjain.thread.CallMe;

public class MainSystem extends VarArgs {

	public static void main(String[] args) {
		
		
		Runtime r=Runtime.getRuntime();
		try {
			//Process p=r.exec("notepad");
			ProcessBuilder pb=new ProcessBuilder("notepad","kjain.txt");
			pb.start();
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("current directory "+System.getProperty("user.dir"));
		
	}
	
	 private void callMe()
	{
		 addInt(23);
	}

}
