package workspace;

public class formoon {

	public static void main(String[] args) 
	{
		int i, sum = 0;
		
		for(i = 1; i <= n; i++)
		{
			sum += i;
			System.out.print(i);
			if(i <= n-1)
			{
				System.out.print("+");
			}
			else
			{
				System.out.print("=");
			}
			System.out.println(sum);
			System.out.println(i);
		}
	}

}
