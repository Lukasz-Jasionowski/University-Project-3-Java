package com.company;

import java.util.Scanner;

public class Main {
    public static int randomNumberGenerator(int min, int max) {
        double r = Math.random();
        int randomNum = (int) (r * (max - min)) + min;
        return randomNum;
    }

    public static void main(String[] args) {
        Integer currentDay = 1;
        int easyMediumSelect = randomNumberGenerator(1, 8); //Wybór bez Trudnych projektów
        int fullSelect = randomNumberGenerator(1, 12); //Pełen wybór
        Integer selection = 0;
        Boss boss = new Boss();
        Boss employees = new Boss();

        Scanner scan = new Scanner(System.in);
        System.out.println("WITAJ W SYMULACJI FIRMY IT!\nRozpocznij rozgrywkę wybierając jedną z opcji:");
        do {
            System.out.println("1.Podpisz nową umowę\n2.Zatrudnij pracownika\n3.Pracuj(programowanie)\n4.Testuj kod\n" +
                    "5.Oddaj gotowy projekt\n6.Zatrudnij pracownika\n7.Zwolnij pracownika\n8.Rozliczenia z urzędami" + "\nDzień " + currentDay);
            selection = scan.nextInt();

            switch (selection) {
                case 1: //Podpisanie nowej umowy
                    if (boss.employees == 0 && boss.myProject == null) {
                        boss.setMyProject(easyMediumSelect);
                        System.out.println("PODPISANO UMOWĘ:\n" + boss.getMyProject());
                        currentDay++;
                    } else if (boss.employees >= 1) {
                        employees.setMyProject(fullSelect);
                        System.out.println("PODPISANO UMOWĘ:\n" + employees.getMyProject());
                        currentDay++;
                    } else {
                        System.out.println("Brak możliwości podpisania nowej umowy!");
                    }
                    break;
                case 2: //Dzień na szukanie pracownika
                    boss.showWhoWantToWork();
                    currentDay++;
                    break;
                case 3://Dzień na programowanie
                    if (boss.employees >= 1) {
                        employees.programming();
                    }else {
                        boss.programming();
                    }
                    currentDay++;
                    break;
                case 4:
//Dzień na testowanie
                    break;
                case 5:
//Oddanie gotowego projektu
                    break;
                case 6: //Zatrudnienie pracownika
                    boss.availableEmployee();
                    System.out.println("Wpisz imię pracownika, którego chcesz zatrudnić: ");
                    Scanner scanner1 = new Scanner(System.in);
                    String name = scan.next();
                    boss.setMyEmpolyee(name);
                    currentDay++;
                    break;
                case 7: //Zwolnienie pracownika
                    boss.fireTheEmployee();
                    currentDay++;
                    break;
                case 8:
//Dzień na rozliczenie z urzędami
                    break;
                default:
                    System.out.println("BŁĄD! Wybierz liczbę z zakresu 1-8");
            }
        } while (boss.cash >= 0);
        System.out.println("Przegrałeś");
    }
}
