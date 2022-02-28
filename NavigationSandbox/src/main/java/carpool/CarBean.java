package carpool;

import javax.annotation.PostConstruct;
import javax.faces.view.ViewScoped;
import javax.inject.Named;

@Named
@ViewScoped
public class CarBean extends AbstractCar  {

	private static final long serialVersionUID = -5431067889768439768L;
	
	private String welcomeToCarPool;
	
	@PostConstruct
	public void init(){
		this.welcomeToCarPool = "Welcome to your CarPool";
	}

	public String getWelcomeToCarPool() {
		return welcomeToCarPool;
	}


	public void setWelcomeToCarPool(String welcomeToCarPool) {
		this.welcomeToCarPool = welcomeToCarPool;
	}

}
