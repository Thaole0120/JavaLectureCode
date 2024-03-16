package org.example.week4;

import java.util.*;

import static input.InputUtils.*;

public class GuestList {
    public static void main(String[] args) {

        List<String> guestList = new ArrayList<>();

        while (true) {
            String name = stringInput("Enter name of guest or enter to quit");

            if (name.isEmpty()) {
                break;
            }
            if (containsIgnoreCase(guestList, name)) {
                System.out.println(" Youa already added + " + name);
            } else {
                System.out.println("Adding " + name + " to list. ");
                guestList.add(name);

            }
        }

        Collections.sort(guestList);

        printGuestNames(guestList);

        // Remove guests from list if needed

        while (yesNoInput("Do you want to remove any guests? ")) {
            System.out.println(" Here are all the guests");
            printGuestNames(guestList);

            if (guestList.isEmpty()){
                System.out.println(" There are no more guests to remove");
                break;
            }

            int index = positiveIntInput("Enter the number of the guest to remove");
            index--;
            if (index < guestList.size()) {
                String removeGuest = guestList.remove(index);
                System.out.println("Removed guest " + removeGuest);
            } else {
                System.out.println(" Error -  please enter a valid number of a guest");
            }
        }

        printGuestNames(guestList);

        System.out.println(" The number of guests in the guest list is  " + guestList.size());

        selectPrizeWinner(guestList);
    }

    public static void selectPrizeWinner(List<String> guests){
        if (guests.isEmpty()){
            System.out.println("Warning - no guests - no one to win the prize");
            return;
        }

        Random rng = new Random();
        int randomGuestIndex = rng.nextInt(guests.size()); //0,1,2,3

        String prizeWinner = guests.get(randomGuestIndex);

        System.out.println("Guest number " + randomGuestIndex+1 + " " + prizeWinner +  " wins a prize!");
    }
    public static void printGuestNames(List<String> guests){
        System.out.println(" Your guest list is: \n");

        if(guests.isEmpty()){
            System.out.println(" There are not guests in the list.");
        }else {
            for (int i = 0; i < guests.size(); i++) {
                System.out.println((i + 1) + ": " + guests.get(i));


            }
        }
    }

    public static boolean containsIgnoreCase(List<String> list, String data){
        for (String item: list){
            if (item.equalsIgnoreCase(data)){
                return true;
            }
        }

        return false;
    }
}
