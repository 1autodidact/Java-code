import java.util.Scanner;
public class prime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		int primeNum = 0;
		int number = 2;
		int result;
		int i;
		int isPrime = 1;
		while(primeNum <=50)
		{
			for(i=2;i<number;i++)
			{
				result = number % i;
				if(result == 0)
				{
					isPrime = 0;
					break;
				}
				
				
			}
		
			if(isPrime == 1)
			{
				
				primeNum += 1;
				System.out.print("ËØÊý:"+number);
				
		
			}
		
				
			
			
			number += 1;
			isPrime = 1;
			
		
			
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
