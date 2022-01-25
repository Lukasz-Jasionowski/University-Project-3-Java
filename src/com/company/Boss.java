package com.company;

public class Boss {
    Integer cash = 2000;
    Integer employees = 0;
    public Projects myProject;
    Projects easy1 = new Projects("Strona WWW o Pieskach", "InstaDogLover16", 7, 0, 200, 1, "Łatwy", 0, 0, 0, 0, 2, 0);
    Projects easy2 = new Projects("Sklep Internetowy", "Coffee Sellers", 5, 100, 500, 2, "Łatwy", 0, 0, 0, 0, 0, 1);
    Projects easy3 = new Projects("Baza uczniów", "Szkoła Podstawowa Nr 10", 14, 500, 3000, 4, "Łatwy", 0, 0, 5, 0, 0, 0);
    Projects easy4 = new Projects("Front-End dla Aplikacji", "Kreatyvny Comics", 8, 200, 2000, 1, "Łatwy", 4, 0, 0, 0, 0, 0);

    public Projects getMyProject() {
        return myProject;
    }
    void setMyProject(int easySelect){
        if(easySelect == 1){
              this.myProject = easy1;
        }
        if(easySelect == 2){
            this.myProject = easy2;
        }
        if(easySelect == 3){
            this.myProject = easy3;
        }
        if(easySelect == 4){
            this.myProject = easy4;
        }
    }
}
