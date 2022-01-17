package com.company;

public class HomeWork3 {

    public static void main(String[] args) {
        int year = (int) Math.floor(Math.random()*(10000-1+1)+1);
        String leapYear = "Yeah its leap year!";
        String commonYear = "Nope, its just common year!";
        System.out.println("The random year is: " + year);
        if(year % 4 == 0) {
            System.out.println(leapYear);
        } else if (year % 100 != 0) {
            System.out.println(leapYear);
        } else if(year % 400 == 0){
            System.out.println(leapYear);
        }
        else {
            System.out.println(commonYear);
        }
    }
}
