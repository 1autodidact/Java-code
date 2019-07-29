import java.util.Scanner;
public class average {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num;
		int count = 0;
		int sum = 0;
		float average;
		Scanner in = new Scanner(System.in);
		System.out.println("Please input a number");
		num = in.nextInt();
//		while(num != -1)
//		{
//			
//			sum = sum + num;
//			count += 1;
//			System.out.println("please input a number");
//			num = in.nextInt();
//			
//			
//			
//		}
//		average = (float)(sum / count);
		do
		{
			if(num != 1)
			{
				sum = sum +num;
				count += 1;
				num = in.nextInt();
				System.out.println("Plese input a number");
			}
			else
			{
				System.out.println("over");
				
			}
			
			
		}while(num != -1);
		average = (float)sum / count;
		System.out.println("Æ½¾ùÊı:"+average);
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
