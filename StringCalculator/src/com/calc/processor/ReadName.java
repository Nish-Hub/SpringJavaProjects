package com.calc.processor;

import com.calc.entity.Entity;

public class ReadName {

public StringBuffer process(Entity e)
{
	return new StringBuffer(e.getValue());
}
}
