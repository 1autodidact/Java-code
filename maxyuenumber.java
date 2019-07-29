import java.util.Scanner;
public class maxyuenumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		int number1 = in.nextInt();
		int number2 = in.nextInt();
		int mininumber;
		int maxnumber;
		int max = 0 ;

		int result;
		int result1;
		
		if(number1 < number2)
		{
			mininumber = number1;
			maxnumber = number2;
		}
		else
		{
			
			mininumber = number2;
			maxnumber = number1;
		}
		for(int i=1;i<=mininumber;i++)
//			for 里面的i是局部变量
		{
			result = mininumber % i;
			result1 = maxnumber % i;
			
			if(result == 0 && result1 == 0)
			{
				max = i;
				
				
				
			}
			
			
			
			
		}
		
		System.out.println("最大公约数:"+max);
		
		
		
		
		
		
		
	}

}
