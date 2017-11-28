package com.example.laptop.bigstudent2.utils;

import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;

/**
 * Created by Laptop on 2017/11/28.
 */
public class Tutils {
    private static Class<?> aClass;
    private static Type gener;
    private static Type[] actual;
    public static <T>T getT(Object o,int i){
        try {
            aClass = o.getClass();
            gener = aClass.getGenericSuperclass();
            actual = ((ParameterizedType) gener).getActualTypeArguments();
            Type type = actual[i];
            return ((Class<T>)type).newInstance();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }
        return null;
    }
}
