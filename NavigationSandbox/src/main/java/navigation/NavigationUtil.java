package navigation;

import java.util.Optional;

public class NavigationUtil {

	private static final String BASE_PATH = "faces";

	private enum ContextPath {
		FRUITBASKET("fruitbasket"), CARPOOL("carpool"), HOME("");

		private final String path;

		ContextPath(String path) {
			this.path = path;
		}

		public String getPath() {
			return BASE_PATH + "/" + path;
		}
	}

	public enum FruitBasket implements UrlTargetModule {
		DASHBOARD_BASKET(ContextPath.FRUITBASKET, "fruit"),
		SPOILEDFRUIT_BASKET(ContextPath.FRUITBASKET, "spoiledfruits/spoiledfruit");

		private final String path;
		private final String contextPath;

		FruitBasket(String path) {
			this.contextPath = ContextPath.FRUITBASKET.getPath();
			this.path = path;
		}

		FruitBasket(ContextPath contextPath, String path) {
			this.contextPath = Optional.ofNullable(contextPath).map(ContextPath::getPath).orElse("");
			this.path = path;
		}

		@Override
		public String getPath() {
			return this.path;
		}

		@Override
		public String getContextPath() {
			return this.contextPath;
		}
	}

	public enum CarPool implements UrlTargetModule {
		DASHBOARD_CARPOOL(ContextPath.CARPOOL, "car"),
		SPORTSCAR_POOL(ContextPath.CARPOOL, "sportscars/sportscar");

		private final String path;
		private final String contextPath;

		CarPool(String path) {
			this.contextPath = ContextPath.CARPOOL.getPath();
			this.path = path;
		}
		
		CarPool(ContextPath contextPath, String path) {
			this.contextPath = Optional.ofNullable(contextPath).map(ContextPath::getPath).orElse("");
			this.path = path;
		}

		@Override
		public String getPath() {
			return this.path;
		}

		@Override
		public String getContextPath() {
			return this.contextPath;
		}
	}
	
	
	public enum Home implements UrlTargetModule {
		DASHBOARD_APP(ContextPath.HOME, "index");

		private final String path;
		private final String contextPath;

		Home(String path) {
			this.contextPath = ContextPath.CARPOOL.getPath();
			this.path = path;
		}
		
		Home(ContextPath contextPath, String path) {
			this.contextPath = Optional.ofNullable(contextPath).map(ContextPath::getPath).orElse("");
			this.path = path;
		}

		@Override
		public String getPath() {
			return this.path;
		}

		@Override
		public String getContextPath() {
			return this.contextPath;
		}
		
		public String getFullPath() {
			return "/" + getPath() + ".xhtml";
		}
	}

	public interface UrlTargetModule {

		String getPath();

		String getContextPath();

		default String getFullPath() {
			return "/" + getContextPath() + "/" + getPath() + ".xhtml";
		}
	}

}
