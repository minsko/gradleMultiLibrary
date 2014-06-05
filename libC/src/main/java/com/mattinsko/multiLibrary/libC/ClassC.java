package com.mattinsko.multiLibrary.libC;
import com.mattinsko.multiLibrary.libB.ClassB;

public class ClassC extends ClassB {

public ClassC(int i) {
	super(i);
	this.num=i;
}

public void printInstance() {
	super.printInstance();
	System.out.println("Instance("+num+") ClassC: "+ this.getClass().getName());
}

public static void printStatic() {
	System.out.println("Static ClassC: "+ ClassC.class.getName());
}

private int num;

}