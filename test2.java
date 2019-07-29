import java.util.Scanner;
public class test2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner in = new Scanner(System.in);
		int number = in.nextInt();
		int count = 0 ;
		double sum = 0 ;
		double odd = 0;
		double even = 0;
		for(double i=1;i<number+1;i++)
		{
			if(i%2==0)
			{
				even = even + 1/i;
				
			}
			else
			{
				odd = odd - 1/i;
				
				
			}
			
			
			
			
			
			
			
		}
		sum = odd + even;
		System.out.println("ºÍÎª:"+sum);
		
		
		
		
		
		
		
		
		

	}

}
