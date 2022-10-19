package com.fundamentosplatzi.springboot.fundamentos;

import com.fundamentosplatzi.springboot.fundamentos.bean.MyOperation;

public class MyBeanWithDependencyImplement implements MyBeanWithDependency {
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
