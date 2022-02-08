package com.company;

import java.util.ArrayList;
import java.util.Scanner;

public class Boss {
    Integer cash = 2000;
    public Integer employees = 0;
    public Projects myProject;
    Projects easy1 = new Projects("Strona WWW o Pieskach", "InstaDogLover16", 7, 0, 200, 1, "Łatwy", 0, 0, 0, 0, 2, 0);
    Projects easy2 = new Projects("Sklep Internetowy", "Coffee Sellers", 5, 100, 500, 2, "Łatwy", 0, 0, 0, 0, 0, 1);
    Projects easy3 = new Projects("Baza uczniów", "Szkoła Podstawowa Nr 10", 14, 500, 3000, 4, "Łatwy", 0, 0, 5, 0, 0, 0);
    Projects easy4 = new Projects("Front-End dla Aplikacji", "Kreatyvny Comics", 8, 200, 2000, 1, "Łatwy", 4, 0, 0, 0, 0, 0);
    Projects medium1 = new Projects("Sklep z meblami", "Eko Meble", 10, 1000, 5000, 1, "Średni", 2, 0, 0, 0, 0, 3);
    Projects medium2 = new Projects("Baza produktów", "Lidel Food", 3, 2000, 6000, 1, "Średni", 0, 0, 1, 0, 0, 0);
    Projects medium3 = new Projects("CoffeCorner - Android Game", "OneDevStudio", 6, 1000, 4000, 2, "Średni", 2, 0, 0, 1, 0, 0);
    Projects medium4 = new Projects("Portfolio fotograficzne", "Photos with Ammy", 7, 500, 4000, 1, "Średni", 2, 0, 0, 0, 2, 0);
    Projects hard1 = new Projects("Aplikacja wycieczkowa", "Zespół Szkół Magicznych", 10, 3000, 10000, 1, "Trudny", 3, 0, 3, 3, 0, 0);
    Projects hard2 = new Projects("Przepisy Joli", "Crazy Jola", 5, 1000, 4000, 2, "Trudny", 2, 1, 0, 0, 1, 0);
    Projects hard3 = new Projects("Apka dla statystyk w grze", "RPG Nation", 10, 1000, 5000, 2, "Trudny", 4, 2, 0, 0, 2, 0);
    Projects hard4 = new Projects("Blog", "Michał Chlebek", 4, 500, 2000, 1, "Trudny", 1, 1, 0, 0, 2, 0);
    public ArrayList<String> myEmployeesName = new ArrayList<String>();
    public Employee myEmployee;
    Employee employee1 = new Employee("Jacek", 1000);
    Employee employee2 = new Employee("Młodziak", 1000);
    Employee employee3 = new Employee("Aśka", 3000);
    Employee employee4 = new Employee("Fredryk", 2000);
    Employee employee5 = new Employee("Michał", 4000);
    Scanner scan = new Scanner(System.in);
    String name;

    public Projects getMyProject() {
        return myProject;
    }

    void setMyProject(int select) {
        switch (select) {
            case 1:
                this.myProject = easy1;
                break;
            case 2:
                this.myProject = easy2;
                break;
            case 3:
                this.myProject = easy3;
                break;
            case 4:
                this.myProject = easy4;
                break;
            case 5:
                this.myProject = medium1;
                break;
            case 6:
                this.myProject = medium2;
                break;
            case 7:
                this.myProject = medium3;
                break;
            case 8:
                this.myProject = medium4;
                break;
            case 9:
                this.myProject = hard1;
                break;
            case 10:
                this.myProject = hard2;
                break;
            case 11:
                this.myProject = hard3;
                break;
            case 12:
                this.myProject = hard4;
                break;
        }
    }

    void showWhoWantToWork() {
        System.out.println("Lista dostępnych pracowników: \n" + employee1 + "\n" + employee2 + "\n" + employee3 + "\n" + employee4 + "\n" + employee5);
    }

    void availableEmployee() {
        System.out.println("Osoby, które chcą u Ciebie pracować: \n" + employee1 + "\n" + employee2 + "\n" + employee3 + "\n" + employee4 + "\n" + employee5 + "\n" + "Aktualny stan konta firmowego: " + this.cash + "PLN");
    }

    void setMyEmpolyee(String name) {
        switch (name) {
            case "Jacek":
                if (this.cash >= employee1.salary) {
                    this.myEmployee = employee1;
                    myEmployeesName.add("Jacek");
                    employees++;
                    System.out.println("Zatrudniłeś: " + this.getMyEmployee());
                    this.cash -= employee1.salary;
                    System.out.println("Aktualny stan konta: " + this.cash + "PLN");
                } else {
                    System.out.println("Nie stać Cię na tego pracownika!");
                }
                break;
            case "Młodziak":
                if (this.cash >= employee2.salary) {
                    this.myEmployee = employee2;
                    myEmployeesName.add("Młodziak");
                    employees++;
                    System.out.println("Zatrudniłeś: " + this.getMyEmployee());
                    this.cash -= employee2.salary;
                    System.out.println("Aktualny stan konta: " + this.cash + "PLN");
                } else {
                    System.out.println("Nie stać Cię na tego pracownika!");
                }
                break;
            case "Aśka":
                if (this.cash >= employee3.salary) {
                    this.myEmployee = employee3;
                    myEmployeesName.add("Aśka");
                    employees++;
                    System.out.println("Zatrudniłeś: " + this.getMyEmployee());
                    this.cash -= employee3.salary;
                    System.out.println("Aktualny stan konta: " + this.cash + "PLN");
                } else {
                    System.out.println("Nie stać Cię na tego pracownika!");
                }
                break;
            case "Fredryk":
                if (this.cash >= employee4.salary) {
                    this.myEmployee = employee4;
                    myEmployeesName.add("Fredryk");
                    employees++;
                    System.out.println("Zatrudniłeś: " + this.getMyEmployee());
                    this.cash -= employee4.salary;
                    System.out.println("Aktualny stan konta: " + this.cash + "PLN");
                } else {
                    System.out.println("Nie stać Cię na tego pracownika!");
                }
                break;
            case "Michał":
                if (this.cash >= employee5.salary) {
                    this.myEmployee = employee5;
                    myEmployeesName.add("Michał");
                    employees++;
                    System.out.println("Zatrudniłeś: " + this.getMyEmployee());
                    this.cash -= employee5.salary;
                    System.out.println("Aktualny stan konta: " + this.cash + "PLN");
                } else {
                    System.out.println("Nie stać Cię na tego pracownika!");
                }
                break;
            default:
                System.out.println("Nie ma nikogo o takim imieniu!\nSprawdź pisownię");
                break;
        }
    }

    public String getMyEmployee() {
        return myEmployee.name;
    }

    public void fireTheEmployee() {
        if (myEmployeesName.isEmpty()) {
            System.out.println("Nie posiadasz pracowników!");

        } else {
            System.out.println("Lista pracowników: " + myEmployeesName);
            System.out.println("Wpisz imię osoby, którą chcesz zwolnić: ");
            name = scan.next();
            if (!myEmployeesName.contains(name)) {
                System.out.println("Błędne imię, sprawdź pisownię!");
            } else {
                myEmployeesName.remove(name);
                System.out.println("Pracownik " + name + " został zwolniony");
                cash -= 500;
                System.out.println("Musiałeś ponieść koszty zwolnienia pracownika: - 500PLN\nAktualny stan konta: " + cash + "PLN");
            }
        }
    }
}
