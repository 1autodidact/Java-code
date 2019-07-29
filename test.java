import java.util.Scanner;
public class test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
//		int number = in.nextInt();
		int result;
		int isPrime =1;
		int number = 0;
		int i ;
		int count = 0 ;
		while(number < 100)
		{	
			if(number == 0 || number == 1)
			{
				isPrime = 0;
			}
			for(i=2;i<number ;i+=1)
			{
				result = number % i;
				if(result == 0)
				{
					System.out.println(number+"不是素数");
					isPrime = 0;
					break;
					
				}	
			
					
			}
			if(number == 1 || number == 0)
			{
				System.out.println(number+"不是素数");
				
				
			}
		
			if(number == 2 || isPrime ==1)
			{
				
				System.out.println(number+"是素数");
				count+=1;
			}
	
			number += 1;
			isPrime = 1;
		}
		System.out.println("素数个数:"+count);	
	}

}
