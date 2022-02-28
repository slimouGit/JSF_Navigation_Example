import javax.annotation.PostConstruct;
import javax.faces.view.ViewScoped;
import javax.inject.Named;

import abstractBean.AbstractBean;
import navigation.Navigation;
import navigation.NavigationUtil;

@Named
@ViewScoped
public class DashboardBean extends AbstractBean {
	
	private static final long serialVersionUID = -1521343383805968169L;
	
	private String greeting;
	
	@PostConstruct
	public void init() {
		this.greeting = "Hello World";
	}
	
	public String redirect(){
		return new Navigation(NavigationUtil.FruitBasket.DASHBOARD_BASKET).redirect();
	}
	
	public String redirect(String fruit){
		return new Navigation(NavigationUtil.FruitBasket.DASHBOARD_BASKET).constructFluentParameters("fruit", fruit).redirect();
	}
	
	public String redirect(String key, String value){
		return new Navigation(NavigationUtil.FruitBasket.DASHBOARD_BASKET).constructFluentParameters(key, value).redirect();
	}
	
	public String redirectPlum(){
		return new Navigation(NavigationUtil.FruitBasket.DASHBOARD_BASKET).constructFluentParameters("fruit", "Plum").redirect();
	}
	
	public String redirectMultiParams(){
		return new Navigation(NavigationUtil.FruitBasket.DASHBOARD_BASKET)
				.constructFluentParameters("fruit", "Plum")
				.constructFluentParameters("customer", "Mimi")
				.redirect();
	}
	
	public String redirectToSpoiledFruits(String fruit){
		return new Navigation(NavigationUtil.FruitBasket.SPOILEDFRUIT_BASKET).constructFluentParameters("fruit", fruit).redirect();
	}

	public String redirectToCarPool(String car){
		return new Navigation(NavigationUtil.CarPool.DASHBOARD_CARPOOL).constructFluentParameters("car", car).redirect();
	}
	
	public String redirectToCarPoolWithMultiParams(){
		return new Navigation(NavigationUtil.CarPool.DASHBOARD_CARPOOL)
				.constructFluentParameters("car", "Smart")
				.constructFluentParameters("customer", "Salim")
				.redirect();
	}

	public String redirectToSportsCarPool(String car){
		return new Navigation(NavigationUtil.CarPool.SPORTSCAR_POOL).constructFluentParameters("car", car).redirect();
	}

	public String getGreeting() {
		return greeting;
	}

	public void setGreeting(String greeting) {
		this.greeting = greeting;
	}
	
	

}
