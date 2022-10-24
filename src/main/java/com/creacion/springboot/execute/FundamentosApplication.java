package com.creacion.springboot.execute;

import com.creacion.springboot.execute.component.ComponentDependency;
import com.creacion.springboot.execute.pojo.UserPojo;
import com.creacion.springboot.execute.bean.MyBean;
import org.apache.juli.logging.Log;
import org.apache.juli.logging.LogFactory;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class FundamentosApplication implements CommandLineRunner {

	private final Log Logger = LogFactory.getLog(FundamentosApplication.class);

		private ComponentDependency componentDependency; //Agregar Interfaz como primer paso
	    private MyBean myBean;
		private MyBeanWithDependency myBeanWithDependency;
		private UserPojo userPojo;


	    //Inyeccion de dependencia con Spring Boot
	    //Con @Qualifire, estamos llamando a la dependencia 2: "componentTwoImplement"
		public FundamentosApplication(@Qualifier("componentTwoImplement") ComponentDependency componentDependency, MyBean myBean, MyBeanWithDependency myBeanWithDependency, UserPojo userPojo){ // Nombre de la dependencia que vamos a inyectar
			this.componentDependency = componentDependency; //Atributos inyectados por constructor
			this.myBean = myBean;
			this.myBeanWithDependency = myBeanWithDependency;
			this.userPojo = userPojo;
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
		System.out.println(userPojo.getEmail() + "-" + userPojo.getPassword());
		Logger.error("Esto es un error en el aplicativo");
		Logger.info("Hemos ingresado al metodo PrintWithDependency");
		Logger.debug("El numero enviado como parametro de la dependencia operacion es: ");
	}
}
