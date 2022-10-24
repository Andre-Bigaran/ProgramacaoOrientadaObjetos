package com.mycompany.programacaoorientadab4;

public class Executor {
    public static void main(String[] args) {

        List list = new List();
        System.out.println(list.getSize());
        System.out.println("");

        list.addStart(5);
        list.addEnd(6);
        list.addEnd(7);
        list.addEnd(8);
        System.out.println(list.getSize());

        System.out.println("");
        list.showNos();
        System.out.println("");
       
        System.out.println("Growing");
        list.growing();
        System.out.println("Decescending");
        list.descending();
    }
    
    
}
