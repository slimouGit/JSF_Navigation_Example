package carpool.sportscar;

import javax.annotation.PostConstruct;
import javax.faces.view.ViewScoped;
import javax.inject.Named;

import carpool.AbstractCar;
import navigation.Navigation;
import navigation.NavigationUtil;

@Named
@ViewScoped
public class SportscarBean extends AbstractCar  {

	private static final long serialVersionUID = -5431067889768439768L;
	
	private String welcomeToCarPool;
	
	
	
	@PostConstruct
	public void init(){
		this.welcomeToCarPool = "Welcome to your Sports-CarPool";
	}
	
	public String redirectToCarPool(){
		return new Navigation(NavigationUtil.CarPool.DASHBOARD_CARPOOL).redirect();
	}

	public String getWelcomeToCarPool() {
		return welcomeToCarPool;
	}


	public void setWelcomeToCarPool(String welcomeToCarPool) {
		this.welcomeToCarPool = welcomeToCarPool;
	}

}
