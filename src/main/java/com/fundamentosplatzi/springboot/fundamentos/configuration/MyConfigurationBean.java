package com.fundamentosplatzi.springboot.fundamentos.configuration;

import com.fundamentosplatzi.springboot.fundamentos.MyBeanWithDependency;
import com.fundamentosplatzi.springboot.fundamentos.MyBeanWithDependencyImplement;
import com.fundamentosplatzi.springboot.fundamentos.bean.*;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MyConfigurationBean {
    @Bean
    public MyBean beanOperation(){
    return new MyBean2Implement(); //Para instanciar la implementacion
    }

    @Bean
    public MyOperation beanOperationOperation(){
        return new MyOperationImplement(); //Para instanciar la implementacion
    }

    @Bean
    public MyBeanWithDependency beanOperationOperationWithDependency(MyOperation myOperation){
        return new MyBeanWithDependencyImplement(myOperation); //Para instanciar la implementacion en esta clase
    }

}
