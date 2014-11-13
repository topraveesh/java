package AnonymousInnerClass;

public class B {

	// in the below line, 'a' is actually pointing to the anonymous class Object
	A a = new A(){
		public void read()
		{
			System.out.println("Anonymous read()");
		}
	};
	
	public static void main(String[] args) {
		B b = new B();
		b.a.read(); //This will print "Anonymous read()"
	}
}
