package com.mycompany.programacaoorientadab4;

public class List<T> {

    private No<T> one;
    private int size;

    public List() {
        one = null;
        size = 0;
    }

    public int getSize() {
        return size;
    }

    public void addStart(T contents) {
        No<T> newNo = new No<T>(contents, null, null);
        one = newNo;
        size++;
    }

    public void showNos() {
        if (size != 0) {
            No<T> current = one;
            int counter = 0;
            while (current.getNext() != null) {
                System.out.println("The node content at position " + counter + " it's the same as: " + current.getContents());
                current = current.getNext();
                counter++;
            }
            System.out.println("The node content at position " + counter + " it's the same as: " + current.getContents());
        } else {
            System.out.println("There is no element in the list.\n");
        }
    }

    public void addEnd(T contents) {
        No<T> endN = this.ShowEndElement();
        No<T> newNo = new No<T>(contents, null, endN);
        if (size == 0) {
            one = newNo;
        } else {
            No<T> current = one;
            while (current.getNext() != null) {
                current = current.getNext();
            }
            current.setNext(newNo);
        }
        size++;
    }

    public void growing(){
        No<T> next = this.one;
        int counter = 0;
        System.out.println("At " + counter + " the value is: " + next.getContents());
        counter++;
        while (next.getNext() != null) {
             next = next.getNext();
             System.out.println("At " + counter + " the value is: " + next.getContents());
             counter++;
            }
    }
    public void descending(){
        No<T> end = this.ShowEndElement();
        int counter = 0;
        System.out.println("At " + counter + " the value is: " + end.getContents());
        counter++;
        while (end.getPrevious() != null) {
            end = end.getPrevious();
             System.out.println("At " + counter + " the value is:" + end.getContents());
            counter++;
            }
    }

    private No<T> ShowEndElement(){

        No<T> end = one;


        while (end.getNext() != null) {

            end = end.getNext();
        }

        return end;

    }

}