package com.wut.sharedCar1.util;

import java.io.File;

public class Renametojsp {
   public static void main(String[] args) {
	File dir=new File("D:\\JavaeeProjects\\sharedCar1\\WebContent");
	
	File[] files=dir.listFiles();
	for(File f:files) {
		if(f.isFile()) {
			String lastname=f.getName().substring(0,f.getName().lastIndexOf("."));
			f.renameTo(new File(dir,lastname+".jsp"));
		}
	}
}
}
