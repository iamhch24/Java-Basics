package staticex;

public class StudentTest1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student studentLee = new Student();
		studentLee.setStudentName("������");
		System.out.println(Student.serialNum);
		Student.serialNum++;
		Student studentSon = new Student();
		studentSon.setStudentName("�ռ���");
		System.out.println(Student.serialNum);
		System.out.println(Student.serialNum);
	}

}
