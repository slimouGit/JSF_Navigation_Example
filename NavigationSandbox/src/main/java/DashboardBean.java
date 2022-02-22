import java.io.Serializable;

import javax.annotation.PostConstruct;
import javax.faces.view.ViewScoped;
import javax.inject.Named;

@Named
@ViewScoped
public class DashboardBean implements Serializable {
	
	private static final long serialVersionUID = 5299760616918759889L;

	private String greeting;
	
	@PostConstruct
	public void init() {
		this.greeting = "Hello World";
	}

	public String getGreeting() {
		return greeting;
	}

	public void setGreeting(String greeting) {
		this.greeting = greeting;
	}
	
	

}
