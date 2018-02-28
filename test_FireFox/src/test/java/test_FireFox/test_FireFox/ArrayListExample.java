package test_FireFox.test_FireFox;

import java.util.ArrayList;

public class ArrayListExample {
	 public static void main(String args[]) {
	      /*Creation of ArrayList: I'm going to add String
	       *elements so I made it of string type */
		  ArrayList<String> obj = new ArrayList<String>();

		 

		  /*Add element at the given index*/
		  obj.add(0, "Rahul");
		  obj.add(1, "Justin");

		  
		  System.out.println("Current array list is:"+obj);
	   }
	
}
