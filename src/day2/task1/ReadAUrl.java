package day2.task1;
import java.net.*;
import java.io.*;

public class ReadAUrl {
    public static void main(String[] args) throws Exception {
    	System.out.println("abc");
        URL oracle = new URL("https://en.wikipedia.org/wiki/MakeMyTrip");
        BufferedReader in = new BufferedReader(
        new InputStreamReader(oracle.openStream()));

        String inputLine;
        while ((inputLine = in.readLine()) != null)
        {
        	int start = 0 , end = 0;
            if(inputLine.contains("<h2>"))
            {
        	  start = inputLine.indexOf("<h2>") + "<h2>".length();
        	  end =  inputLine.indexOf("</h2>" , start);
        	  System.out.println(inputLine.substring(start,end));
            }
        }
        in.close();
    }
}
