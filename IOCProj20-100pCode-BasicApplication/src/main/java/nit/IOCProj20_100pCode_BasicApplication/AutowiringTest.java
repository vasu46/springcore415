package nit.IOCProj20_100pCode_BasicApplication;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.nt.config.AppConfig;
import com.nt.sbeans.WishMessageGenerator;

public class AutowiringTest {

	public static void main(String[] args) {
		//IOC CONTAINER CREATE                                                        //TAKES the given java class as the configuration
		AnnotationConfigApplicationContext ctx=new AnnotationConfigApplicationContext(AppConfig.class);
		System.out.println("==================================");
		//get Spring bean class object ref
		WishMessageGenerator generator=ctx.getBean("wmg",WishMessageGenerator.class);
		System.out.println("---------------------------------------");
		//invoke the Method 
		 String result=generator.generateWishMessage("vasu");
		 System.out.println(result);
		 System.out.println("--------------------------------");
		 //close container
		 ctx.close();

	}

}
