package gameProject.concretes;

import gameProject.abstracts.SaleService;
import gameProject.entities.Campaign;
import gameProject.entities.Game;
import gameProject.entities.Gamer;

public class SaleManager implements SaleService{


	@Override
	public void purchase(Game game, Gamer gamer) {
		System.out.println(game.getGameName() + " oyunu " + gamer.getFirstName() + " tarafýndan satýn alýnmýþtýr." );
		
	}

	@Override
	public void discount(Gamer gamer, Campaign campaign) {
		System.out.println(campaign.getCampaignCode() + " : indirim kodu " + gamer.getFirstName() + " için uygulandý.");
		
	}

}
