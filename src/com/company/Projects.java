package com.company;

public class Projects {
    Integer easy = 0;
    Integer medium = 0;
    Integer hard = 0;
    String name;
    Integer daysFE = 0;
    Integer daysBE = 0;
    Integer daysBD = 0;
    Integer daysMobile = 0;
    Integer daysWP = 0;
    Integer daysPS = 0;
    String clientsName;
    Integer howManyDays; //Termin realizacji
    Integer penalty;
    Integer price;
    Integer whenPay; //Po ilu dniach zapłaci
    String complexity; //Trudność projektu

    public Projects(String name, String clientsName, Integer howManyDays, Integer penalty, Integer price, Integer whenPay, String complexity,
                    Integer daysFE, Integer daysBE, Integer daysBD, Integer daysMobile, Integer daysWP, Integer daysPS) {
        this.name = name;
        this.clientsName = clientsName;
        this.howManyDays = howManyDays;
        this.penalty = penalty;
        this.price = price;
        this.whenPay = whenPay;
        this.complexity = complexity;
        this.daysFE = daysFE;
        this.daysBE = daysBE;
        this.daysBD = daysBD;
        this.daysMobile = daysMobile;
        this.daysWP = daysWP;
        this.daysPS = daysPS;
    }

    public String toString() {
        return "*Nazwa projektu: " + name + "\n*Ilość roboczodni potrzebnych na poszczególne technologie:\n-Front-End: " + daysFE +
                "\n-Back-End: " + daysBE + "\n-Bazy danych: " + daysBD + "\n-Mobile: " + daysMobile + "\n-Wordpress: " + daysWP + "\n-Prestashop: " + daysPS +
                "\n*Zleceniodawca: " + clientsName + "\n*Dni na realizację: " + howManyDays + "\n*Wysokość kary za przekroczenie terminu :" + penalty + "PLN" +
                "\n*Cena za wykonanie: " + price + "PLN" + "\n*Po ilu dniach od wykonania zlecenia nastąpi płatność: " + whenPay + "\n*Poziom złożoności: " + complexity;
    }
}
//IF employees = 0 != Projects HARD
    /*
    Nazwa Projektu
    Ilość roboczodni w podziale na poszczegolne technologie
    Klient
    Termin oddania
    Wysokosc kary za przekroeczenie terminu
    Cena jaka klient moze zaplacic za realizacje
    Termin platnosci(ile dni minie od oddania projektu do otrzymania zaplaty)
    poziom zlozonosci(latwy/sredni/trudny)
     */
    /* Proste projekty = 1 technologia
       Srednie = min. 2
       Zlozone = min. 3
     */

