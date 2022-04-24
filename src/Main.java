//====================================================================================================
//The Free Edition of C# to Java Converter limits conversion output to 100 lines per file.

//To purchase the Premium Edition, visit our website:
//https://www.tangiblesoftwaresolutions.com/order/order-csharp-to-java.html
//====================================================================================================

import java.time.*;
import java.time.temporal.ChronoUnit;
import java.util.*;
import java.util.Scanner;
import java.text.DateFormatSymbols;



public class Main {
    static Scanner keyboard = new Scanner(System.in);

    public static void main(String[] args) {
        //start

        int member = 0;
        int a = 0;
        int room = 0;
        do {
//            System.out.println(getMonth(2));
            System.out.println(" Welcome to SE Hotel Reservation");
            System.out.println("--------------------------------");
            System.out.println(" Would you like to reserve your room?");
            System.out.println(" 1.Yes or 2.No ");
            System.out.println(" Please write only number!");
            System.out.print(" You select: ");

            int reserve = Integer.parseInt(new Scanner(System.in).nextLine());

            if (reserve == 1) //reserve
            {

                System.out.println("--------------------------------");

                System.out.println(" Enter your date of check-in");

                // 25/04/2565

                String[] checkin = null;
                String line_in = keyboard.nextLine();

                int Day_in = 0;
                int Mon_in = 0;
                int Year_in = 0;

                checkin = line_in.split("/");


                Day_in = Integer.parseInt(checkin[0]);
                Mon_in = Integer.parseInt(checkin[1]);
                Year_in = Integer.parseInt(checkin[2]);

                LocalDate checkin_day = LocalDate.of(Year_in,Month.of(Mon_in),Day_in);

//                LocalDate birthday = LocalDate.of(1960, Month.JANUARY, 1);
//
//                Period p = Period.between(birthday, checkin_day);
//                System.out.println("You are " + p.getYears() + " years, " + p.getMonths() +
//                        " months, and " + p.getDays() +
//                        " days old. (" + p2 + " days total)");

//                System.out.println(Day +"/" + Mon +"/" + Year);




                System.out.println(" Enter your date of check-out");
//                LocalDate checkout = LocalDate.parse(new Scanner(System.in).nextLine());

//                String[] checkout = null;
//                String line_in = keyboard.nextLine();
//
//                int Day_in = 0;
//                int Mon_in = 0;
//                int Year_in = 0;
//
//                checkin = line_in.split("/");
//
//
//                Day_in = Integer.parseInt(checkin[0]);
//                Mon_in = Integer.parseInt(checkin[1]);
//                Year_in = Integer.parseInt(checkin[2]);
//
//
//                TimeSpan timesp = checkoutInt - checkinInt;

                String[] checkout = null;
                String line_out = keyboard.nextLine();

                int Day_out  = 0;
                int Mon_out  = 0;
                int Year_out  = 0;

                checkout = line_out.split("/");


                Day_out = Integer.parseInt(checkout[0]);
                Mon_out = Integer.parseInt(checkout[1]);
                Year_out = Integer.parseInt(checkout[2]);

                LocalDate checkout_day = LocalDate.of(Year_out,Month.of(Mon_out),Day_out);

                long p2 = ChronoUnit.DAYS.between(checkin_day, checkout_day);

                System.out.println(p2);

                keyboard.nextLine();



                System.out.println("--------------------------------");
                //member
                System.out.print(" How many members?: ");
                //chooseroom
                member = Integer.parseInt(new Scanner(System.in).nextLine());


                do {
                    if (member <= 5) {
                        String roomsize1 = " Smallroom";
                        String roomsize2 = " Largeroom";
                        System.out.println(" Please select room size");
                        System.out.println(" 1." + roomsize1 + "or 2." + roomsize2);
                        System.out.print(" You Choose :");
                        room = Integer.parseInt(new Scanner(System.in).nextLine());


                        switch (room) {
                            case 1:
                                String roomsize3 = " Smallroom";
                                System.out.println(" Price 1/day for" + roomsize3 + "is $ 15000\n");

                                break;

                            case 2:
                                String roomsize4 = " Largeroom";
                                System.out.println(" Price 1/day for " + roomsize4 + " is $25000\n");


                                break;
                            default:
                                System.out.println(" Select 1 or 2 Please try again\n");
                                break;

                        } //switch(room)


                    } // if (member <= 5)

                    else if (member >= 5 && member <= 10) {
                        String roomsize5 = " Largeroom";
                        System.out.println(" Your room  is Large room");
                        System.out.println(" Price 1/day for " + roomsize5 + " is $25000\n");

                    } //else if(member >= 5 && member <= 10)

                    else {
                        System.out.println(" *Over limit*");
                    } //else
                } while (room >= 3);

                System.out.println(" --------------------------------");
                System.out.println(" Your Reservation ");
//                System.out.println(" Check - in :" + checkin);
//                System.out.println(" Check - out :" + checkout);
//                System.out.println(" Total day: " + (timesp.TotalDays));
                System.out.println(" Total member :" + member);
                if (room == 1) {

//                    System.out.println(" Total price : $ " + (timesp.TotalDays) * 15000);
                } else {

//                    System.out.println(" Total price :  $ " + (timesp.TotalDays) * 25000);
                }

                if (room == 1) {
                    System.out.println(" Room size : Small room");
                } else {
                    System.out.println(" Room size : Large room");
                }

                Namearray(member);

            } //if
            else if (reserve == 2) {

                System.out.println(" Thank you for your  attention. ");

            } //Else if

            System.out.println(" --------------------------------");
            System.out.println(String.format(" Would you like to reserve your room again?\nEnter 1 for Reservation\nEnter 2 for End"));
            a = Integer.parseInt(new Scanner(System.in).nextLine());
        } while (a != 2);
        System.out.println(" Thank you for your reservation.");

    } //Main

    public static void Namearray(int member1) {

        int[] phNum = new int[2];

        String YN, Name;

        System.out.println(" --------------------------------");
        System.out.print(" Do you want to confirm\nYes or No:\n:");
        YN = String.valueOf(new Scanner(System.in).nextLine());
        String YN2 = YN.toUpperCase();

        switch (YN2) {

            case "YES":

                System.out.print(" Please give your name\n:");
                Name = String.valueOf(new Scanner(System.in).nextLine());

                if (member1 >= 2) {
                    System.out.println(" Please leave some of your phone number");
                    for (int i = 0; i < phNum.length; i++) {
                        System.out.print(" : ");
                        phNum[i] = Integer.parseInt(new Scanner(System.in).nextLine());

                    }

                } else {
                    System.out.println(" Please leave your phone number");
                    for (int i = 1; i < phNum.length; i++)
                    {
//                        Console.Write(" : ");
//                        phNum[i] = Convert.ToInt32(Console.ReadLine());

                        System.out.println(" : ");
                        phNum[i] = Integer.parseInt(new Scanner(System.in).nextLine());
                    }


                }

                break;

            case "NO" :
                System.out.println(" Thank you for your attention.");
                break;
        }//switchYN2
    }//Namearray

    public static String getMonth(int month) {
        return new DateFormatSymbols().getMonths()[month-1];
    }
}//name
