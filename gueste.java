import java.util.Scanner;
public class gueste {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int random;
		int num;
		Scanner in = new Scanner(System.in);
		random = in.nextInt();
		num = in.nextInt();
		while(num != random)
		{
			
			if(num > random)
			{
				System.out.println("����̫��");
				num = in.nextInt();
			}
			else 
			{
				System.out.println("����̫С");
				num = in.nextInt();	
			}
		}
		System.out.println("��¶���");
		
		
		
		
		
		
		
		
		
		
		
	}

}
