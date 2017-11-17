package com.test.dp.singleton;

public class SingletonPerformanceMatters {
    private SingletonPerformanceMatters(){

    }
    private SingletonPerformanceMatters singletonClassObject;

    public SingletonPerformanceMatters getSingletonClassObject() {
        if(singletonClassObject==null){
            synchronized (this){
                if(singletonClassObject==null){
                    singletonClassObject=new SingletonPerformanceMatters();
                }
            }
        }

        return singletonClassObject;
    }
}
