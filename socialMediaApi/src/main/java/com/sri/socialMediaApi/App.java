package com.sri.socialMediaApi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;


// import org.apache.logging.log4j.Logger;
//import org.apache.logging.log4j.xml.DOMConfigurator;


@ComponentScan("com.sri.socialMediaApi")
@SpringBootApplication
public class App 
{
	public static void main( String[] args )
    {
   	SpringApplication.run(App.class, args);
    	//Line below is an easy marker to spot while launching server		
    	System.out.println( "-----------------Successful Launch!---------------" );
    }
}