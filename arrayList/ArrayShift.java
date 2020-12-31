package arrayList;

import java.util.ArrayList;

public class ArrayShift {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> listNum = new ArrayList<Integer>();
		listNum.add(10);
		listNum.add(20);
		listNum.add(30);
		listNum.add(40);
		listNum.add(50);
		listNum.add(60);
		listNum.add(70);
		listNum.add(80);
		Integer num;
		num = listNum.get(7);
		listNum.remove(7);
		listNum.add(0,num);
		
		for( Integer n : listNum) {
			System.out.println(n);
		}
		
	}

}
