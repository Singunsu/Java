package workspace;

public class TypeConversion {

	public static void main(String[] args) 
	{
		byte b = 127;
		int a = 100;
		
		System.out.print(b + a + "\n");
		System.out.print(10/4 + "\n");
		System.out.print(10/4.0 + "\n");
		System.out.print((char)0x12340041 + "\n");
		System.out.print((byte)b + a + "\n");
		System.out.print((int)2.9 + 1.8 + "\n");
		System.out.print((int)2.9 + 1.8 + "\n");
		System.out.print((int)2.9 + (int)1.8);

	}

}
