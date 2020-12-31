package staticex;

public class Student {
	public static int serialNum = 1_000;
//	static {
//		serialNumber = 1_000;
//	}
	int studentId;
	String studentName;
	int grade;
	String address;
	Student(){
//		serialNumber = 100;
	}
	public String getStudentName() {
//		serialNumber = 10;
		return this.studentName;
	}
	public void setStudentName(String name) {
		studentName = name;
	}
}
