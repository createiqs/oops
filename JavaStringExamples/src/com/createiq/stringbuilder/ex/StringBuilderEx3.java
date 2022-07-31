package com.createiq.stringbuilder.ex;

public class StringBuilderEx3 {

	public static void main(String[] args) {
		StringBuilder str1=new StringBuilder("CreateIQ");
		int i=2021;
		str1.insert(8,i);   //inserts int
		System.out.println("after insert: "+str1);//CreateIQ2021
		      
		StringBuilder str2=new StringBuilder("CreateIQ");
		float f=2021.111f;
		str2.insert(8,f);   //inserts float
		System.out.println("after insert: "+str2);//CreateIQ2021.111
		      
		StringBuilder str3=new StringBuilder("CreateIQ");
		double d=1999.1111d;
		str3.insert(8,d);   //inserts double
		System.out.println("after insert: "+str3);//OpenGenus1999.1111
		      
		StringBuilder str4=new StringBuilder("CreateIQ is awesome:");
		boolean b=true;
		str4.insert(20,b);   //inserts boolean
		System.out.println("after insert: "+str4);//CreateIQ is awesome:true
		      
		StringBuilder str5=new StringBuilder("CreateIQ");
		char c='a';
		str5.insert(1,c);   //inserts char
		System.out.println("after insert: "+str5);//CreateIQ
		      
		Object obj="Create";
		StringBuilder str6=new StringBuilder("IQ");
		str6.insert(0,obj);   //inserts object
		System.out.println("after insert: "+str6);//CreateIQ

		CharSequence cs="Welcome ";
		StringBuilder str7=new StringBuilder("to CreateIQ");
		str7.insert(0,cs);   //inserts  CharSequence
		System.out.println("after insert: "+str7);//Welcome to CreateIQ
		
		StringBuilder str8=new StringBuilder("xxxxCreateIQxxxx");
		String new_substring=str8.substring(4,12);
		System.out.println("New Substring : "+new_substring); //CreateIQ
		
		StringBuilder str9=new StringBuilder("CreateIQ");
		String new_sub=str9.toString();
		System.out.println("New string : "+new_sub); //CreateIQ
		System.out.println(new_sub.getClass()); //class java.lang.String
		
		StringBuilder str10=new StringBuilder("CreatXIQ");
		str10.setCharAt(5,'e');
		System.out.println("Changed StringBuilder : "+str10); //CreateIQ
	}

}
