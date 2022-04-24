package com.createiq.abstraction;

public class AnimalTest {

	public static void main(String[] args) {
		Lion lion = new Lion("Lion ");
		lion.eat();
		lion.sleep();

		Parrot parrot = new Parrot("indian parrot");
		parrot.eat();
		parrot.sleep();
		parrot.fly();

		Penguin penguin = new Penguin("penguin");
		penguin.eat();
		penguin.sleep();
		penguin.fly();

		int oldCapacity=2;
		int newCapacity=oldCapacity+(oldCapacity>>1);
		System.out.println(newCapacity);

	}

}
