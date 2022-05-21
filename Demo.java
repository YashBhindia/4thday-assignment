package com.masai;

public class Demo {
	
    Demo() {
		this("b");
		System.out.println("1st constructor");
	}
	
	Demo(String s) {
		this(1);
		System.out.println("2nd constructor "+s);
	}
	Demo(int i) {
		this(12.22f);
		System.out.println("3rd constructor "+i);
	}
	Demo(float f) {
		System.out.println("4th constructor "+f);
	}

	public static void main(String[] args) {
		
		Demo k1 = new Demo();
		
		
	}
	
}
