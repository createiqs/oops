package com.createiq.stringbuilder.ex;

public class StringBuilderDemo {

	public static void diffBwBufferAndBuilder() {
		long startTime = System.currentTimeMillis();

		StringBuffer buffer = new StringBuffer("Java");
		for (int i = 0; i < 100000; i++) {
			buffer.append(" Programming");
		}

		System.out.println("Time taken by String Buffer: " + (System.currentTimeMillis() - startTime) + " ms");

		startTime = System.currentTimeMillis();

		StringBuilder builder = new StringBuilder("JAVA");
		for (int i = 0; i < 100000; i++) {
			builder.append(" Programming");
		}

		System.out.println("Time taken by String Builder: " + (System.currentTimeMillis() - startTime) + " ms");

	}

	public static void deleteWithBuilder() {
		StringBuilder stringBuilder = new StringBuilder("Abdul quit drinking alcohol");

		// The last index = 19-1 = 18
		StringBuilder builder = stringBuilder.delete(11, 19);

		System.out.println(builder.toString());

	}

	public static void replaceWithBulder() {
		StringBuilder stringBuilder = new StringBuilder("The car broke down on a hill");

		// The last index = 7-1 = 6
		StringBuilder builder = stringBuilder.replace(4, 7, "bike");

		System.out.println(builder.toString());
	}
	
	public static void increaseCapacity() {
		  StringBuilder first = new StringBuilder();
	      System.out.println("Default Capacity: "+first.capacity());
	      //Capacity increase by (16(default capacity)+1)*2=34
	      first.append("aaaaaaaaaaaaaaaaaa");
	      System.out.println("After Full, New Capacity: "+first.capacity());
	}
	
	public static void builderOtherMethods() {
		StringBuilder sb1=new StringBuilder();
		sb1.append("welcome to java programming");
		System.out.println(sb1);
		
		StringBuilder sb2=new StringBuilder(15);
		sb2.append("hello");
		System.out.println(sb2.capacity());
		System.out.println(sb2.length());
		System.out.println(sb2.toString());
		System.out.println(sb2.capacity());
	}

	
	// converting into string
	public static void convertingString() {
	      StringBuilder second = new StringBuilder();
	      second.append("SoftwareTestingo");
	      
	      //Convert Stringbuilder to String
	      System.out.println(second.toString());
	      
	}
	public static void main(String[] args) {

//		System.out.println(System.currentTimeMillis());
		
	}

}
