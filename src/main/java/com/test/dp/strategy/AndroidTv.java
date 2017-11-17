package com.test.dp.strategy;

public class AndroidTv extends Television{
        public AndroidTv(TvCapability tvCapability, TvDisplay tvDisplay){
            super(tvCapability,tvDisplay);
        }

    void manufacturer() {
        System.out.println("Google tv cool buddy");
    }
}
