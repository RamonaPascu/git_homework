package VariabilaMetoda;

import java.util.Arrays;
import java.util.Collections;

public class ArrayExercise {
    //ce sunt: un tablou, o colectie de elemente de acelasi tip
    //dimensiunea unui array e fixa, si trebuie declarata de la inceput
    public static void main(String[] args){
        //declaram si initializam un array : tipul lui, numele lui, si valorile
        //[0][1][2][3] index-ul array-ului
        int[] note = {1,2,3,4};

        //putem stoca si obiecte, dar sa fie de acelasi tip
        String[] nume = {"Mihai", "Ana", "Cristi"};
        int[] note2 = new int[2];

        //cum putem afla dimensiunea unui array
        System.out.println("Dimensiunea array-ului: " + note.length); //length nu e o metoda, ci o proprietate

        //putem itera un array -> classic loop

        for (int i = 0; i <note.length; i++){
            System.out.println(note[i]);
        }

        //putem itera un array folosing for-each loop
        for (int nota: note){
            System.out.println(nota);
        }

        //putem sorta elementele array-ului
        Arrays.sort(nume, Collections.reverseOrder());
        System.out.println(Arrays.toString(nume));
        // System.out.println(nume); - doar ca experiment, nu ne apare valoarea elementelor din array

       //mai creem un array de acelasi tip
        String[] nume2 = {"Ana", "Mihai", "Cristi"};
        //comparam cele 2 stringuri
        System.out.println("Sunt array-urile egale? " + Arrays.equals(nume, nume2));

        //modificare elemente, in loc de Ana, Andrada
        //ca sa accesam elementul, folosim index-ul
        nume2[0] = "Andrada";
        System.out.println(Arrays.toString(nume2)); //apelam metoda toString, dandu-i argument array-ul nostru


    }
}
