package com.test.dp.observer;

import java.util.Observable;
import java.util.Observer;

public abstract class AbstractObserver  implements Observer{
    Observable observable;

    public String getSeeker() {
        return seeker;
    }

    public void setSeeker(String seeker) {
        this.seeker = seeker;
    }

    String seeker;

    public AbstractObserver(Observable observable, String seeker){
        this.observable=observable;
        this.seeker=seeker;
        observable.addObserver(this);
    }
    public void update(Observable observable, Object arg) {
        if(observable instanceof  Consultant){
            System.out.println("Dear  "+getSeeker()+"--> CompanyName "+((Consultant) observable).getCompanyName()

                    +"Jobtype "+((Consultant) observable).getJobType()+" Salary "+((Consultant) observable).getSalary());
        }

    }
}
