package com.mycompany.programacaoorientadab4;

public class No<T>{
    private T contents;
    private No<T> next;
    private No<T> previous;

    public No(T contents, No<T> next, No<T> previous) {
        this.contents = contents;
        this.next = next;
        this.previous = previous;
    }

    public void setPrevious(No<T> previous) {
        this.previous = previous;
    }

    public void setNext(No<T> next) {
        this.next = next;
    }

    public void setContents(T contents) {
        this.contents = contents;
    }

    public No<T> getNext() {
        return next;
    }

    public No<T> getPrevious() {
        return previous;
    }

    public T getContents() {
        return contents;
    }


    
    
    
    
}
