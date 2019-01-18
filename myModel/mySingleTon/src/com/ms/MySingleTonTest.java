package com.ms;

public class MySingleTonTest {
    public static void main(String[] args) {
        for (int i = 0; i < 5; i++) {
            MySingleTon mySingleTon = MySingleTon.getMySingleTon();
            System.out.println(mySingleTon);
        }
    }
}
