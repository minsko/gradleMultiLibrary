package com.mattinsko.multiLibrary.libA;

public class ClassA {

public ClassA(int i) {
	this.num=i;
}

public void printInstance() {
	System.out.println("Instance("+num+") ClassA: "+ this.getClass().getName());
}

public static void printStatic() {
	System.out.println("Static ClassA: "+ ClassA.class.getName());
}

private int num;

}