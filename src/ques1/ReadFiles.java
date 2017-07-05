package ques1;
import java.io.*;
public class ReadFiles {

	public static void main(String[] args) {
		
		System.out.println("Path given: " + args[0]);
		try{
		File dir = new File(args[0]);
		File[] files = dir.listFiles();
		System.out.println("\nListing of files:");
		for(File obj:files){
			
			System.out.println(obj.getName());
			
		}
		}
		catch(ArrayIndexOutOfBoundsException e){
			System.out.println("Please Enter directory path in command line argument");
		}
		
	}
}
