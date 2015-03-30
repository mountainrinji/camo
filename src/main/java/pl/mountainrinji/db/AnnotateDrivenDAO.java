package pl.mountainrinji.db;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;

import org.springframework.context.ApplicationEvent;
import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;

import pl.mountainrinji.spring.ApplicationContextProvider;

public class AnnotateDrivenDAO implements ApplicationListener<ApplicationEvent> {
	
	private Map<CTQuery, BeanMethod> oneValueQueries = new HashMap<CTQuery, BeanMethod>();

	@Override
	public void onApplicationEvent(ApplicationEvent event) {
		if (event instanceof ContextRefreshedEvent) {
			init();
		}		
	}
			
	private void init() {
		Map<String, Object> beansWithAnnotation = 
				ApplicationContextProvider.getApplicationContext().getBeansWithAnnotation(OneValueQueryContainer.class);
		for (Object bean : beansWithAnnotation.values()) {
			Method[] methods = bean.getClass().getMethods();
			for (Method method : methods) {
				if (method.isAnnotationPresent(OneValueQueryMethod.class)) {
					OneValueQueryMethod[] annotationsByType = method.getAnnotationsByType(OneValueQueryMethod.class);
					oneValueQueries.put(CTQuery.valueOf(annotationsByType[0].queryName()), new BeanMethod(bean, method));
				}
			}
		}
	}
	
	public Object executeOneValueQuery(CTQuery queryName) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
		return oneValueQueries.get(queryName).method.invoke(oneValueQueries.get(queryName).bean);
	}

}
