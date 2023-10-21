package com.cydeo.bean_practice;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

@Configuration
public class AnotherAppConfig {
    //if you want to print one or another- put primary annotation
    //@Primary

    @Bean("String 1")
    public String str1(){
        return "Welcome to Cydeo!";
    }
    @Bean("String 2")
    public String str2(){
        return "Spring Core Practice!";
    }
}
