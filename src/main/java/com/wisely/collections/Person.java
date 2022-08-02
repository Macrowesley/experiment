package com.wisely.collections;

public class Person implements Comparable {
    private String name;
    private Integer age;

    public Person(String name, Integer age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    //实现比较方法
    @Override
    public int compareTo(Object o) {
        Person p = (Person) o;
        return this.age - p.getAge();
    }

    //重写toString方法，输出hashCode改为对象值
    public String toString(){
        return name+":"+age;
    }
}