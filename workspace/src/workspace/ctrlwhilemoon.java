package workspace;

public class ctrlwhilemoon {

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int cnt = 0, n = 0, sum = 0;
		double avg;
		
		System.out.print("정수를 입력하고 마지막에 0을 입력하세요 : ");
		
		while((n = sc.nextint())!=0);
		{
			sum += n;
			cnt++;
		}
		system.out.print("sum = " + sum + " average = " + (double)sum/cnt);
		
		

	}

}
