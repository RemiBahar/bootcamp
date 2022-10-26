package com.remi.bootcamp;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileIO {
	
	public static void writeFile(String filePath, StringBuffer content) {
		try {
	  			 FileWriter wr = new FileWriter(filePath);
				 BufferedWriter bw = new BufferedWriter(wr);
				 bw.write(content.toString());
				 bw.flush();
				 bw.close();
		  }  catch(FileNotFoundException e) {
			  e.printStackTrace();
		  } catch (IOException e) {
			  e.printStackTrace();
		  } 
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			  // Read file
		      FileReader fr = new FileReader("./././././files/source.txt");
		      BufferedReader br = new BufferedReader(fr);
		      String line;
		      StringBuffer evenContent = new StringBuffer("");
		      StringBuffer oddContent = new StringBuffer("");
		      String directory = "./././././files/";
		      
		      // Seperate odd and even lines
		      int i = 0;
		      while (br.ready()) {
		          line = br.readLine();
		         
		          if(i % 2 == 0) {
		        	  evenContent.append(line + "\n");
		          } else {
		        	  oddContent.append(line + "\n");
		          }
		          
		          i++;
		      } // end of while loop
		     br.close();
		     
		     // Write files
		     writeFile(directory + "evenSource.txt", evenContent);
		     writeFile(directory + "oddSource.txt", oddContent);
		  } catch(FileNotFoundException e) {
			  e.printStackTrace();
		  } catch (IOException e) {
			  e.printStackTrace();
		  }
	
			  System.out.println("Finish");// end of try clause
	}
}