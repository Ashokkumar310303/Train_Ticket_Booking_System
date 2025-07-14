package com.practice.TrainTicketBooking;


import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        System.out.println();
        System.out.println("----------------------------------------------");
        System.out.println(" Welcome to the Train Ticket Booking System ");
        System.out.println("----------------------------------------------");
        System.out.println();
        System.out.println();


        boolean isValid=true;
        Scanner input=new Scanner(System.in);

        TrainTicketBookingSystem ticket=new TrainTicketBookingSystem();

        while(isValid){
            System.out.println("***********************************************");
            System.out.println("1. Book Ticket");
            System.out.println("2. Cancel Ticket");
            System.out.println("3. Display Conform List");
            System.out.println("4. Display RAC List");
            System.out.println("5. Display Waiting List");
            System.out.println("6. Exit");
            System.out.println("***********************************************");

            int choice=input.nextInt();
            switch(choice){
                case 1:
                    String name="";
                    int age;
                    char preferenceBerth=' ';

                    System.out.println("Enter your name:");
                    name=input.next();

                    System.out.println("Enter your age:");
                    age=input.nextInt();

                    System.out.println("Enter your prefered berth [Upper,Middle,Lower] ");
                    preferenceBerth=input.next().toUpperCase().charAt(0);

                    ticket.bookTicket(new Passenger(name,age,preferenceBerth));

                    break;
                case 2:
                    int id;
                    System.out.println("Enter the id of your ticket:");
                    id=input.nextInt();

                    Passenger passenger=ticket.getPassenger(id);
                    if(passenger!=null){
                        System.out.println("Your Ticket has been cancelled");
                    }
                    else{
                        System.out.println("Invalid id");
                    }

                    break;

                case 3:
                    System.out.println("----------------------------");
                    System.out.println("Conformed Ticket List");
                    System.out.println("----------------------------");
                    ticket.printConformedTicket();
                    break;
                case 4:
                    System.out.println("----------------------------");
                    System.out.println("RAC Ticket List");
                    System.out.println("----------------------------");
                    ticket.printRACTicket();
                    break;
                case 5:
                    System.out.println("----------------------------");
                    System.out.println("Waiting List");
                    System.out.println("----------------------------");
                    ticket.printWaitingListTicket();
                    break;
                case 6:
                    isValid=false;
                    break;
                default:
                    System.out.println("Invalid Choice!!!!");
            }
        }


    }
}
