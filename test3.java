import java.util.Scanner;
public class test3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		int number = in.nextInt();
		double sum = 0;
		int symbol = 1;
		for(int i=1;i<=number;i++)
		{
			sum = sum + symbol*1.0/i;
			
			symbol = -symbol;
			
			
			
		}
		
		System.out.println("ºÍÎª:"+sum);
		
		
		
		
		
	}

}
