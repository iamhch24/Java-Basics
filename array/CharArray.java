package array;

public class CharArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char[] alphabets = new char[26];
		char ch = 'A';
		
		for (int i = 0; i<alphabets.length;i++,ch++) {
			alphabets[i]=ch;
		}
		for (int i = 0; i<alphabets.length;i++) {
			System.out.println(alphabets[i]+","+(int)alphabets[i]);
		}
	}

}
