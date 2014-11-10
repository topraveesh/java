import java.util.Scanner;


public class Armstrong {

	public static void main(String[] args) {
		
		int n = 0;
		
		System.out.println("Enter a Number: ");
		
		Scanner s = new Scanner(System.in);
		
		n = s.nextInt();
		
		int a = n;
		
		int length = String.valueOf(n).length();
		
		int sum=0;
		int rem = 1;
		
		for(int i=0;i<length;++i)
		{
			rem = n%10;
			sum =(int) (sum+(Math.pow(rem,length)));
			
			n = n/10;
		}
		
		if(a == sum)
		System.out.println(a+" is an Armstrong Number!");
		else
		System.out.println(a+" is not an Armstrong Number!");
		
	}
	
}
