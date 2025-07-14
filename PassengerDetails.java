package com.practice.TrainTicketBooking;

public class PassengerDetails extends TrainTicketBookingSystem{
    Passenger passenger;
    public PassengerDetails(int id){
        this.passenger=tracking.get(id);
    }

    public Passenger getPassenger(){
        return passenger;
    }
}
