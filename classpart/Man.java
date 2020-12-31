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
		System.out.println("이 사람의 이름 : "+this.name);
		System.out.println("이 사람의 나이 : "+this.age);
		System.out.println("이 사람의 성별 : "+this.gender);
		System.out.println("이 사람의 결혼여부 : "+this.isMarried);
		System.out.println("이 사람의 자녀 수 : "+this.nChildren);
	}
	

	

}
