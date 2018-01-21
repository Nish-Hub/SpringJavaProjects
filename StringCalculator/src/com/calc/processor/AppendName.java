package com.calc.processor;

import com.calc.entity.Entity;

public class AppendName {

public void	process(StringBuffer name,Entity e)
{
	name.append(e.getValue());
}
}
