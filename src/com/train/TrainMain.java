package com.train;

import java.time.LocalDate;
import java.util.LinkedList;
import java.util.List;

public class TrainMain {
    public static void main(String[] args) {
        TrainService.trainBetweenStations(" Delhi","Mumbai", LocalDate.now(),1);
        TrainService.findTrain(102);

        BankAccount b1 = new BankAccount(1234,10000);


        Passenger p1 = new Passenger(1,"Zeeshan",27,b1);
        Passenger p2 = new Passenger(2,"Rohan",28,b1);
        Passenger p3 = new Passenger(3,"Ankit",12,b1);
        List<Passenger> list = new LinkedList<>();
        list.add(p1);
        list.add(p2);
        list.add(p3);

        TrainService.bookTickets(102,list);
    }
}

