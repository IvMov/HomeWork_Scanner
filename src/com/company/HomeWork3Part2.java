package com.company;

public class HomeWork3Part2 {
    public static void main(String[] args) {
        int randomNumber = (int) Math.floor(Math.random() * (12 - 1 + 1) + 1);
        System.out.println("Random number is: " + randomNumber);
        String whatMonthIs = "";

        if (randomNumber > 0 && randomNumber < 13 && randomNumber % 2 != 0) {
            switch (randomNumber) {
                case 1:
                    whatMonthIs = "January";
                    break;
                case 3:
                    whatMonthIs = "March";
                    break;
                case 5:
                    whatMonthIs = "May";
                    break;
                case 7:
                    whatMonthIs = "July";
                    break;
                case 9:
                    whatMonthIs = "September";
                    break;
                case 11:
                    whatMonthIs = "November";
                    break;
            }
            System.out.println(whatMonthIs);
        } else if (randomNumber > 0 && randomNumber < 13 && randomNumber % 2 == 0) {
            switch (randomNumber) {
                case 2:
                    whatMonthIs = "February";
                    break;
                case 4:
                    whatMonthIs = "April";
                    break;
                case 6:
                    whatMonthIs = "June";
                    break;
                case 8:
                    whatMonthIs = "August";
                    break;
                case 10:
                    whatMonthIs = "October";
                    break;
                case 12:
                    whatMonthIs = "December";
                    break;
            }
            System.out.println(whatMonthIs);
        } else {
            System.out.println("Klaidingai sugeneruotas skaičius");
        }
        /*
        if (randomNumber > 0 && randomNumber < 13) {
            switch (randomNumber) {
                case 1:
                    whatMonthIs = "January";
                    break;
                case 2:
                    whatMonthIs = "February";
                    break;
                case 3:
                    whatMonthIs = "March";
                    break;
                case 4:
                    whatMonthIs = "April";
                    break;
                case 5:
                    whatMonthIs = "May";
                    break;
                case 6:
                    whatMonthIs = "June";
                    break;
                case 7:
                    whatMonthIs = "July";
                    break;
                case 8:
                    whatMonthIs = "August";
                    break;
                case 9:
                    whatMonthIs = "September";
                    break;
                case 10:
                    whatMonthIs = "October";
                    break;
                case 11:
                    whatMonthIs = "November";
                    break;
                case 12:
                    whatMonthIs = "December";
                    break;

            }
            System.out.println(whatMonthIs);
        } else {
            System.out.println("Klaidingai sugeneruotas skaičius");
        }
        */
    }
}
//
