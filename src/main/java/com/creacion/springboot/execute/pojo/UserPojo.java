package com.creacion.springboot.execute.pojo;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.context.properties.ConstructorBinding;

@ConstructorBinding
@ConfigurationProperties(prefix= "user")
public class UserPojo {
    // propiedades que estan en application.properties

    private String email;
    private String password;
    private String age;

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public UserPojo(String email, String password, String age) {
        this.email = email;
        this.password = password;
        this.age = age;
    }


}
