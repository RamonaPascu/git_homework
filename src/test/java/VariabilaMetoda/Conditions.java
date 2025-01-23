package VariabilaMetoda;

public class Conditions {
  /*  if (condition){
        // codul care se executa cand condition=true

    } else if (otherCondition) {
        // codul care se executa cand condition=false and otherCondition=true

    } else {
        //codul care se executa daca condition=false si otherCondition=false

    } */

    public static void verificareNumar(int n) {
        if (n > 0) {
            System.out.println("Numarul " + n + " este strict pozitiv");
        } else if (n < 0) {
            System.out.println("Numarul " + n + " este strict negativ");
        } else {
            System.out.println("Numarul " + n + " este egal cu zero");
        }

    }
    public static void main(String[] args ) {
        //e punctul de pornire al scriptului
        verificareNumar( 0 );
    }

}
