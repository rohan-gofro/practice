package ques4;
import java.io.*;

public class FilesOnServer {
	
	String directoryPath;
	
	public FilesOnServer(String directoryPath){
		
		this.directoryPath = directoryPath;
		
	}
	
	 boolean listFiles(){
		
		try{
		File fo = new File(this.directoryPath);
		File[] fileList = fo.listFiles();
		for(File displayList:fileList){
			System.out.println(displayList.getName());
		}
		}catch(NullPointerException e){
			System.out.println("No such directory exists");
			return false;
		}
		catch(Exception e){
			e.printStackTrace();
			return false;
		}
		
		return true;
	}
	
	void accessFileContent(String file){
		
		try{
		FileReader fr = new FileReader(this.directoryPath + "/" + file);
		BufferedReader br = new BufferedReader(fr);
		int i;
		while((i = br.read())!=-1){
			System.out.print((char)i);
		}
		}catch(FileNotFoundException e){
			System.out.println("No such file found");
		}
		catch(Exception E){
			E.printStackTrace();
		}
	}
}
