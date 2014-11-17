package Inheritance;

import java.io.Serializable;
import java.util.HashSet;

public class Test1 {
	public static void main(String[] args) {
		
		A a = new A();
		B b = (B) a;
		String s = "override";
		b.doSomething(s);
		
		}
}


No Compiler Error.

Yes! Runtime Error!

Console:
Exception in thread "main" java.lang.ClassCastException: Inheritance.A cannot be cast to Inheritance.B
	at Inheritance.Test1.main(Test1.java:10)
