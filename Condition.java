package com.masai;

public class Condition {

	int value = 44;
	
	public static void main(String[] args) {
		
		Condition k1 = new Condition();
		
		if(k1.value%2==0) {
			System.out.println(k1.value+(10-k1.value%10));
		}
		else if(k1.value%2==1) {
			System.out.println(k1.value);
		}
		else {
			System.out.println("Error");
		}
		
		//System.out.println(k1.value);
		
		
	}
}

