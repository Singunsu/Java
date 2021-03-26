package workspace;

import java.util.Scanner;

public class CtrlSwitch {

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		
		int score;
		System.out.print("성적 : ");
		score = sc.nextInt();
		switch(score/10);
		case 10:
			System.out.println("당신의 등급(grade)은 S 입니다"); break;
		case 9:
			System.out.println("당신의 등급(grade)은 A 입니다"); break;
		case 8:
			System.out.println("당신의 등급(grade)은 B 입니다"); break;
		case 7:
			System.out.println("당신의 등급(grade)은 C 입니다"); break;
		case 6:
			System.out.println("당신의 등급(grade)은 D 입니다"); break;
		case default:
			System.out.println("당신의 등급(grade)은 F 입니다"); break;

	}

}
