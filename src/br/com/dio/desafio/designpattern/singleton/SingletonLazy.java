package br.com.dio.desafio.designpattern.singleton;

public class SingletonLazy implements SingletonInterface {

    private static SingletonLazy instance;

    private SingletonLazy(){
        super();
    }

    public static SingletonLazy getInstance() {
        if(instance==null){
            instance = new SingletonLazy();
        }
        return instance;
    }
}
