package com.creacion.springboot.execute.configuration;

import com.creacion.springboot.execute.MyBeanWithDependency;
import com.creacion.springboot.execute.MyBeanWithDependencyImplement;
import com.creacion.springboot.execute.bean.MyBean2Implement;
import com.creacion.springboot.execute.bean.MyOperation;
import com.creacion.springboot.execute.bean.MyOperationImplement;
import com.creacion.springboot.execute.bean.MyBean;
import com.fundamentosspring.springboot.fundamentos.bean.*;
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
