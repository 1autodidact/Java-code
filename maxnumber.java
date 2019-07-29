import java.util.Scanner;
public class maxnumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		int number1 = in.nextInt();
		int number2 = in.nextInt();
		int maxnumber1;
		int mininumber;
		int remain;
		int max;
		if(number1 > number2)
		{
			
			maxnumber1 = number1;
			mininumber = number2;
		}
		else
		{
			maxnumber1 = number2;
			mininumber = number1;
		}
		if(maxnumber1==0)
			
		{
			
			max = mininumber;
			System.out.println("最大公约数:"+max);
			
		}
		else
		{	do
			{
				
				
				remain = mininumber % maxnumber1;
				mininumber = maxnumber1;
				
				maxnumber1 = remain;
				
			}while(maxnumber1!=0);
			System.out.println("最大公约数:"+mininumber);
			
		}
		
		
		
		
		
		
		
		
	}

}
