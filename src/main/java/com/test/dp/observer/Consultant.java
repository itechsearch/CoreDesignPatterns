package com.test.dp.observer;


import java.util.Observable;

public class Consultant extends Observable {
    private String companyName;
    private int salary;
    private String jobType;

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public String getJobType() {
        return jobType;
    }

    public void setJobType(String jobType) {
        this.jobType = jobType;
    }

    public Consultant(){
    }

    private void setNewJobArrived() {
        setChanged();
        notifyObservers();
    }

    public void addNewJobDetails(String companyName,int salary,String jobType){
        this.companyName=companyName;
        this.salary=salary;
        this.jobType=jobType;
        setNewJobArrived();
    }

}
