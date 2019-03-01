package com.java8.lambdas;

import java.util.LinkedList;

public class Test2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList<String> arrl = new LinkedList<String>();
        //adding elements to the end
        arrl.add("First");
        arrl.add("Second");
        arrl.add("Third");
        arrl.add("Random");
        System.out.println("Actual LinkedList:"+arrl);
        LinkedList<String> copy = (LinkedList<String>) arrl.clone();
        System.out.println("Cloned LinkedList:"+copy);
        System.out.println(arrl.hashCode()==copy.hashCode());
        System.out.println(arrl.equals(copy));
        System.out.println(arrl);
        System.out.println(copy);
	}

}
