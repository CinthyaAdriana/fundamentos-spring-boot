package com.creacion.springboot.execute.bean;

public class MyBeanImplement implements MyBean{
    @Override
    public void print() {
        System.out.println("Hola desde implementacion del Bean");
    }
}
