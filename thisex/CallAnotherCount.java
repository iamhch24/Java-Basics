package thisex;

class Person {
	String name;
	int age;
	
	Person(){
		this("이름 없음",1);
	}
	Person(String name, int age){
		this.name = name;
		this.age = age;
	}
	Person returnItSelf() {
		return this;
	}

}

public class CallAnotherCount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person noName = new Person();
		System.out.println(noName.name);
		System.out.println(noName.age);
//		Person p = noName.returnItSelf();
		Person p = noName;
		System.out.println(p);
		System.out.println(noName);
	}
}
