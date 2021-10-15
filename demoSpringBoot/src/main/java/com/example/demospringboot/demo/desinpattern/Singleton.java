package com.example.demospringboot.demo.desinpattern;

public class Singleton {
    private static volatile Singleton singleton;

    /**
     * 构造函数私有
     */
    private Singleton(){}
    //    双重检查锁定（DCL）
    public static Singleton getInstance(){
        if (singleton == null){
            synchronized (singleton){
                if (singleton == null){
//                    instance = new Singleton();这句会被展开成
//                    1. 分配内存 2.初始化对象 3. 设置instance指向刚分配的内存地址 。
//                    其中2,3经常被重排序，你想想2在前面的话，如果另一个线程使用对象时，会认为对象不为null，那么它就可以使用对象的成员或者方法，这里就有问题了，因为它在前面的线程里并没有初始化成功
                    singleton = new Singleton();
                }
            }
        }
        return singleton;
    }
}
