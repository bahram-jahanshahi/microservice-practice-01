package ir.afarinesh.salesmanagementservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableDiscoveryClient
@EnableFeignClients("ir.afarinesh.salesmanagementservice")
public class SalesManagementServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(SalesManagementServiceApplication.class, args);
    }

}
