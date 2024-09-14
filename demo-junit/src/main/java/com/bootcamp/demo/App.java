package com.bootcamp.demo;


public class App {
    
    public static int combine(int x, int y){
        if (x >= 10 && y >= 3)
            return subtract(x, y);
        return sum(x, y);
    }

    public static int subtract(int x, int y){
        return x - y;
    }
    public static int sum(int x, int y){
        return x + y;
    }
    public static int divid(int x, int y){
        return x / y;
    }
}
