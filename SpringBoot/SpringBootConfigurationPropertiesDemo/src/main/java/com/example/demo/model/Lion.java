package com.example.demo.model;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@ConfigurationProperties
@Component
public class Lion {

    private String lionName;
    private Integer kills;
    
    public String getLionName() {
        return lionName;
    }
    public void setLionName(String lionName) {
        this.lionName = lionName;
    }
    public Integer getKills() {
        return kills;
    }
    public void setKills(Integer kills) {
        this.kills = kills;
    }
    @Override
    public String toString() {
        return "Lion [lionName=" + lionName + ", kills=" + kills + "]";
    }

    // 1. I want to read these car properties from configuration file.
    // So, We want to annotate this class with @ConfigurationProperties.

}
