package com.company;

public class Main {

    public static void main(String[] args) {
        Arithematic obj = new Arithematic();
        Tools.display(obj.add(1, 2));
        Tools.display(obj.sub(3, 2));
        Tools.display(obj.mul(3, 2));
        Tools.display(obj.div(3, 2));
    }
}
