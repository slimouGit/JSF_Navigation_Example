package carpool;

import abstractBean.AbstractBean;
import navigation.Navigation;
import navigation.NavigationUtil;

public abstract class AbstractCar extends AbstractBean {

	private static final long serialVersionUID = 1L;
	
	private String car = request.getParameter("car");
	
	public String redirect(){
		return new Navigation(NavigationUtil.Home.DASHBOARD_APP).redirect();
	}
	
	public String getCar() {
		return car;
	}

	public void setCar(String car) {
		this.car = car;
	}
	

}
