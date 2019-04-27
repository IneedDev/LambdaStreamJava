package com.SreamTasks;

import java.util.Objects;

public class Person {
    private int age;
    private String name;
    private String sureName;

    public Person(int age, String name, String sureName) {
        this.age = age;
        this.name = name;
        this.sureName = sureName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSureName() {
        return sureName;
    }

    public void setSureName(String sureName) {
        this.sureName = sureName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return age == person.age &&
                Objects.equals(name, person.name) &&
                Objects.equals(sureName, person.sureName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(age, name, sureName);
    }

    @Override
    public String toString() {
        return "Person{" +
                "age=" + age +
                ", name='" + name + '\'' +
                ", sureName='" + sureName + '\'' +
                '}';
    }
}
