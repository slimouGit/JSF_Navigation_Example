package navigation;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.stream.Collectors;

import navigation.NavigationUtil.UrlTargetModule;

public class Navigation {

	private String target;
	private Map<String, String> parameters = new HashMap<>();
	private boolean facesRedirect = true;

	public Navigation(String target) {
		this.target = target;		
	}
	
	public Navigation(String target, boolean facesRedirect) {
		this.target = target;
		this.facesRedirect = facesRedirect;
	}

	public Navigation(UrlTargetModule target) {
		this.target = target.getFullPath();
	}

	public String redirect() {
		StringBuilder target = new StringBuilder().append(this.target);
		if (!this.parameters.isEmpty()) {
			target.append("?").append(this.parameters.entrySet().stream().map(Objects::toString) 
					.collect(Collectors.joining("&")));
		}
		if (this.facesRedirect) {
			target.append("?faces-redirect=true");
		}
		return target.toString();
	}
	
	public Navigation constructFluentParameters(String key, String value) {
		this.parameters.put(key, value);
		return this;
	}

	/* GETTER/SETTER */

	public String getTarget() {
		return target;
	}

	public void setTarget(String target) {
		this.target = target;
	}

	public Map<String, String> getParameters() {
		return parameters;
	}

	public void setParameters(Map<String, String> parameters) {
		this.parameters = parameters;
	}

	public boolean isFacesRedirect() {
		return facesRedirect;
	}

	public void setFacesRedirect(boolean facesRedirect) {
		this.facesRedirect = facesRedirect;
	}

}
