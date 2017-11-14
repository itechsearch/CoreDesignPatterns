package com.test.dp.observer;

import java.util.Observable;

public class Fresher extends  AbstractObserver{
    public Fresher(Observable observable){
        super(observable,"Fresher");
    }
}
