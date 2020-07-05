package com.train;

import java.util.Scanner;

public class Tester {
    public static void main(String[] args) {
        System.out.println("Please enter number of tikets:");
        Scanner scanner=new Scanner(System.in);
        int ticketnumber=scanner.nextInt();
        System.out.println("How many round-trip tickets:");
        int roundnumber=scanner.nextInt();
        Ticket Tic =new Ticket(ticketnumber,roundnumber);
        Tic.print();


    }
}
