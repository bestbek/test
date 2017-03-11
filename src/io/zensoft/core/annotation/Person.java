package io.zensoft.core.annotation;

import java.util.Comparator;

/**
 * Created by Myktybek on 2/8/17.
 */
public class Person extends A implements Comparable<Person> {
    private Integer age;
    private String name;


    public Person(Integer age, String name) {
        this.age = age;
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public <T> T run(T t){
        return t;
    }
    @Override
    public int compareTo(Person o) {
        return 0;
    }
}
