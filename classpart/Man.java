package classpart;

public class Man {

	private String name;
	private int age;
	private boolean isMarried;
	private char gender;
	private int nChildren;
	
	public void setName(String name) {
		this.name = name;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public void setIsMarried(boolean isMarried) {
		this.isMarried = isMarried;
	}
	public void setGender(char gender) {
		this.gender = gender;
	}
	public void setNChildren(int nChildren) {
		this.nChildren = nChildren;
	}
	public String getName() {
		return this.name;
	}
	public int getAge() {
		return this.age;
	}
	public boolean getIsMarried() {
		return this.isMarried;
	}
	public char getGender() {
		return this.gender;
	}
	public int getNChildren() {
		return this.nChildren;
	}	
	public void showInfo() {
		System.out.println("�� ����� �̸� : "+this.name);
		System.out.println("�� ����� ���� : "+this.age);
		System.out.println("�� ����� ���� : "+this.gender);
		System.out.println("�� ����� ��ȥ���� : "+this.isMarried);
		System.out.println("�� ����� �ڳ� �� : "+this.nChildren);
	}
	

	

}
