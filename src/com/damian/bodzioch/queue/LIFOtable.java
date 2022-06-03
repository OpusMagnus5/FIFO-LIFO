package com.damian.bodzioch.queue;

public class LIFOtable extends FIFOtable implements Queue{
        public void pop(){
            if (getI() != 0){
                getQueue()[getI() - 1] = 0;
                setI(getI() - 1);
            } else {
                System.out.println("Operacja nieudana, kolejka jest już pusta!");
            }
        }
}
