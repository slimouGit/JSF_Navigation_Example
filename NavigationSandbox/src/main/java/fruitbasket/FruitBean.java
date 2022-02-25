package fruitbasket;

import javax.annotation.PostConstruct;
import javax.faces.view.ViewScoped;
import javax.inject.Named;

import abstractBean.AbstractBean;
import navigation.Navigation;
import navigation.NavigationUtil;

@Named
@ViewScoped
public class FruitBean extends AbstractBean  {

	private static final long serialVersionUID = -5431067889768439768L;
	
	private String welcomeToBasket;
	private String fruit = request.getParameter("fruit");
	
	
	@PostConstruct
	public void init(){
		this.welcomeToBasket = "Welcome to your Fruit-Basket";
	}
	
	public String redirect(){
		return new Navigation(NavigationUtil.HOME).redirect();
	}

	public String getWelcomeToBasket() {
		return welcomeToBasket;
	}

	public void setWelcomeToBasket(String welcomeToBasket) {
		this.welcomeToBasket = welcomeToBasket;
	}

	public String getFruit() {
		return fruit;
	}

	public void setFruit(String fruit) {
		this.fruit = fruit;
	}
	
	
	

}
