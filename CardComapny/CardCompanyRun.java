package CardComapny;

public class CardCompanyRun {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CardCompany bcCard = CardCompany.getInstance();
		Card myCard = bcCard.createCard();
		Card wifeCard = bcCard.createCard();
		System.out.println(myCard.getCardNum());
		System.out.println(wifeCard.getCardNum());		
	}

}
