package com.danilopaixao.design.dynamicfactory;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class DynamicFactory {

    private Properties props;

    public DynamicFactory(String applicationPropertiesFile)
            throws FileNotFoundException, IOException{
        props = new Properties();
        props.load(new FileInputStream(applicationPropertiesFile));
    }
    public <E> E create(Class<E> interceCreated) {
        String className = props.getProperty(interceCreated.getName());
        if(className == null) {
            throw new IllegalArgumentException(
                    "Interface not created");
        }
        try {
            Class clazz = Class.forName(className);
            if (interceCreated.isAssignableFrom(clazz)) {
                return (E) clazz.newInstance();
            } else {
                throw new IllegalArgumentException(
                        "This class do not implement this interface");
            }
        } catch (ClassNotFoundException e) {
            throw new IllegalArgumentException(
                    "This class do not exist",e);
        } catch (Exception e) {
            throw new IllegalArgumentException(
                    "Creation not possible",e);
        }
    }
}
