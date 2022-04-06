package com.michelle.zookeeper;

public class Bat extends Mammals {
	
	public Bat() {
		super();
	}
	
	public void fly() {
		System.out.println("Flap Flap Flap run!!! It's going to eat you!\n");
		int energy = super.getEnergy();
		energy -= 50;
		super.setEnergy(energy);
		super.displayEnergy();
	}
	
	public void eatHumans() {
		System.out.println("The bat is now eating you... You failed at running away \n");
		int energy = super.getEnergy();
		energy += 25;
		super.setEnergy(energy);
		super.displayEnergy();
	}
	
	public void attackTown() {
		System.out.println("Fire is everywhere and now you're going to burn to death \n");
		int energy = super.getEnergy();
		energy -= 100;
		super.setEnergy(energy);
		super.displayEnergy();
	}

}
