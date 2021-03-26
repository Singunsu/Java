package workspace;

public class Bit {

	public static void main(String[] args) 
	{
		
		int a = 3, b = 5;
		// 0000 0011 = 3, 0000 0101 = 5;
		
		System.out.println("~ " + a + " = " + (~a)); // tield : ~
		System.out.println(a + " & " + b + " = " + (a & b));
		System.out.println(a + " ^ " + b + " = " + (a ^ b));
		System.out.println(a + " | " + b + " = " + (a | b));
		
	}

}
