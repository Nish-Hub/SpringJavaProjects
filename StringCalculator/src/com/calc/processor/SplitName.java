package com.calc.processor;

import com.calc.entity.Entity;

public class SplitName {

public void	process(StringBuffer name,Entity e)
{
	String[] arr=name.toString().split(e.getValue());
	name.delete(0, name.length());
	name.append(arr[0]+""+arr[1]);
}
}
