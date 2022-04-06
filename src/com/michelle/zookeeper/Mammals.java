package com.michelle.zookeeper;

public class Mammals {
	private int energy;
	
	public Mammals() {
		this.energy = 100;
	}
	
	public int getEnergy() {
		return this.energy;
	}
	
	public void setEnergy(int energy) {
		this.energy = energy;
	}
	
	public int displayEnergy() {
		System.out.printf("The energy level is %s \n", this.energy);
		return this.energy;
	}
}
