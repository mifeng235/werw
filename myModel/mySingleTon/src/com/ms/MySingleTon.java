package com.ms;

public class MySingleTon {
//    饿汉模式
//    注意 MySingleTon 的权限修饰符为 static final
//    private static final MySingleTon mySingleTon = new MySingleTon();
//    构造方法一定为 private
//    private MySingleTon() {
//    }
//    获取单例对象的方法为 static
//    public static MySingleTon getMySingleTon() {
//        return mySingleTon;
//    }
//    单例类中的其他方法尽量都为 static

//    懒汉模式
    private  static  MySingleTon mySingleTon;
    private MySingleTon() {
    }
    public static synchronized MySingleTon getMySingleTon() {
        if (mySingleTon == null) {
            mySingleTon = new MySingleTon();
        }
        return mySingleTon;
    }
}
