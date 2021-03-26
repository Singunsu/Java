package workspace;

import java.util.Scanner;

public class CtrlifElseif {

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int score;
		
		System.out.print("성적 입력 : ");
		score = sc.nextInt();
		if (score >= 90)
			System.out.println("당신의 등급(grade)은 A 입니다");
		else if (score >= 80)
			System.out.println("당신의 등급(grade)은 B 입니다");
		else if (score >= 70)
			System.out.println("당신의 등급(grade)은 C 입니다");
		else if (score >= 60)
			System.out.println("당신의 등급(grade)은 D 입니다");
		else if (score >= 50)
			System.out.println("당신의 등급(grade)은 E 입니다");
		else
			System.out.println("당신의 등급(grade)은 F 입니다");

	}

}
