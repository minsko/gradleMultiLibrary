package com.mattinsko.multiLibrary;
import com.mattinsko.multiLibrary.libA.ClassA;
import com.mattinsko.multiLibrary.libB.ClassB;
import com.mattinsko.multiLibrary.libC.ClassC;

public class Main {
	public static void main(String args[]) {
		System.out.println("Main");
		new ClassA(1).printInstance();
		new ClassB(2).printInstance();
		new ClassC(3).printInstance();
		ClassA.printStatic();
		ClassB.printStatic();
		ClassC.printStatic();
	}
}