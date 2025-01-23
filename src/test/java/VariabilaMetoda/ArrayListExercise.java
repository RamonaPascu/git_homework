package VariabilaMetoda;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayListExercise {
    //colectie care, spre deosebire de array simplu, ne permite manipularea elementelor CRUD
    public static void main(String[] args){
        //cum cream un Array List
        ArrayList<String> nume = new ArrayList<>();
        //momentan e gol
        //adaugam elemente:
        nume.add("Ana");
        nume.add("Bob");
        nume.add("Carl");
        //dimensiunea nu e fixa

        //cum putem accesa un element? cu metoda get
        nume.get(1);

        //modificare element, folosim metoda set
        nume.set(0, "David");

        //stergere element din lista: cu metoda remove
        nume.remove("Carl");
        System.out.println(nume); //putem folosi fara metoda Arrays.toString la print

        //cum aflam dimensiunea? cu metoda size
        System.out.println(nume.size());

        //putem goli lista
        nume.clear();

        //putem sorta

        //putem insera cu append

        //putem compara

        //cum mai putem initializa un ArrayList?
        //declaram ArrayList (tipul), DE SCRIS CE ZICE AICI aprox minutul 69
        ArrayList<String> nume1 = new ArrayList<>(Arrays.asList("Ana", "Mihai", "Bob", "Carl"));



    }
}
