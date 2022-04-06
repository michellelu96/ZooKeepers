package com.michelle.zookeeper;

public class ZooKeeperTest {

	public static void main(String[] args) {
		Gorilla gorilla1 = new Gorilla();
		
		gorilla1.throwSomething();
		gorilla1.throwSomething();
		gorilla1.throwSomething();
		
		gorilla1.eatBananas();
		gorilla1.eatBananas();
		
		gorilla1.climb();
		
		Bat bat1 = new Bat();
		
		bat1.attackTown();
		bat1.attackTown();
		bat1.attackTown();
		
		bat1.eatHumans();
		bat1.eatHumans();
		
		bat1.fly();
		bat1.fly();
	}

}
