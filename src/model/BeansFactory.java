package model;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;


public class BeansFactory {
    
    private static ApplicationContext ctx = new FileSystemXmlApplicationContext("springhibernate.xml");
    
    public static Object getBean(String str){
    	return ctx.getBean(str);
    }
}
