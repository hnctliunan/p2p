package com.hl.utils.applicationcontext;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

import java.util.Iterator;
import java.util.Map;

public class ContextUtil implements ApplicationContextAware{
	
	private static ApplicationContext applicationContext;
	
	@Override
	public void setApplicationContext(ApplicationContext arg0)throws BeansException {
		applicationContext = arg0;
	}
	
	public static ApplicationContext getApplicationContext(){
		return applicationContext;
	}
	
	public static Object getBean(String name){
		if(applicationContext.containsBean(name)){
			return applicationContext.getBean(name);
		}
		return null;
	}
	public static Object getBean(Class<?> clazz){
		Map<?,?> m = applicationContext.getBeansOfType(clazz);
		if(null == m || m.isEmpty()){
			return null;
		}
		Iterator<?> iter = m.keySet().iterator();
		if(iter.hasNext()){
			String key = iter.next().toString();
			return m.get(key);
		}
		return null;
	}
	
}