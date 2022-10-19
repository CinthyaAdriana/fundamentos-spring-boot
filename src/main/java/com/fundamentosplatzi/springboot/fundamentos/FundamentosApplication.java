package com.fundamentosplatzi.springboot.fundamentos;

import com.fundamentosplatzi.springboot.fundamentos.bean.MyBean;
import com.fundamentosplatzi.springboot.fundamentos.component.ComponentDependency;
import com.fundamentosplatzi.springboot.fundamentos.component.ComponentTwoImplement;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class FundamentosApplication implements CommandLineRunner {

		private ComponentDependency componentDependency; //Agregar Interfaz como primer paso
	    private MyBean myBean;
		private MyBeanWithDependency myBeanWithDependency;


	    //Inyeccion de dependencia con Spring Boot
	    //Con @Qualifire, estamos llamando a la dependencia 2: "componentTwoImplement"
		public FundamentosApplication(@Qualifier("componentTwoImplement") ComponentDependency componentDependency, MyBean myBean, MyBeanWithDependency myBeanWithDependency){ // Nombre de la dependencia que vamos a inyectar
			this.componentDependency = componentDependency; //Atributos inyectados por constructor
			this.myBean = myBean;
			this.myBeanWithDependency = myBeanWithDependency;
		}

	public static void main(String[] args) {
		SpringApplication.run(FundamentosApplication.class, args);
	}

	@Override
	//run, ejecuta dentro de la aplicacion lo que nosotrs queramos
	public void run(String... args) throws Exception {// metodo implementado de la Interfaz commandLineRunner
    componentDependency.saludar();
	myBean.print(); // llamamos a la implmentacion de la dependencia que es el metodo print
	myBeanWithDependency.printWithDependency();//Esta es la implementacion que esta en la clase
	}
}
