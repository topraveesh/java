package Inheritance;

public class B extends A{
	
	public void doSomething(String str){
	       System.out.println("Child impl:"+str);
	   }
	
/*	public void doSomething(Object str){
	       System.out.println("Child impl:"+str);
	   }*/
	
	
	public static void main(String[] args) {
		
	A a = new B();
	String s = "override";
	a.doSomething(s); //this will call A's doSomething(Object str)
	
	}
}


