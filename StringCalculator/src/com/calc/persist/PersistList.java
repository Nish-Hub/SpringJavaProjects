package com.calc.persist;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashMap;
import java.util.Scanner;

public class PersistList {
HashMap<String,String> map=null;
File input=null;
public File getInput() {
	return input;
}

public void setInput(File input) {
	this.input = input;
}

public HashMap<String,String> getMap() {
	return map;
}

public void setMap(HashMap<String,String> map) throws FileNotFoundException {
	Scanner sc= new Scanner(new File(getInput().getName()));
	while(sc.hasNext())
	{
		String[] str=sc.next().split(":");
		map.put(str[0],str[1]);
		
	}
}

}
