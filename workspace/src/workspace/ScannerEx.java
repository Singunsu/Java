package workspace;

import java.util.Scanner;

public class ScannerEx {

	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		
		String name;
		System.out.print("����� �̸��� : " + "\n");
		name = sc.next();
		System.out.println(name);
		
		String city;
		System.out.print("����� ���ô� : " + "\n");
		city = sc.next();
		
		int age;
		System.out.print("����� ���̴� : " + "\n");
		age = sc.nextint();
		
		double weight;
		System.out.print("����� �����Դ� : " + "\n");
		weight = sc.nextdouble();
		
		boolean single;
		System.out.print("����� ��ȥ�� : " + "\n");
		single = sc.nextboolean();
		
		
		
		sc.close();
	}

}
