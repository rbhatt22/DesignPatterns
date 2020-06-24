package com.rbhatt.practice.singleton;

//Singleton pattern example
public class DbSingleton {

    //static private instance
    //volatile to make it thread safe and ensure only single instance within JVM
    private static volatile DbSingleton instance = null;

    //private constructor which prevents creation of new intance.
    private DbSingleton() {
        //to protect against reflection
        if (instance != null) {
            throw new RuntimeException("use getInstance() method to create instance");
        }
    }

    //getInstance public method which returns private instance.
    public static DbSingleton getInstance() {

        //Lazy loading
        if (instance == null) {
            //protection against reflection
            synchronized (DbSingleton.class) {
                if (instance == null) {
                    instance = new DbSingleton();
                }
            }
        }
        return instance;
    }


}
