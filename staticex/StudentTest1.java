package staticex;

public class StudentTest1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student studentLee = new Student();
		studentLee.setStudentName("이지원");
		System.out.println(Student.serialNum);
		Student.serialNum++;
		Student studentSon = new Student();
		studentSon.setStudentName("손수경");
		System.out.println(Student.serialNum);
		System.out.println(Student.serialNum);
	}

}
