package com.test.dp.singleton;

public class SingletonPerformanceNotMatter {
    private static SingletonPerformanceNotMatter singletonClassObject;

    public synchronized static SingletonPerformanceNotMatter getInstance() {
        if(singletonClassObject==null){
            singletonClassObject=new SingletonPerformanceNotMatter();
        }
        return singletonClassObject;
    }

    private SingletonPerformanceNotMatter() {
    }
}
