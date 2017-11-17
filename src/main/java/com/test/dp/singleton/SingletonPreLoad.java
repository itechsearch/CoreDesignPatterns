package com.test.dp.singleton;

/*Use below type only when lazy loading of object is not a big deal*/
public class SingletonPreLoad {
    private SingletonPreLoad(){

    }
    private SingletonPreLoad singletonExample=new SingletonPreLoad();

    public SingletonPreLoad getSingletonExample() {
        return singletonExample;
    }
}
