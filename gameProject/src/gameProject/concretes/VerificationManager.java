package gameProject.concretes;

import gameProject.abstracts.VerificationService;
import gameProject.entities.Gamer;

public class VerificationManager implements VerificationService{

	@Override
	public void verify(Gamer gamer) {
		System.out.println("Oyuncu Bilgileri Doðrulandý");
		
	}

}
