package workspace;

public class Circle {

	public static void main(String[] args)
	{
		final double PI = 3.14;
		double radius = 10.2;
		double circleArea = PI * radius * radius;
		double circleCir = 2 * PI * radius;
		
		System.out.print("���� ������ = %d " + radius + "\n");
		System.out.print("���� ���� = %.2f" + circleArea + "\n");
		System.out.print("���� �ѷ� = " + circleCir);		
	}

}
