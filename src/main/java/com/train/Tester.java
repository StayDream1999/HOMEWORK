package com.train;

import java.util.Scanner;

public class Tester {
    public static void main(String[] args) {
        int ticketnumber = -2;
        Scanner scanner = new Scanner(System.in);
        while (ticketnumber != -1){
            System.out.println("Please enter number of tikets:");
            ticketnumber = scanner.nextInt();
            if (ticketnumber==-1){
            break;}else {
            System.out.println("How many round-trip tickets:");
            int roundnumber = scanner.nextInt();
            Ticket Tic = new Ticket(ticketnumber, roundnumber);
            Tic.print();
        }}
        System.out.println("work done!!");


        }
    }

