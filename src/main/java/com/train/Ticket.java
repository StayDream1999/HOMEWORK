package com.train;

public class Ticket {
    int ticketnumber;
    int roundnumber;
    public Ticket(int ticketnumber,int roundnumber){
        this.ticketnumber= ticketnumber;
        this.roundnumber=roundnumber;

    }
    public void print(){
        System.out.println("Total ticket:"+ticketnumber);
        System.out.println("Round-trip:"+roundnumber);
        System.out.println("Total:"+((ticketnumber-roundnumber)*1000+roundnumber*1800));

    }
}
