package com.srikantvs.java8.nio2.com.srikantvs.nio2;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class CreateNewFiles {
	
	public static void main(String[] args) {
		
		Path path = Paths.get("text.txt");
		try {
			Path createFile = Files.createFile(path);
			System.out.println("file created at : "+path.toRealPath());
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println(e.getClass());
			System.out.println(e.getCause());
		}
		
//		if(true) {
//			throw new FileNotFoundException();
//		}
//		
	}

}
