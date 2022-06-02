package com.damian.bodzioch.queue;

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
        if (this.i != 0){
            if (this.i == 1){
                i--;
            } else {
                for (int i = 1; i < getI(); i++) {
                    this.queue[i - 1] = this.queue[i];
                }
                this.i--;
            }
        }else {
            System.out.println("Kolejka jest pusta!");
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
        if (this.i == 0){
            System.out.println("Kolejka jest pusta");
        } else {
            for (int i = 0; i < this.i; i++) {
                System.out.print(this.queue[i] + " ");
            }
            System.out.println();
        }
    }

    protected int getI() {
        return i;
    }

    protected int[] getQueue() {
        return queue;
    }

    protected void setI(int i) {
        this.i = i;
    }
}
