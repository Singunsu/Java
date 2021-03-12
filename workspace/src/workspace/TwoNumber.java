package workspace;

import java.util.Scanner;

public class TwoNumber {

	public static void main(String[] args) 
	{
		// 두 정수를 입략받아 사칙연산의 결과를 출력하는 프로그램
		Scanner sc = new Scanner(System.in);
		int a, b;
		
		System.out.print("첫 번째 정수 : ");
		a = sc.nextInt();
		System.out.print("두 번째 정수 : ");
		b= sc.nextInt();
		
		System.out.printf("\n%d + %d = %d", a, b, a+b);
		System.out.printf("\n%d - %d = %d", a, b, a-b);
		System.out.printf("\n%d * %d = %d", a, b, a*b);
		System.out.printf("\n%d / %d = %.2f", a, b, (double)a/b);
	}

}
