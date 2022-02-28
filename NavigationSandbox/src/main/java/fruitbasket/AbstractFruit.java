package fruitbasket;

import abstractBean.AbstractBean;
import navigation.Navigation;
import navigation.NavigationUtil;

public abstract class AbstractFruit extends AbstractBean {

	private static final long serialVersionUID = 1L;
	
	private String fruit = request.getParameter("fruit");
	
	public String redirect(){
		return new Navigation(NavigationUtil.Home.DASHBOARD_APP).redirect();
	}
	
	public String getFruit() {
		return fruit;
	}

	public void setFruit(String fruit) {
		this.fruit = fruit;
	}
	
	

}
