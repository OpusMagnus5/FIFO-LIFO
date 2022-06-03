package com.damian.bodzioch.queue;

import java.util.ArrayList;

public class FIFO implements Queue{
    private ArrayList<Integer> queue = new ArrayList<>();

    public int size(){
        return this.queue.size();
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

    public void print(){
        if (this.queue.size() == 0){
            System.out.println("Kolejka jest pusta");
        } else {
            System.out.println(this.queue);
        }
    }

    protected ArrayList<Integer> getQueue() {
        return queue;
    }
}
