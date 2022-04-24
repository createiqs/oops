package com.createiq.accessmodifiers;

 public class AccessModifiersDemo {

	public int id;
	
	 public AccessModifiersDemo() {
		this.id=100;
		System.out.println(" defautl access modifie " +id);
	}

	// public, default, protected and private

  public void test() {
		System.out.println("public test");
	}

	public static void main(String[] args) {
		AccessModifiersDemo demo=new AccessModifiersDemo();
//		demo.id=100;
		demo.test();

	}

}
