package Inheritance;

import java.io.Serializable;
import java.util.HashSet;

public class Test2 {
	public static void main(String[] args) {
		
		A a = new B();
		//B b = a;
		B b = (B) a;
		String s = "override";
		b.doSomething(s);
		
		}
}


//Why line 10 was Commented? Compiler error at Line 10: Type mismatch: cannot convert from A to B
// Added Line 11 by casting a to Type B.

Console:
Child impl:override



