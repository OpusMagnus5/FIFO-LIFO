package com.damian.bodzioch;

import java.util.ArrayList;
import java.util.Iterator;

public class LIFO extends FIFO{

    public void pop(){
        if (getQueue().size() >= 1){
            getQueue().remove(0);
        } else {
            System.out.println("Nie można wykonać operacji, ponieważ kolejka jest pusta!");
        }
    }
}
