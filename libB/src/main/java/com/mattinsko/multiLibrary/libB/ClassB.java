package com.mattinsko.multiLibrary.libB;
import com.mattinsko.multiLibrary.libA.ClassA;

public class ClassB extends ClassA {

public ClassB(int i) {
	super(i);
	this.num=i;
}

public void printInstance() {
	super.printInstance();
	System.out.println("Instance("+num+") ClassB: "+ this.getClass().getName());
}

public static void printStatic() {
	System.out.println("Static ClassB: "+ ClassB.class.getName());
}

private int num;

}