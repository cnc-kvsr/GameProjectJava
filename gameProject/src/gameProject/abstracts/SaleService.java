package gameProject.abstracts;

import gameProject.entities.Campaign;
import gameProject.entities.Game;
import gameProject.entities.Gamer;

public interface SaleService {
	void purchase(Game game, Gamer gamer);
	void discount(Gamer gamer, Campaign campaign);
	
}
