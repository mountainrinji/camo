package pl.mountainrinji.facade.base;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class QueryParams {

	private String queryName;
	private String userId;
	private String userCar;
	public String getQueryName() {
		return queryName;
	}
	public void setQueryName(String queryName) {
		this.queryName = queryName;
	}
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	public String getUserCar() {
		return userCar;
	}
	public void setUserCar(String userCar) {
		this.userCar = userCar;
	}
	
	public QueryParams() {
		super();
	}
	
	public QueryParams(String queryName, String userId, String userCar) {
		super();
		this.queryName = queryName;
		this.userId = userId;
		this.userCar = userCar;
	}
	
	
}
