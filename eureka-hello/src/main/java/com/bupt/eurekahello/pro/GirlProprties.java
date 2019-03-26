package com.bupt.eurekahello.pro;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@ConfigurationProperties(prefix="girl")
@Component
public class GirlProprties {
    private String name;
    private int age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "GirlProprties{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
