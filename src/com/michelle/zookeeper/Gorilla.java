package com.michelle.zookeeper;

public class Gorilla extends Mammals {

	public Gorilla() {
		super();
	}
	
	public void throwSomething() {
		int energy = super.getEnergy();
		energy -= 5;
		System.out.println("The Gorilla threw his poop at you.");
		super.setEnergy(energy);
		super.displayEnergy();
	}
	
	public void eatBananas() {
		int energy = super.getEnergy();
		energy += 10;
		System.out.println("The Gorilla ate some bananas.");
		super.setEnergy(energy);
		super.displayEnergy();
	}
	
	public void climb() {
		int energy = super.getEnergy();
		energy -= 10;
		System.out.println("The Gorilla started climbing to look at the humans.");
		super.setEnergy(energy);
		super.displayEnergy();
	}
	
	
}

