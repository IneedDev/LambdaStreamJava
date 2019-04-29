package com.GenericType;

//Box<T> definiowanie typu generycznego
//parametric generic class


public class Box<T> {
    private T item;

    public T getItem() {
        return item;
    }

    public void setItem(T item) {
        this.item = item;
    }
}
