package VariabilaMetoda;

public class Loops {

  /*  for(init; condition; increment){
        //codul care se executa
    }*/

    //afisare numere de la 1 la 10
    public static void main(String[] args){
        afiseazaNumere();
        printeazaNumerelePare();
    }

    public static void afiseazaNumere() {
        for (int contor = 1; contor <= 10; contor++) {
            System.out.println("Contor: " + contor);
        }
    }

  /*  while (condition){
        //se executa codul atat timp cat conditia e adevarata
    } */
    public static void printeazaNumerelePare(){
        int contor = 1;
        while (contor <= 10){
            if (contor % 2 ==0){
                System.out.println("Contor:" + contor);
            }
            contor ++;
        }
    }

}
