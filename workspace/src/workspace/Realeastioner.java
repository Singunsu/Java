package workspace;

import java.util.Scanner;

public class Realeastioner {

	public static void main(String[] args) 
	{
		
		Scanner sc = new Scanner(System.in);
		
		int a,b;
		System.out.print("첫 번째 정수 :");
		a = sc.nextInt();
		System.out.print("두 번째 정수 :");
		b = sc.nextInt();
		
		//System.out.printf("%d < %d = %s\n",a,b (a<b));
		//printf로 논리값을 출력할 때는 %d를 이용하면
		
		
		System.out.println(a + " < " + b + " => " + (a < b));
		System.out.println(a + " <= " + b + " => " + (a <= b));
		System.out.println(a + " > " + b + " => " + (a > b));
		System.out.println(a + " >= " + b + " => " + (a >= b));
		System.out.println(a + " == " + b + " => " + (a == b));
		System.out.println(a + " != " + b + " => " + (a != b));
		

	}

}
