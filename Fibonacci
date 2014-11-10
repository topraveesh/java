import java.util.Scanner;


public class Fibonacci {
	
	private void display(int limit) {
		
		int current = 1;
		int prev = 1;
		int befPrev = 0;
		
		if(limit==1)
		{
			System.out.println(0);
			return;
		}
		if(limit==2)
		{
			System.out.println(0);
			System.out.println(1);
			return;
		}
		System.out.println(0);
		System.out.println(1);
		for(int i = 0; i<limit-2;++i)
		{
			
			current = prev+befPrev;
			befPrev = prev;
			prev = current;
			
			System.out.println(current);
		}
		
	}

	public static void main(String[] args) {
		
		System.out.println("Enter the limit: ");
		
		Scanner s = new Scanner(System.in);
		
		int limit = s.nextInt();
		
		Fibonacci f = new Fibonacci();
		
		f.display(limit);
		
	}

	
	
}
