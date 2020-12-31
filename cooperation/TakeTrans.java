package cooperation;

public class TakeTrans {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student studentJames = new Student("James",5_000);
		Student studentTomas = new Student("Tomas",10_000);
		Student studentEdward = new Student("Edward",100_000);
		
		
		Bus bus100 = new Bus(100);
		studentJames.takeBus(bus100);
		studentJames.showInfo();
		bus100.showInfo();
		
		Subway subwayGreen = new Subway("2È£¼±");
		studentTomas.takeSubway(subwayGreen);
		studentTomas.showInfo();
		subwayGreen.showInfo();
		
		Taxi taxi = new Taxi();
		studentEdward.takeTaxi(taxi);
		studentEdward.showInfo();
		taxi.showInfo();
		
		
	}

}
