package fruitbasket.spoiledfruit;

import javax.annotation.PostConstruct;
import javax.faces.view.ViewScoped;
import javax.inject.Named;

import fruitbasket.AbstractFruit;

@Named
@ViewScoped
public class SpoiledfruitBean extends AbstractFruit  {

	private static final long serialVersionUID = -5431067889768439768L;
	
	private String welcomeToBasket;
	
	
	@PostConstruct
	public void init(){
		this.welcomeToBasket = "Welcome to your Spoiled-Fruit-Basket";
	}

	public String getWelcomeToBasket() {
		return welcomeToBasket;
	}

	public void setWelcomeToBasket(String welcomeToBasket) {
		this.welcomeToBasket = welcomeToBasket;
	}
	

}
