//package com.amd.filepreprocessing;

import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardWatchEventKinds;
import java.nio.file.WatchEvent;
import java.nio.file.WatchKey;
import java.nio.file.WatchService;
import java.util.List;
import java.util.Timer;
import java.util.TimerTask;

public class FileArrivalCheck {

    public void fileArrivalCheck(){

        //define a folder root
        Path myDir = Paths.get("D:\\Prgms\\srcefiles");   

		// set the timeout    
		// this will stop this function in 60 minutes
		//long in30Minutes = 30 * 60 * 1000;
		
		// this will stop this fileArrivalCheck() function in 4 seconds
		long in4sec = 4 * 1000;
		Timer timer = new Timer();
		timer.schedule( new TimerTask(){
			  public void run() {
					   System.exit(0);
			   }
		 },  in4sec );		

        try {
           WatchService watcher = myDir.getFileSystem().newWatchService();
           myDir.register(watcher, StandardWatchEventKinds.ENTRY_CREATE, 
           StandardWatchEventKinds.ENTRY_DELETE, StandardWatchEventKinds.ENTRY_MODIFY);

           WatchKey watckKey = watcher.take();

           List<WatchEvent<?>> events = watckKey.pollEvents();
           for (WatchEvent event : events) {
                if (event.kind() == StandardWatchEventKinds.ENTRY_CREATE) {
                    System.out.println("Created: " + event.context().toString());
                }
                if (event.kind() == StandardWatchEventKinds.ENTRY_DELETE) {
                    System.out.println("Delete: " + event.context().toString());
                }
                if (event.kind() == StandardWatchEventKinds.ENTRY_MODIFY) {
                    System.out.println("Modify: " + event.context().toString());
                }
            }
           
        } catch (Exception e) {
            System.out.println("Error: " + e.toString());
        }
    }
}