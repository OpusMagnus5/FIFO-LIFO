package com.damian.bodzioch;

import java.util.ArrayList;
import java.util.Iterator;

public class FIFO {
    private ArrayList<Integer> queue = new ArrayList<>();
    private Iterator<Integer> interator = queue.iterator();

    public int size(){
        return this.queue.size();
    }

    public void push(int value){
        this.queue.add(value);
    }

    public void pop(){
        if (this.queue.size() >= 1) {
            this.queue.remove(queue.size() - 1);
        } else {
            System.out.println("Nie można wykonać operacji, ponieważ kolejka jest pusta!");
        }
    }

    public void print(){
        System.out.println(this.interator);
    }

    public ArrayList<Integer> getQueue() {
        return queue;
    }
}
