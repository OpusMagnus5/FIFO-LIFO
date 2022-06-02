package com.damian.bodzioch;

public class LIFOtable extends FIFOtable{
        public void pop(){
            if (getQueue().length != 0){
                if (getQueue().length == 1){
                    setI(getI() - 1);
                } else {
                    for (int i = 1; i < getI(); i++) {
                        getQueue()[i - 1] = getQueue()[i];
                    }
                }
            }
        }
}
