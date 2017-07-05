package ques2;

import java.io.*;
public class ReadLines {

	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int l = args.length;
		System.out.println(l + " Files to read");
		int i;

		for(i=0;i<l;i++){
			try{
			FileReader fr = new FileReader(args[i]);
			BufferedReader br = new BufferedReader(fr);
			int line = 0;
			while(br.readLine() != null) line++;
			System.out.println(args[i] + " --> " + line);
			}
			catch(Exception e){
				System.out.println("Error reading file " + args[i]);
				//e.printStackTrace();
			}
			
		}
		
		
		

	}

}
