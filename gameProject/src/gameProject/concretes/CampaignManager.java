package gameProject.concretes;

import gameProject.abstracts.CampaignService;
import gameProject.entities.Campaign;

public class CampaignManager implements CampaignService {

	@Override
	public void addCampaign(Campaign campaign) {
		System.out.println(campaign.getCampaignCode() + ":" + "Kampanya kodu uygulandý!");

	}

	@Override
	public void deleteCampaign(Campaign campaign) {
		System.out.println("Kampanya sona erdi.");

	}

	@Override
	public void updateCampaign(Campaign campaign) {
		System.out.println("Kampanya bilgisi güncelendi!");

	}

}
