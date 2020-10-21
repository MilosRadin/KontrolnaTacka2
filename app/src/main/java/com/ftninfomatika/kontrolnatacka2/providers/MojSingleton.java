package com.ftninfomatika.kontrolnatacka2.providers;

public class MojSingleton {

    private static MojSingleton INSTANCE = new MojSingleton();

    private MojSingleton(){};



    public MojSingleton getINSTANCE(){
        return INSTANCE;

    }
}
