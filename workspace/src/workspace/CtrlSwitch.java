package workspace;

import java.util.Scanner;

public class CtrlSwitch {

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		
		int score;
		System.out.print("���� : ");
		score = sc.nextInt();
		switch(score/10);
		case 10:
			System.out.println("����� ���(grade)�� S �Դϴ�"); break;
		case 9:
			System.out.println("����� ���(grade)�� A �Դϴ�"); break;
		case 8:
			System.out.println("����� ���(grade)�� B �Դϴ�"); break;
		case 7:
			System.out.println("����� ���(grade)�� C �Դϴ�"); break;
		case 6:
			System.out.println("����� ���(grade)�� D �Դϴ�"); break;
		case default:
			System.out.println("����� ���(grade)�� F �Դϴ�"); break;

	}

}