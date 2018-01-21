package com.calc.frontcontroller;

import java.io.FileNotFoundException;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.calc.entity.Entity;
import com.calc.persist.PersistList;
import com.calc.processor.AppendName;
import com.calc.processor.ChangeName;
import com.calc.processor.ReadName;
import com.calc.processor.SplitName;

public class FrontController {
	static ApplicationContext ac=null;
	static StringBuffer name=null;
			
public static void main(String[] args) throws FileNotFoundException {
	LinkedHashMap<String,String> map=new LinkedHashMap<String,String>();

	ac=new ClassPathXmlApplicationContext("calc-config.xml");
	PersistList persist=ac.getBean("persist",PersistList.class);
	persist.setMap(map);
	
	
	
	for(Map.Entry<String, String> m:map.entrySet())
	{
		
		Entity e=ac.getBean("entity",Entity.class);
		e.setKey(m.getKey());
		e.setValue(m.getValue());
		
		
		requestMapper(e);
		
	}
	System.out.println("Name after modifications is :::");
	System.out.println(name);
}

static void requestMapper(Entity e)
{
	switch(e.getKey())
	{
	case "name" :
		ReadName r=ac.getBean("read",ReadName.class);
		name=r.process(e);
		break;
		
	case "append":
		AppendName a=ac.getBean("append",AppendName.class);
		a.process(name,e);
		break;
		
	case "case":
		ChangeName c=ac.getBean("change",ChangeName.class);
		c.process(name,e);
		break;
		
	case "split":
		SplitName s=ac.getBean("split", SplitName.class);
		s.process(name,e);
		break;
	}
}
}













