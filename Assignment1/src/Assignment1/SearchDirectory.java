package Assignment1;
import java.io.*;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class SearchDirectory{
	public static void main(String[] args) {
		//keep taking the inputs 
		while(true) {
		// Create a Scanner object
		Scanner inp = new Scanner(System.in);  
		System.out.println("Enter the location where you want to search the file\n");
		//get the location where you want to search the file
	    String location = inp.nextLine(); 
	    System.out.println("Enter the regular expression to search the file\n");
	    //get the expression with which you want to search the file
	    String expression=inp.nextLine();
		//try with the given file location. If the location is invalid, raise an exception
	    try {
	    	File dir = new File(location);
	   
	    	boolean flag=false;
	    	//get all the file names in the dir and store them in a String array
	    	String[] children = dir.list();
		
	    	for (int i = 0; i< children.length; i++) {
	    		String filename = children[i];
	    		
       	 		if(Pattern.matches(expression,filename)) {
       	 			//flag keeps track if any file with the given expression is found
       	 			flag=true;
       	 			System.out.println(location+"/"+filename);
       	 		
       	 		}
       	 		
	    	}
	    	if(!flag) {
	    		System.out.println("File not found\n");
	    	}
	    }
	    //exception handling
	    catch(Exception e) {
	    	System.out.println("Invalid Location");
	    }
	}
}
}


