package io.zensoft.core.annotation;


/**
 * Created by Myktybek on 1/30/17.
 */
@MyAnnotation(value = 11)
public class Employee extends Person {

    private String id;

    private Integer salary;

    public Employee() {
    }

    public Employee(Integer age, String name) {
        super(age, name);
    }

    public Integer getSalary() {
        Person per = new Person();
        return salary;
    }

    public void setSalary(Integer salary) {
        this.salary = salary;
    }
}
