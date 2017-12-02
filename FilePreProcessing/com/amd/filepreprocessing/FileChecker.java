//package com.amd.filepreprocessing;

import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;

public class FileChecker{ 
	public void fileChecker(){
		File f = new File("D:\\Prgms\\srcefiles");
		boolean bool=false;
		try{
			bool = f.exists();
			if (f.exists()){
				// ArrayList<String> names = new ArrayList<String>(Arrays.asList(f.list()));  --to store just the file names
				ArrayList<File> files = new ArrayList<File>(Arrays.asList(f.listFiles())); // the full file path will be stored in the list
				for (int i = 0; i < files.size(); i++) {
					System.out.println(files.get(i));
				}
			}
			else
			{
				System.out.println("File Exists : "+bool);
			}
		} catch (Exception e)
		{
		}
	}  
	
}  
