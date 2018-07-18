package com.retail.ecom.inventory.bootstrap;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@EnableEurekaClient
@SpringBootApplication(scanBasePackages={"com.retail"})
public class InventoryApplication {
	
	public static int inventoryCount=1000;
	public static void main(String[] args) {
        SpringApplication.run(InventoryApplication.class, args);
    }

}
