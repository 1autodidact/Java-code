import java.util.Scanner;
public class jiecheng {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		int number = in.nextInt();
		int factor = 1;
		int count = 1;
		while(count != number)
		{
			factor = factor * count;
			count += 1;
			
			
			
		}
		factor = factor * number;
		System.out.println("½×²ã:"+factor);
		
		

	}

}
