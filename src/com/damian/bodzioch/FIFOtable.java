package com.damian.bodzioch;

import java.util.ArrayList;

public class FIFOtable {
    private int i = 0;
    private int[] queue = new int[1];

    public int size(){
        return i;
    }

    public void push(int value){
        this.queue[i] = value;
        this.i++;
        if (checkSizeTable()){
            increaseSizeOfTable();
        }
    }

    public void pop(){
        if (this.queue.length != 0){
            this.queue[i - 1] = 0;
            i--;
        } else {
            System.out.println("Operacja nieudana, kolejka jest już pusta!");
        }
    }

    private boolean checkSizeTable(){
        if (this.queue.length == i){
            return true;
        }
        return false;
    }

    private void increaseSizeOfTable(){
        int[] tempQueue = this.queue.clone();
        this.queue = new int[i + (int) (this.queue.length * Math.sqrt(2))];
        for (int i = 0; i < tempQueue.length; i++){
            this.queue[i] = tempQueue[i];
        }
    }

    public void print(){
        for (int i = 0; i < this.i - 1; i++){
            System.out.print(this.queue[i] + " ");
        }
    }

    public int getI() {
        return i;
    }

    public int[] getQueue() {
        return queue;
    }

    public void setI(int i) {
        this.i = i;
    }
}
