/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ca.bc.gov.health.beans;

import java.util.Properties;
import javax.annotation.PostConstruct;
import javax.annotation.Resource;
import javax.inject.Named;

/**
 *
 * @author trevor.schiavone
 */
@Named
public class SomeBean {
    
    @Resource(name = "java:app/testApp/test_properties")
    Properties testProperties;
    
    private String testProperty;
    
    @PostConstruct
    private void init() {     
        testProperty = testProperties.getProperty("testProperty");
    }

    public String getTestProperty() {
        return testProperty;
    }

    
}
