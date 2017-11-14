package com.test.dp.observer;

import java.util.Observable;

public class JobSeeker extends AbstractObserver
{
    public JobSeeker(Observable observable){
       super(observable,"Jobseeker");
    }

}
