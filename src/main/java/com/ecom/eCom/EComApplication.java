package com.ecom.eCom;

import org.apache.catalina.core.ApplicationContext;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.ecom.eCom.repositories.ProductoptionsRepo;
import com.ecom.eCom.repositories.ProductsRepo;

import ch.qos.logback.core.net.SyslogOutputStream;

@SpringBootApplication
public class EComApplication {

	public static void main(String[] args) {
	ConfigurableApplicationContext aContext=	SpringApplication.run(EComApplication.class, args);
	ProductsRepo productsRepo=aContext.getBean(ProductsRepo.class);
	ProductoptionsRepo p=aContext.getBean(ProductoptionsRepo.class);
	System.out.println(productsRepo);
	System.out.println(p);
	}
}
