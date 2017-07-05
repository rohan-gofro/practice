package ques4;
import java.util.*;
public class AccessFile {
	
	public static void main(String[] args) {
		
		String directory;
		String file;
		Scanner sc = new Scanner(System.in);
		System.out.println("Give the Directory Path: ");
		directory = sc.next();
		FilesOnServer obj = new FilesOnServer(directory);
		if(obj.listFiles()){
			System.out.println("Enter the file you want to access");
			file = sc.next();
			obj.accessFileContent(file);
		}
		sc.close();	
	}
}
