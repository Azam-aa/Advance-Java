package com.ioc.IoCUsingXML.impl;

import org.springframework.context.ApplicationContext;

import com.ioc.IoCUsingXML.services.Services;

public class IndainAirForce implements Services {
	
	ApplicationContext ac;
	

	public IndainAirForce(ApplicationContext ac) {
		this.ac = ac;
	}



	@Override
	public void addressPM() {
		
	}
}
