package com.technogadgets.ph;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;




@SpringBootApplication
public class TechnoGadgetGuyPhApplication extends SpringBootServletInitializer {

	

/**
 * @param args Arguments
*/

	public static void main(String[] args){
		SpringApplication.run(TechnoGadgetGuyPhApplication.class, args);
	}
		
		//SpringApplication.run(TechnoGuyPhApplication.class, args);
		//SpringApplication application = new SpringApplication(TechnoGadgetGuyPhApplication.class);
		/* Setting Boot banner off default value is true */
		//application.setBannerMode(Banner.Mode.OFF);
		//application.run(args);
		//}

		/**
		  * @param builder a builder for the application context
		  * @return the application builder
		  * @see SpringApplicationBuilder
		 */
		// @Override
		// protected SpringApplicationBuilder configure(SpringApplicationBuilder 
		//  builder) {
		  //  return super.configure(builder);
		 //  }
    

}
