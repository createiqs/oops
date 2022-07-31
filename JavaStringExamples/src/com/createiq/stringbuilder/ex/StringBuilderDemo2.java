package com.createiq.stringbuilder.ex;

/**
 * @author SRIKANTH 
 *
 */
public class StringBuilderDemo2 {
	
	
	
	/*Downsides
	String builders still have some disadvantages that you need to be aware of:

	mutable objects make the code harder to maintain and unexpected/unwanted changes may occur;
	they are not thread-safe, meaning than unexpected behaviour may occur when multiple threads manipulate a single instance of StringBuilder;
	they take up more space, as they allow for extra memory in case we want to add more characters to them.
	It is worth diving a bit more into the last point. The “size” of a string builder is characterised by two attributes: length and capacity. The length is the number of characters it contains, whereas the capacity is the total number of characters the allocated memory block can contain. When instantiating a new string builder, its capacity is set to 16 characters by default. When the length reaches the capacity, the memory block that contains the string builder is reallocated as the capacity is updated.

	If you need to save space, you can use the method trimToSize. It resizes the memory block occupied by the string so that the capacity equals the actual number of characters.

	To demonstrate how the capacity and the length evolve, we can run a program
*/
	
	public static void main(String[] args) {
		
		 int n =20;
	   StringBuilder string = new StringBuilder();

	      for (int i = 0; i < n; ++i) {
	          System.out.println(string.length());
	          System.out.println(string.capacity());
	          System.out.println();
	          string.append(i);
	      }
	      
	      System.out.println(string.length());
	      System.out.println(string.capacity());
	      System.out.println();

	      string.trimToSize();
	      
	      System.out.println(string.length());
	      System.out.println(string.capacity());

	}
}
