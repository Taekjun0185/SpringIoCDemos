package springIoCDemos.ktj.ioc.containeroverview;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import springIoCDemos.ktj.ioc.containeroverview.config.AppConfig;
import springIoCDemos.ktj.ioc.containeroverview.service.PetStoreServiceImpl;

public class MainApplication {
	
	public static void LocalVariableScope() {
		String hello = "Hello";
	}
	
    public static void main(String[] args) {
    	
    	//hello = "World  // 이것이 스코프 메서드에는 쓸수있지만 메인 메서드는 불가능
    	
        ApplicationContext context = 
        		new AnnotationConfigApplicationContext
        		(AppConfig.class);

        PetStoreServiceImpl petStoreService = 
        		context.getBean(PetStoreServiceImpl.class);
        
        // petStoreService를 사용하여 비즈니스 로직 수행
        petStoreService.addItem("dog");
    }
}
