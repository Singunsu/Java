package workspace;

import java.util.Scanner;

public class Conditional {

	public static void main(String[] args) 
	{
		
		Scanner sc = new Scanner(System.in);
		int a, b;
		
		System.out.print("ù ��° ���� : ");
		a = sc.nextInt();
		System.out.print("�� ��° ���� : ");
		b = sc.nextInt();
		
		System.out.printf("(%d < %d)?1:2 => %d", a, b ((a<b)?1:2));
		
		System.out.println(a + " += " + b + " = " + (a+b));
		//���� ������ ?: =>  (���ǽ�)?true:false
		sc.close();
		
		a = 1; b = 2; a += b;
		System.out.println("a += b, a =>" + a);
		
		a = 1; b = 2; a += b;
		System.out.println("a += b, a =>" + a);
		
	}

}
