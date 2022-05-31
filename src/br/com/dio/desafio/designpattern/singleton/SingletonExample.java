package br.com.dio.desafio.designpattern.singleton;


public class SingletonExample {


    private static void getInstanceLazy() {
        SingletonInterface singleton = SingletonLazy.getInstance();
        System.out.println("Instância Singleton Lazy: "+singleton);
    }

    private static void getInstanceEager() {
        SingletonInterface singleton = SingletonEager.getInstance();
        System.out.println("Instância Singleton Eager: "+singleton);
    }


    private static void getInstanceLazyHolder() {
        SingletonInterface singleton = SingletonLazyHolder.getInstance();
        System.out.println("Instância Singleton  Holder: "+singleton);
    }

    public static void main(String[] args) {
        SingletonExample.getInstanceLazy();
        SingletonExample.getInstanceEager();
        SingletonExample.getInstanceLazyHolder();
    }
}
