package com.practice.TrainTicketBooking;

import java.util.*;

public class TrainTicketBookingSystem {
    protected static final int berth=1;
    protected static final int racSize=1;
    protected static final int waitingSize=1;

    protected static int upperSeatNo=1;
    protected static int middleSeatNo=2;
    protected static int lowerSeatNo=3;


    protected static final List<Passenger> conformedList=new ArrayList<>();

    protected static final List<Passenger> upperBerth=new ArrayList<>();
    protected static final List<Passenger> middleBerth=new ArrayList<>();
    protected static final List<Passenger> lowerBerth=new ArrayList<>();

    protected static final Queue<Passenger> racQueue=new LinkedList<>();
    protected static final Queue<Passenger> waitingQueue=new LinkedList<>();

    protected static final Map<Integer,Passenger> tracking=new HashMap<>();

    public TrainTicketBookingSystem(){

    }

    public void bookTicket(Passenger passenger){
        Booking newBooking=new Booking(passenger);
        if(newBooking.preferenceAvailable()){
            System.out.println("Booking Conformed with preference");
            System.out.println("Your ticket id was "+passenger.getId());
            return ;
        }
        else if(newBooking.seatAvailable()){
            System.out.println("Booking conformed with different berth");
            System.out.println("Your ticket id was "+passenger.getId());
            return ;
        }
        else if(newBooking.racAvailable()){
            System.out.println("Booking was added to RAC");
            System.out.println("Your ticket id was "+passenger.getId());
            return ;
        }
        else if(newBooking.waitingListAvailable()){
            System.out.println("Booking was added to waiting List");
            System.out.println("Your ticket id was "+passenger.getId());
            return ;
        }
        else{
            Passenger.setIdGenerator(Passenger.getIdGenerator()-1);
            System.out.println("Sorry no booking available");
        }

    }

    public void cancelTicket(Passenger passenger){
        Canceling cancel=new Canceling(passenger);
        if(cancel.isValidConformedList()){
            cancel.removeConformTicket();
        }
        else if(cancel.isValidRACList()){
            cancel.removeRACTicket();
        }
        else if(cancel.isValidWaitingList()){
            cancel.removeWaitingListTicket();
        }
        else{
            System.out.println("Invalid Identity");
        }

    }

    public Passenger getPassenger(int id){
        PassengerDetails person=new PassengerDetails(id);
        return person.getPassenger();
    }

    public void printConformedTicket(){
        PrintPassengerDetails details=new PrintPassengerDetails(conformedList);
    }

    public void printUpperBerthTicket(){
        PrintPassengerDetails details=new PrintPassengerDetails(upperBerth);
    }

    public void printMiddleBerthTicket(){
        PrintPassengerDetails details=new PrintPassengerDetails(middleBerth);
    }

    public void printLowerBerthTicket(){
        PrintPassengerDetails details=new PrintPassengerDetails(lowerBerth);
    }

    public void printRACTicket(){
        PrintPassengerDetails details=new PrintPassengerDetails(racQueue);
    }

    public void printWaitingListTicket(){
        PrintPassengerDetails details=new PrintPassengerDetails(waitingQueue);
    }


}
