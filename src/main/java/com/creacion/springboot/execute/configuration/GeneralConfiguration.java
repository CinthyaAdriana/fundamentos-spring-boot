package com.creacion.springboot.execute.configuration;

import com.creacion.springboot.execute.pojo.UserPojo;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Configuration;

@Configuration
@EnableConfigurationProperties(UserPojo.class) //clase Pojo habilitada para inyectar como dependencia en cualquier parte
public class GeneralConfiguration {


}
