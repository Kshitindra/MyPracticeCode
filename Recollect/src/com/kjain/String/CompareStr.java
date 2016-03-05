package com.kjain.String;

public class CompareStr {

	public static void main(String[] args) {

		String[] str={"ABbbb","Aabcd","ABCccc","BAccc","Kjain","chintu","Ajmer","Andhra"};
		String temp=null;
		//String[] sorted=new String[str.length];
		for(int i=0;i<str.length;i++)
		{
			for(int j=0;j<str.length;j++)
			{
				if(str[i].compareToIgnoreCase(str[j])<0)
				{
					temp=str[i];
				   	str[i]=str[j];
				   	str[j]=temp;
				}
			}
		}
	
		for(String tempStr: str)
		System.out.println(tempStr);
	}

}
