package workspace;

import java.util.Scanner;

public class TwoNumber {

	public static void main(String[] args) 
	{
		// �� ������ �Է��޾� ��Ģ������ ����� ����ϴ� ���α׷�
		Scanner sc = new Scanner(System.in);
		int a, b;
		
		System.out.print("ù ��° ���� : ");
		a = sc.nextInt();
		System.out.print("�� ��° ���� : ");
		b= sc.nextInt();
		
		System.out.printf("\n%d + %d = %d", a, b, a+b);
		System.out.printf("\n%d - %d = %d", a, b, a-b);
		System.out.printf("\n%d * %d = %d", a, b, a*b);
		System.out.printf("\n%d / %d = %.2f", a, b, (double)a/b);
	}

}
