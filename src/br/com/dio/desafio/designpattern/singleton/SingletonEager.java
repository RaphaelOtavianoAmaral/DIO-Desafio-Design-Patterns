package br.com.dio.desafio.designpattern.singleton;

public class SingletonEager implements SingletonInterface{

    private static SingletonEager instance = new SingletonEager();

    private SingletonEager() {
        super();
    }

    public static SingletonEager getInstance() {
        return instance;
    }
}
