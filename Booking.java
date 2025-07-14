package com.practice.TrainTicketBooking;

public class Booking extends TrainTicketBookingSystem {
    Passenger passenger;
    Passenger cancellingPerson;
    boolean racTicket=false;

    public Booking(Passenger passenger){
        tracking.put(passenger.getId(),passenger);
        this.passenger=passenger;
    }
    public Booking(Passenger passenger,boolean isRac,Passenger cancellingPerson){
        this.passenger=passenger;
        this.racTicket=isRac;
        this.cancellingPerson=cancellingPerson;
    }

    public boolean preferenceAvailable(){
        if(passenger.getPreferenceBerth()=='U' && upperBerth.size()<berth){
            passenger.setAllocatedBerth('U');
            if(racTicket){
                passenger.setSeatNo(cancellingPerson.getSeatNo());
            }
            else{
                passenger.setSeatNo(upperSeatNo);
                upperSeatNo+=3;
            }
            upperBerth.add(passenger);
            conformedList.add(passenger);
            return true;
        }
        else if(passenger.getPreferenceBerth()=='M' && middleBerth.size()<berth){
            passenger.setAllocatedBerth('M');
            if(racTicket){
                passenger.setSeatNo(cancellingPerson.getSeatNo());
            }
            else{
                passenger.setSeatNo(middleSeatNo);
                middleSeatNo+=3;
            }
            middleBerth.add(passenger);
            conformedList.add(passenger);
            return true;
        }
        else if(passenger.getPreferenceBerth()=='L' && lowerBerth.size()<berth){
            passenger.setAllocatedBerth('L');
            if(racTicket){
                passenger.setSeatNo(cancellingPerson.getSeatNo());
            }
            else{
                passenger.setSeatNo(lowerSeatNo);
                lowerSeatNo+=3;
            }
            lowerBerth.add(passenger);
            conformedList.add(passenger);
            return true;
        }
        return false;
    }

    public boolean seatAvailable(){
        if(upperBerth.size()<berth){
            if(racTicket){
                passenger.setSeatNo(cancellingPerson.getSeatNo());
            }
            else{
                passenger.setSeatNo(upperSeatNo);
                upperSeatNo+=3;
            }
            passenger.setAllocatedBerth('U');
            upperBerth.add(passenger);
            conformedList.add(passenger);
            return true;
        }
        else if(middleBerth.size()<berth){
            if(racTicket){
                passenger.setSeatNo(cancellingPerson.getSeatNo());
            }
            else{
                passenger.setSeatNo(middleSeatNo);
                middleSeatNo+=3;
            }
            passenger.setAllocatedBerth('M');
            middleBerth.add(passenger);
            conformedList.add(passenger);
            return true;
        }
        else if(lowerBerth.size()<berth){
            if(racTicket){
                passenger.setSeatNo(cancellingPerson.getSeatNo());
            }
            else{
                passenger.setSeatNo(lowerSeatNo);
                lowerSeatNo+=3;
            }
            passenger.setAllocatedBerth('L');
            lowerBerth.add(passenger);
            conformedList.add(passenger);
            return true;
        }
        return false;
    }

    public boolean racAvailable(){
        if(racQueue.size()<racSize){
            racQueue.add(passenger);
            return true;
        }
        return false;
    }

    public boolean waitingListAvailable(){
        if(waitingQueue.size()<waitingSize){
            waitingQueue.add(passenger);
            return true;
        }
        return false;
    }

}
