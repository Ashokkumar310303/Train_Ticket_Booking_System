package com.practice.TrainTicketBooking;

public class Passenger {
    private static int idGenerator=0;
    private final int id;
    private final String name;
    private final int age;
    private char allocatedBerth;
    private int seatNo;
    private final char preferenceBerth;


    public static void setIdGenerator(int newValue){
        //when a ticket is canceled we undo the id generated
        idGenerator=newValue;
    }

    public void setAllocatedBerth(char allocatedBerth){
        this.allocatedBerth=allocatedBerth;
    }
    public void setSeatNo(int seatNo){
        this.seatNo=seatNo;
    }
    public Passenger(String name,int age,char preferenceBerth){
        this.id=++idGenerator;
        this.name=name;
        this.age=age;
        this.preferenceBerth=preferenceBerth;
    }

    public int getId(){
        return id;
    }

    public char getPreferenceBerth(){
        return preferenceBerth;
    }

    public String getName(){
        return name;
    }

    public int getAge(){
        return age;
    }

    public char getAllocatedBerth(){
        return allocatedBerth;
    }

    public int getSeatNo(){
        return seatNo;
    }

    public static int getIdGenerator(){
        return idGenerator;
    }

}
