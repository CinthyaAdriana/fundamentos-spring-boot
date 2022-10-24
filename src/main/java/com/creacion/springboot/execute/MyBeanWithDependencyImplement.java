package com.creacion.springboot.execute;

import com.creacion.springboot.execute.bean.MyOperation;
import org.apache.juli.logging.Log;
import org.apache.juli.logging.LogFactory;

public class MyBeanWithDependencyImplement implements MyBeanWithDependency {

    Log LOGGER = LogFactory.getLog(MyBeanWithDependencyImplement.class);

   //Aqui estamos inyectando la dependencia
   private MyOperation myOperation;

    public MyBeanWithDependencyImplement(MyOperation myOperation) {
        this.myOperation = myOperation;
    }

    @Override
    public void printWithDependency() {
        int numero = 1;
        System.out.println(myOperation.suma(numero));
        System.out.println("Hola desde la implementacion de un Bean con Dependencia");
    }
}
