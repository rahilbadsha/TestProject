package com.java8.lambdas;

public class Test1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Thread t1= new Thread (()-> {
			System.out.println("Its running...");
		});
		
		t1.start();

	}

}
