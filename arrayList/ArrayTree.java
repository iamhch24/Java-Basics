package arrayList;

public class ArrayTree {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i=0;i<10;i++) {
			for(int j=0;j<10-i-1;j++) {
				System.out.print(" ");
			}
			for(int z=0;z<i+1;z++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
