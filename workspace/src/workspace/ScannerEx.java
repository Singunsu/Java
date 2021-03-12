package workspace;

import java.util.Scanner;

public class ScannerEx {

	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		
		String name;
		System.out.print("당신의 이름은 : " + "\n");
		name = sc.next();
		System.out.println(name);
		
		String city;
		System.out.print("당신의 도시는 : " + "\n");
		city = sc.next();
		
		int age;
		System.out.print("당신의 나이는 : " + "\n");
		age = sc.nextint();
		
		double weight;
		System.out.print("당신의 몸무게는 : " + "\n");
		weight = sc.nextdouble();
		
		boolean single;
		System.out.print("당신의 결혼은 : " + "\n");
		single = sc.nextboolean();
		
		
		
		sc.close();
	}

}
