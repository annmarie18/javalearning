import java.io.File;
public class ExeMain{  
    public static void main(String args[]){  
	  //Creating objects  
	  FileChecker filechecker=new FileChecker();  
		filechecker.fileChecker();
	}  
}

class FileChecker{ 
	public void fileChecker(){
		File file = new File("D:/Prgms/srcefiles/new.txt");
		if(file.exists() && file.isFile())
		{
		  System.out.println("file exists, and it is a file");
		} 
		else
		{
		  System.out.println("not a file");
		}
	}  
	
}  
