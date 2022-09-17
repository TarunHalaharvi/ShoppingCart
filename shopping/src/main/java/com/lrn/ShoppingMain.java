package com.lrn;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@SpringBootApplication(scanBasePackages = "com.lrn")
@EnableSwagger2
public class ShoppingMain {
    public static void main(String args[])
    {
        SpringApplication.run(ShoppingMain.class,args);
    }
}
