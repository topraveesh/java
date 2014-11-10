import java.util.Scanner;


public class Factorial {
	
	public static void main(String[] args) {
		
		Factorial f = new Factorial();
		
		System.out.println("Enter the number: "); 
		
		Scanner s = new Scanner(System.in);
		int n =s.nextInt();
		System.out.println(f.findFactNum(n));

	}
	
	public int findFactNum(int num){
		if (num >0)
		return (num*findFactNum(num-1));
		return 1;
	}
}
