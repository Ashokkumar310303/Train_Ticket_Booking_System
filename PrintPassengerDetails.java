package com.practice.TrainTicketBooking;

import java.util.List;
import java.util.Queue;

public class PrintPassengerDetails {
    List<Passenger> list;
    Queue<Passenger> queue;

    public PrintPassengerDetails(List<Passenger> list){
        this.list=list;
        printPassenger(list);
    }

    public PrintPassengerDetails(Queue<Passenger> queue){
        this.queue=queue;
        printPassenger(queue);
    }

    private void printPassenger(List<Passenger> list){
        for(Passenger person:list){
            System.out.println("------------------------------------------");
            System.out.println("Passenger Id:"+person.getId());
            System.out.println("Passenger Name:"+person.getName());
            System.out.println("Passenger Age:"+person.getAge());
            System.out.println("Passenger Seat No:"+person.getSeatNo());
            System.out.println("Passenger Allocated Berth:"+person.getAllocatedBerth());
        }
    }

    private void printPassenger(Queue<Passenger> queue){
        for(Passenger person:queue){
            System.out.println("------------------------------------------");
            System.out.println("Passenger Id:"+person.getId());
            System.out.println("Passenger Name:"+person.getName());
            System.out.println("Passenger Age:"+person.getAge());
            System.out.println("Passenger Seat No:"+person.getSeatNo());
            System.out.println("Passenger Allocated Berth:"+person.getAllocatedBerth());
        }
    }
}
