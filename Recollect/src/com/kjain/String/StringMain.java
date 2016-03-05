package com.kjain.String;

import java.io.CharArrayWriter;

public class StringMain {

	public static void main(String[] args) {

		String s="Kshitindra";
				
		//System.out.println(s.charAt(2));
		/*char[] charArray=new char[15];
		charArray[0]='a';
		charArray[1]='b';
		charArray[2]='c';
		charArray[3]='d';
		s.getChars(0, 7, charArray, 4);*/
		byte[] b =s.getBytes();
		String s1=new String(b);
		
		
		
			System.out.println(s1);
		
		
	}
}
