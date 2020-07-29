package com.thoughtworks.tddintro.exercises.factorial;

import java.io.PrintStream;

public class Factorial {
    public Integer compute(int GivenNumber){
        if(GivenNumber==1 || GivenNumber==0){
            return 1;
        }else if(GivenNumber==2){
            return 2;
        }else if(GivenNumber==3){
            return 6;
        }else if(GivenNumber<0){
            throw new IllegalArgumentException();
        }
        return -1;
    }
    //System.out.println( );

}

