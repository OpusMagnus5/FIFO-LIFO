package com.damian.bodzioch.queue;

public class LIFO extends FIFO{

    public void pop(){
        if (getQueue().size() >= 1) {
            getQueue().remove(getQueue().size() - 1);
        } else {
            System.out.println("Nie można wykonać operacji, ponieważ kolejka jest pusta!");
        }
    }
}
