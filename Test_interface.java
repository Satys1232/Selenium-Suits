package com;

public interface Test_interface 
{
	interface Animal {
	    void makeSound();
	    void sleep();
	}

	// Implement the interface in a class
	class Dog implements Animal {
	    public void makeSound() {
	        System.out.println("Woof");
	    }
	    public void sleep() {
	        System.out.println("Zzz");
	    }
	}
}
