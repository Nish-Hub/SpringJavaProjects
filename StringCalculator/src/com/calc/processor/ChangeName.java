package com.calc.processor;

import com.calc.entity.Entity;

public class ChangeName {

public void	process(StringBuffer name,Entity e)
{
	String s=name.toString().substring(0,1).toUpperCase().concat(name.substring(1,name.length()));
	name.delete(0, name.length());
	name.append(s);
	
}
}
