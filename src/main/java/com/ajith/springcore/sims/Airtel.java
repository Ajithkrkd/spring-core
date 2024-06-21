package com.ajith.springcore.sims;

public class Airtel implements Sim{

	String owner;
	public Airtel (String name) {
		this.owner = name;
	}
	public Airtel () {
		
	}
	@Override
	public void calling() {
		System.out.println("airtel sim using .......");
		System.out.println(owner != null ? owner  + " is the owner": "no owner");
	}
}
