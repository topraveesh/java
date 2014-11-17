package Inheritance;

import java.io.Serializable;
import java.util.HashSet;

public class Test2 {
	public static void main(String[] args) {
		
		A a = new B();
		//B b = a; Why did I Comment this line? It was due to: Compiler error at Line 10: Type mismatch: cannot convert from A to B
		B b = (B) a; // Added this by casting a to Type B.
		String s = "override";
		b.doSomething(s);
		
		}
}


Console:
Child impl:override



