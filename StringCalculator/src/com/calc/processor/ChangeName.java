package com.calc.processor;

import com.calc.entity.Entity;

public class ChangeName {

public void	process(StringBuffer name,Entity e)
{
	System.out.println("changed name is "+name.toString().substring(0,1).toUpperCase().concat(name.substring(1,name.length())));
	//name=new StringBuffer(name.toString().substring(0,1).toUpperCase().concat(name.substring(1,name.length())));
	String s=name.toString().substring(0,1).toUpperCase().concat(name.substring(1,name.length()));
	System.out.println("before :  name is "+name);
	//name=new StringBuffer(s);
	name.delete(0, name.length());
	name.append(s);
	System.out.println("after :  name is "+name);
}
}
