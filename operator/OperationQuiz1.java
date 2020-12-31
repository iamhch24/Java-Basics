package operator;

public class OperationQuiz1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int myAge = 23;
		int teacherAge = 38;
		boolean value = (myAge > 25);
		System.out.println(value);
		System.out.println(myAge <= 25);
		System.out.println(myAge == teacherAge );
		char ch;
		ch = (myAge > teacherAge ) ? 'T' : 'F';
		System.out.println(ch);
		
		int num;
		num = -5 + 3 * 10 / 2;
		System.out.println(num);
		
		int num1 = 2; // 0010
		int num2 = 10; // 0110
		System.out.println(num1 & num2);	// 0010 => 2
		System.out.println(num1 | num2);	// 0110 => 10
		System.out.println(num1 ^ num2);	// 0100 => 8
		System.out.println(~num1); 			// 1101 => -3
		
	}

}
