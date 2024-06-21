package com.ajith.springcore.homeServices;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class AjithHome {
	
	@Autowired
	@Qualifier("BikeService")
	private Service service;
	
	public AjithHome() {
		System.out.println("hai called ");
	}
	
	public AjithHome (Service service) {
		this.service = service;
	}
	

	public void setService (Service service) {
		this.service = service;
	}
	
	public void iNeedService() {
		if(service == null)System.out.println("service bean not injecting ..");
		else service.getService();
	}
}
