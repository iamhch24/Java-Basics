package cooperation;

public class Student {
	public String studentName;
	public int grade;
	public int money;
	
	public Student(String studentName, int money) {
		this.studentName = studentName;
		this.money = money;
	}
	public void takeBus(Bus bus) {
		bus.take(1_000);
		this.money -= 1_000;
	}
	public void takeSubway(Subway subway) {
		subway.take(1_500);
		this.money -= 1_500;
	}
	public void takeTaxi(Taxi taxi) {
		taxi.take(10_000);
		this.money -= 10_000;
	}
	public void showInfo() {
		System.out.println(studentName + "¥‘¿« ≥≤¿∫ µ∑¿∫ "+money+"¿‘¥œ¥Ÿ.");
	}

}
