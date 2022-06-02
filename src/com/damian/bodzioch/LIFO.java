package com.damian.bodzioch;

import java.util.ArrayList;
import java.util.Iterator;

public class LIFO {
    ArrayList<Integer> queue = new ArrayList<>();
    Iterator<Integer> iterator = queue.iterator();

    public int size(){
        return queue.size();
    }

    public void push(int value){
        this.queue.add(value);
    }

    public void pop(){
        if (this.queue.size() >= 1){
            this.queue.remove(0);
        } else {
            System.out.println("Nie można wykonać operacji, ponieważ kolejka jest pusta!");
        }
    }
}
