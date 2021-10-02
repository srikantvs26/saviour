package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.annotation.PropertySources;

import com.example.demo.model.Car;
import com.example.demo.model.Lion;

//@SpringBootApplication
//@PropertySource(value="classpath:car.properties") // give hint to spring boot that our properties are located here.

@SpringBootApplication
@PropertySources(value= {
        @PropertySource(value="classpath:car.properties"),
        @PropertySource(value="classpath:lion.properties"),
})
public class App {

    public static void main(String[] args) {
        ConfigurableApplicationContext applicationContext = SpringApplication.run(App.class, args);
        Car car = applicationContext.getBean(Car.class);
        Lion lion = applicationContext.getBean(Lion.class);
        System.out.println("------------------------------------");
        System.out.println(car);
        System.out.println(lion);
        System.out.println("------------------------------------");
    }

}
