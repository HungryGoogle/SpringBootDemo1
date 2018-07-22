package com.example.copnfig;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

@Component
@ConfigurationProperties(prefix="leetest")
@PropertySource("classpath:define.properties")
public class ConfigEntity {
    @Value("${leetest.name}")
    private String configName;

    @Value("${leetest.password}")
    private String password;

    public String getPname() {
        return configName;
    }

    public void setPname(String pname) {
        this.configName = pname;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

}
