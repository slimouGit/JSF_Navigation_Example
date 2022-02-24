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
		return new Navigation(NavigationUtil.FRUITBASKET).redirect();
	}
	
	public String redirect(String fruit){
		return new Navigation(NavigationUtil.FRUITBASKET).constructFluentParameters("fruit", fruit).redirect();
	}

	public String getGreeting() {
		return greeting;
	}

	public void setGreeting(String greeting) {
		this.greeting = greeting;
	}
	
	

}
