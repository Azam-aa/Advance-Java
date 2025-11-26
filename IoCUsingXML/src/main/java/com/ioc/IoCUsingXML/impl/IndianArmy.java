package com.ioc.IoCUsingXML.impl;

import org.springframework.context.ApplicationContext;

import com.ioc.IoCUsingXML.services.Services;

public class IndianArmy implements Services {
	
	ApplicationContext ac;
	
	public IndianArmy(ApplicationContext ac) {
		this.ac = ac;
	}
	
	@Override
	public void addressPM() {
		
	}
}
