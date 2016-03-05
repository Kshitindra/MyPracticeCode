package com.kjain.IO;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;

public class FileOperations {

	public static void main(String[] args) throws IOException {
		//C:\Kshitin
		try {
			FileInputStream fis= new FileInputStream(new File("C:\\Kshitin\\kjain.txt"));
			FileOutputStream fw= new FileOutputStream(new File("C:\\Kshitin\\kjain2.txt"));
			int i=-1;
			do{
			try {
				 i=fis.read();
				char c=(char)i;
				if(i!=-1){
				fw.write(i);
				
				System.out.println(c);
				}
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			}while(i!=-1);
			fis.close();
			fw.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		

	}

}
