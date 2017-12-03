//package com.amd.filepreprocessing;

import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;

public class FileCheck{ 
	public void fileCheck(){
		File f = new File("D:\\Prgms\\srcefiles");
		boolean bool=false;
		try{
			boolean exists =      f.exists();      // Check if the file exists in the path specified
			boolean isDirectory = f.isDirectory(); // Check if it's a directory
			boolean isFile =      f.isFile();      // Check if it's a regular file
			if (f.exists() && f.isDirectory()){
				//ArrayList<String> names = new ArrayList<String>(Arrays.asList(f.list()));  //to store just the file names
				ArrayList<File> files = new ArrayList<File>(Arrays.asList(f.listFiles())); // the full file path will be stored in the list
				for (int i = 0; i < files.size(); i++) {
					if (files.get(i).isFile())
					{
						System.out.println(files.get(i));
						//start with all validations
						
					}
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
