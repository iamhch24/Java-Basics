package chapter2;

public class ExplicitConversion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double dNum1 = 1.2;
		float fNum2 = 0.9F;
		int iNum3 = (int)dNum1 + (int)fNum2;
		int iNum4 = (int)(dNum1 + fNum2);
		System.out.println(iNum3);
		System.out.println(iNum4);
		
		int a = 10;
		double b = 2.0;
		System.out.println("\n<Quiz 4>");
		System.out.println("a+b = "+(int)(a+b));
		System.out.println("a-b = "+(int)(a-b));
		System.out.println("a*b = "+(int)(a*b));
		System.out.println("a/b = "+(int)(a/b));
	}

}
