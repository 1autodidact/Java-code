import java.util.Scanner;
public class judnumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		int number = in.nextInt();
		int result = 0;
		int digit;
		do
		{
			digit = number % 10;
			number = number / 10 ;
			result = result * 10 +digit;
//             10(2*10+5) +3     			分配律 2*100+5*10+3
		}while(number != 0);
		System.out.println("倒序输出为:"+result);
		
		
		
		
		
		
		
		
		
	}

}
