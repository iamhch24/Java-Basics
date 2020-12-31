package CardComapny;


public class CardCompany {
	private static CardCompany instance = new CardCompany();
	private static int idNumber = 1000;
	private CardCompany(){ }
	public static CardCompany getInstance() {
		if(instance == null) {
			instance = new CardCompany();
		}
		return instance;
	}
	 
	public static int getIdNumber() {
		return ++idNumber;
	}
	
	public Card createCard() {
		
		Card card = new Card();
		return card;
	}

}
