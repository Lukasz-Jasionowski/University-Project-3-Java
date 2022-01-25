package com.company;

import java.util.Scanner;

public class Main {
    public static int randomNumberGenerator(int min, int max) {
        double r = Math.random();
        int randomNum = (int) (r * (max - min)) + min;
        return randomNum;
    }
    public static void main(String[] args) {
        Integer currentDay = 0;
        int easySelect = randomNumberGenerator(1,4);
        Integer selection = 0;
        Boss me = new Boss();
        me.setMyProject(easySelect);


        Scanner scan = new Scanner(System.in);
        System.out.println("WITAJ W SYMULACJI FIRMY IT!\nRozpocznij rozgrywkę wybierając jedną z opcji:\n" +
                "1.Podpisz nową umowę\n2.Zatrudnij pracownika\n3.Pracuj(programowanie)\n4.Testuj kod\n" +
                "5.Oddaj gotowy projekt\n6.Zatrudnij pracownika\n7.Zwolnij pracownika\n8.Rozliczenia z urzędami");
        selection = scan.nextInt();

        switch (selection) {
            case 1:
                System.out.println("PODPISANO UMOWĘ:\n" + me.getMyProject());
//Podpisanie nowej umowy
                break;
            case 2:
//Dzień na szukanie pracownika
                break;
            case 3:
//Dzień na programowanie
                break;
            case 4:
//Dzień na testowanie
                break;
            case 5:
//Oddanie gotowego projektu
                break;
            case 6:
//Zatrudnienie pracownika
                break;
            case 7:
//Zwolnienie pracownika
                break;
            case 8:
//Dzień na rozliczenie z urzędami
                break;
            default:
                System.out.println("BŁĄD! Wybierz liczbę z zakresu 1-8");
        }
    }
}
