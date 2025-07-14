package com.practice.TrainTicketBooking;

public class Canceling extends TrainTicketBookingSystem{
     private Passenger passenger;

    public Canceling(Passenger passenger){
        this.passenger=passenger;
    }

    public boolean isValidConformedList(){
        int id=passenger.getId();
        for(Passenger person:conformedList){
            if(person.getId()==id){
                return true;
            }
        }
        return false;
    }

    public boolean isValidRACList(){
        int id=passenger.getId();
        for(Passenger person:racQueue){
            if(person.getId()==id){
                return true;
            }
        }
        return false;
    }
    public boolean isValidWaitingList(){
        int id=passenger.getId();
        for(Passenger person:waitingQueue){
            if(person.getId()==id){
                return true;
            }
        }
        return false;
    }

    public void removeConformTicket(){
        Passenger cancellingPerson=passenger;

        conformedList.remove(passenger);
        lowerBerth.remove(passenger);
        middleBerth.remove(passenger);
        upperBerth.remove(passenger);


        if(!racQueue.isEmpty()){
            //move the person to conform
            Passenger racPerson=racQueue.poll();
            Booking book=new Booking(racPerson,true,cancellingPerson);
            if(book.preferenceAvailable() || book.seatAvailable()){
                //ticket will be booked
            }

            if(!waitingQueue.isEmpty()){
                racQueue.add(waitingQueue.poll());
            }

        }
    }

    public void removeRACTicket(){
        racQueue.remove(passenger);
        if(!waitingQueue.isEmpty()){
            racQueue.add(waitingQueue.poll());
        }
    }

    public void removeWaitingListTicket(){
        waitingQueue.remove(passenger);
    }
}
