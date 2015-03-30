package pl.mountainrinji.db;

import java.lang.reflect.Method;

public class BeanMethod {
	
	public Object bean;
	public Method method;
	
	public BeanMethod(Object bean, Method method) {
		this.bean = bean;
		this.method = method;
	}

}
