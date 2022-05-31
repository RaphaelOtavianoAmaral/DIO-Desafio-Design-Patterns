package br.com.dio.desafio.designpattern.singleton;

public class SingletonLazyHolder implements SingletonInterface {

    private static class InstanceHolder{
        public static SingletonLazyHolder instance = new SingletonLazyHolder();
    }

    private SingletonLazyHolder(){
        super();
    }

    public static SingletonInterface getInstance(){
        return InstanceHolder.instance;
    }
}
