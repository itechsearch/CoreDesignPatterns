package com.test.dp.observer;

public class TestRun
{
    public static void main(String[] args) {
        Consultant consultant=new Consultant();
        JobSeeker jobSeeker=new JobSeeker(consultant);
        Fresher fresher=new Fresher(consultant);
        consultant.addNewJobDetails("MS",123465,"DEVS");
    }
}
