package operator;

public class OperationEx3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num1 = 10;
		int num2 = 10;
		int i = 2;
		boolean t = ((num2 = num2 +10)<10);
		System.out.println(t);
		System.out.println("result");
		boolean value = ((num1 = num1 +10)<10) && ((i=i+2)<10);
		System.out.println(value);
		System.out.println(num1);
		System.out.println(i);
		value = ((num1 = num1 +10)<10) || ((i=i+2)<10);
		System.out.println(value);
		System.out.println(num1);
		System.out.println(i);
		
	}

}
