package com.ioc.IoCUsingXML.impl;

import org.springframework.context.ApplicationContext;

import com.ioc.IoCUsingXML.services.Services;

public class IndianNavy implements Services {
	
	ApplicationContext ac;
	
	public IndianNavy(ApplicationContext ac) {
		this.ac = ac;
	}

	@Override
	public void addressPM() {
		
	}
}
