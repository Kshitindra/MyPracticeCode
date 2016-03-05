package com.kjain.IO;

import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class BasicOperation {

	public static void main(String args[])
	{
		BufferedReader br= new BufferedReader(new InputStreamReader(System.in)); 
		String c="";

			do{
			try {
				 c=br.readLine();
				 if(c.equals("STOP"))
					 System.out.println("STOP requested");
				System.out.println("You typed: "+c);
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
				
		}while(!(c.equals("STOP")));
			
			
	}
}
