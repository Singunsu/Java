package ddddsad;
import java.util.Scanner;
public class fdgh {

	public static void main(String[] args) 
	{
		Scanner scn = new Scanner(System.in);
		int intArray[];
		intArray = new int[5];
		int max = -214783648, min = 214783647, sum = 0;
		System.out.print("정수 5개 입력 : ");
		for(int i = 0; i < intArray.length; i++)
		{
			intArray[i] = scn.nextInt();
			sum += intArray[i];
			if (intArray[i]> max)               max = intArray[i];
			if(intArray[i] < min)               min = intArray[i];
				
		}
		System.out.println("입력한 값 중에 최대값 = " + max);
		System.out.println("입력한 값 중에 최소값 = " + min);
		System.out.println("입력한 값 중에 평균값 = " + ((double)sum / intArray[i]));
		scn.close();
	}

}
