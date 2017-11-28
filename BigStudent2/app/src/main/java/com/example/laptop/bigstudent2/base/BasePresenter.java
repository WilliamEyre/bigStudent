package com.example.laptop.bigstudent2.base;

/**
 * Created by Laptop on 2017/11/28.
 */
public abstract class BasePresenter<M,V> {
    public M baseModle;
    public V baseView;
    public void setMV(M m,V v){
        baseModle = m;
        baseView = v;
        this.onStart();
    }
    public abstract void onStart();
}
