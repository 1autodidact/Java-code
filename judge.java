import java.util.Scanner;
public class judge {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		int x;
		int []numbers = new int[10];
//		���鴴����ʱ��Ԫ���Ѿ���ʼ��Ϊ��
		System.out.println(""+numbers[0]+numbers[1]);
		x = in.nextInt();
		while(x!= -1)
		{
			
			numbers[x]++;
			System.out.println("number"+numbers[x]);
			
			
			x = in.nextInt();
			
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
