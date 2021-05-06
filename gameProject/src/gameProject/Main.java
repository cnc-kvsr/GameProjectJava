package gameProject;

import java.util.GregorianCalendar;

import gameProject.concretes.SaleManager;
import gameProject.entities.Gamer;
import gameProject.entities.Campaign;
import gameProject.entities.Game;

public class Main {

	public static void main(String[] args) {
		
		Gamer gamer1 = new Gamer();
		gamer1.setId(1);
		gamer1.setFirstName("Kevser");
		gamer1.setLastName("Canca");
		gamer1.setNationalityId("12345678901");
		gamer1.setDateOfBirth(new GregorianCalendar(1990,1,7).getTime());

		Game game1 = new Game();
		game1.setId(1);
		game1.setGameName("Age Of Empires 2");
		game1.setPrice(50);
		
		Campaign campaign1 = new Campaign();
		campaign1.setId(1);
		campaign1.setCampaignCode("1234");
		
		SaleManager saleManager = new SaleManager();
		saleManager.purchase(game1, gamer1);
		
		saleManager.discount(gamer1, campaign1);
		
	}

}
