package com.company;

import java.util.Scanner;

public class HomeWork3Part3 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
//  1. Nuskaityti vartotojo įvestą skaičių ir atspausdinti ar tai yra teigiamas ar neigiamas skaičius;

        boolean forLoop1 = false; //change to True to start this one
        System.out.println("UZDOTIS 1: Įveskyte skaičus, ir sužinuokite ar teigimas ar neigimas jusu skaičius:");

        while (forLoop1) {
            if (sc.hasNextInt()) {
                int ivestasSkaicius = sc.nextInt();

                String arTeigimasIvestasScaicius = ivestasSkaicius >= 0 ? "Scaičius yra teigiamas" : "Scaičius yra neigiamas";
                System.out.println(arTeigimasIvestasScaicius);
                forLoop1 = false;
            } else {
                System.out.println("It`s not valid Integer, try again!");
                sc.next();
            }
        }

//  2. Nuskaityti tris skaičius iš vartotojo ir atspausdinti kuris iš jų yra didžiausias;

        boolean forLoop2 = false; //change to TRUE to start program
        boolean num1IsInt = forLoop2;
        boolean num2IsInt = forLoop2;
        boolean num3IsInt = forLoop2;
        int scaicius1 = 0;
        int scaicius2 = 0;
        int scaicius3 = 0;

        System.out.println("UZDOTIS 2: Įveskite 3 skaičiai, po viena after each press enter");

        while (num1IsInt) { //check first number is int
            System.out.println("(1)Įveskyte pirmas skaicius");
            if (sc.hasNextInt()) {
                scaicius1 = sc.nextInt();
                num1IsInt = false;
            } else {
                System.out.println("Not correct integer");
                sc.next();
            }
        }

        while (num2IsInt) { //check second number is int
            System.out.println("(2)Įveskyte antras skaicius");
            if (sc.hasNextInt()) {
                scaicius2 = sc.nextInt();
                num2IsInt = false;
            } else {
                System.out.println("Not correct integer");
                sc.next();
            }
        }

        while (num3IsInt) { //check third number is int
            System.out.println("(3)Įveskyte trecias skaicius");
            if (sc.hasNextInt()) {
                scaicius3 = sc.nextInt();
                num3IsInt = false;
            } else {
                System.out.println("Not correct integer");
                sc.next();
            }
        }


        if (scaicius1 + scaicius2 + scaicius3 != 0) {  //if statement for hide code from terminal while boolean statements is true

            System.out.println("First number = " + scaicius1);
            System.out.println("Second number = " + scaicius2);
            System.out.println("Third number = " + scaicius3);

            if (scaicius1 > scaicius2 && scaicius1 > scaicius3) {
                System.out.println("The bigest one is first- " + scaicius1);  //first
            } else if (scaicius2 > scaicius3 && scaicius2 > scaicius1) {
                System.out.println("The bigest one is second- " + scaicius2); //second
            } else if (scaicius3 > scaicius2 && scaicius3 > scaicius1) {
                System.out.println("The bigest one is third- " + scaicius3); //third
            } else if (scaicius1 == scaicius2 && scaicius1 != scaicius3) {     //1 =2 !=3
                System.out.println("first = second != third");
            } else if (scaicius2 == scaicius3 && scaicius2 != scaicius1) {     //1 =2 !=3
                System.out.println("first != second = third");
            } else if(scaicius3 == scaicius1 && scaicius3 != scaicius2){     //1 =2 !=3
                System.out.println("first = third and != second");
            }
            else {
                System.out.println(scaicius1 + "=" + scaicius2 + "=" + scaicius3 + " -- the bigest scaicius is time which you spend here"); //if all ==
            }
        }

//  3. Priimti skaičių iš vartotojo (tarp 1 ir 7) ir pagal jį atspausdinti kelintadienis tai yra (1 - Pirmadienis ... 7 - Sekmadienis)


        boolean forLoop3 = false; //change to true to start program

        while (forLoop3) {
            System.out.println(" UZDOTIS 3: Įveskite skaicius nuo 1-7 ir sužinokite kelintadienis priklauso skaičiui");
            if (sc.hasNextInt()) {
                int kelintadienioNr = sc.nextInt();
                if (kelintadienioNr > 0 && kelintadienioNr <= 7) {
                    switch (kelintadienioNr) {
                        case 1 -> System.out.println("Your number is: " + kelintadienioNr + ", and day of week will called: " + Diena.PIRMADIENIS + ", ar sutrumpai - " + Diena.PIRMADIENIS.getTrumpasPavadinimas());
                        case 2 -> System.out.println("Your number is: " + kelintadienioNr + ", and day of week will called: " + Diena.ANTRADIENIS + ", ar sutrumpai - " + Diena.ANTRADIENIS.getTrumpasPavadinimas());
                        case 3 -> System.out.println("Your number is: " + kelintadienioNr + ", and day of week will called: " + Diena.TRECIADIENIS + ", ar sutrumpai - " + Diena.TRECIADIENIS.getTrumpasPavadinimas());
                        case 4 -> System.out.println("Your number is: " + kelintadienioNr + ", and day of week will called: " + Diena.KETVIRTADIENIS + ", ar sutrumpai - " + Diena.KETVIRTADIENIS.getTrumpasPavadinimas());
                        case 5 -> System.out.println("Your number is: " + kelintadienioNr + ", and day of week will called: " + Diena.PENKTADIENIS + ", ar sutrumpai - " + Diena.PENKTADIENIS.getTrumpasPavadinimas());
                        case 6 -> System.out.println("Your number is: " + kelintadienioNr + ", and day of week will called: " + Diena.SESTADIENIS + ", ar sutrumpai - " + Diena.SESTADIENIS.getTrumpasPavadinimas());
                        case 7 -> System.out.println("Your number is: " + kelintadienioNr + ", and day of week will called: " + Diena.SEKMADIENIS + ", ar sutrumpai - " + Diena.SEKMADIENIS.getTrumpasPavadinimas());
                    }
                    forLoop3 = false;
                } else {
                    System.out.println("Įvestas numeris - ne 1-7, pabandik dar karta!");
                    sc.next();
                }

            } else {
                System.out.println("Tu įvedi ne skaicius - bandik dar karta!");
                sc.next();
            }

        }
//        4. BONUS užduotis: Parašyti programą kuri leidžia vartotojui spėti skaičių ir jei jį atspėja - atspausdinti, kad laimėjo.


        boolean forLoop4 = false; // change to True to start program

        int maxValueOfRandom = 10; //change max value of random number
        int randomNumber = (int) Math.floor(Math.random() * (maxValueOfRandom) + 1);

        System.out.println("UZDOTIS 4: We have random number (1-" + maxValueOfRandom + ") - can you guess it?");
        while (forLoop4) {

            if (sc.hasNextInt()) {
                int numberFromUser = sc.nextInt();

                if ((numberFromUser > 0 && numberFromUser <= maxValueOfRandom) && numberFromUser == randomNumber) {
                    System.out.println("Sveikiniu tu LAIMEJI!!! the number was " + randomNumber);
                    forLoop4 = false;
                } else if ((numberFromUser > 0 && numberFromUser <= maxValueOfRandom) && numberFromUser != randomNumber) {
                    System.out.println("Nice try - bet ne( bandik dar karta!");
                } else {
                    System.out.println("Nu tu ka? Skaicius turi buti nuo 0 iki " + maxValueOfRandom + '!');
                    sc.next();
                }
            } else {
                System.out.println("Tu įvedi ne skaicius - bandik dar karta!");
                sc.next();
            }
        }


//      5. Studentas įveda savo balą į programą (1-100).

        boolean forLoop5 = false; //change to True to start program

        //ne reikia - nes sunku skaititi if else statements
//        int puikai = 100;
//        int labaiGeraiMin = 91;
//        int geraiMax = 90;
//        int geraiMin = 81;
//        int silpnaiMax = 80;
//        int silpnaiMin = 71;
//        int labaiSilpnaiMax = 70;
//        int labaiSilpnaiMin = 62


        System.out.println("UZDOTIS 5: Iveskite skaicius 1-100 ir suzinuokite ivertinima");
        while (forLoop5) {
            if (sc.hasNextInt()) {
                int ivestasBalas = sc.nextInt();
                if (ivestasBalas == 100) {                              //100
                    System.out.println(ivestasBalas + " = Puikiai");
                    forLoop5 = false;
                } else if (ivestasBalas < 100 && ivestasBalas >= 91) {   //91-99
                    System.out.println(ivestasBalas + " = Labai gerai");
                    forLoop5 = false;
                } else if (ivestasBalas < 91 && ivestasBalas >= 81) {   //81-90
                    System.out.println(ivestasBalas + " = Gerai");
                    forLoop5 = false;
                } else if (ivestasBalas < 81 && ivestasBalas >= 71) {   //71-80
                    System.out.println(ivestasBalas + " = Silpnai");
                    forLoop5 = false;
                } else if (ivestasBalas < 71 && ivestasBalas >= 62) {   //62-70
                    System.out.println(ivestasBalas + " = Labai silpnai");
                    forLoop5 = false;
                } else if (ivestasBalas < 62 && ivestasBalas >= 0) {   //0 - 61
                    System.out.println(ivestasBalas + " = Egzaminas neišlaikytas");
                    forLoop5 = false;
                } else {                                                // ! from 0-100
                    System.out.println("Įvestas scaicius < 0 arba > 100, įveskite teisingas skaicius!");
                    sc.next();
                }
            } else {
                System.out.println("Tu įvedi ne skaicius - bandik dar karta!");
                sc.next();
            }
        }
        sc.close();

    }
}
