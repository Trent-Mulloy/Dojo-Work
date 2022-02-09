package com.mulloy.zooKeeper;

public class Bat extends Mammal {
	
	 public Bat() {
		 this.energy = 300;
	 }
	
	public void fly() {
		this.energy -= 50;
		System.out.println("Swoosh! Swoosh!");
	}
	
	public void eatHuman() {
		this.energy += 25;
		System.out.println("Crucnh! Crunch! Crunch!");
	}
	
	public void attackTown() {
		this.energy -= 100;
		System.out.println("AHHHHHHHHH!");
	}

}
