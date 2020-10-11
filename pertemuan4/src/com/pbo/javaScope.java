package com.pbo;

public class javaScope {
    public static void main(String[] args) {
        //code here cannot use x

        {
            int x = 100;

            System.out.println(x);

        }
    }
}
