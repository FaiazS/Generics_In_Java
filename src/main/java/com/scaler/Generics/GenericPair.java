package com.scaler.Generics;

public class GenericPair <T, V> {

    T firstParameter;
    V secondParameter;

    public GenericPair(T firstParameter, V secondParameter){

        this.firstParameter = firstParameter;
        this.secondParameter = secondParameter;
    }

    public < K > K sampleMethod(K firstParameter){

        return firstParameter;

    }
}
