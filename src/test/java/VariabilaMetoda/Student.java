package VariabilaMetoda;

import org.testng.annotations.Test;

public class Student {

    public String Nume;

    public String Prenume;

    public Integer Varsta;

    public String Adresa;

    public Double Inaltime;

    public Float Greutate;

    public Character Sex;

    public Boolean AreDiploma;

    @Test

    public void prezentareStudent() {
        Nume="Stefan";
        Prenume="Alex";
        Varsta=21;
        Adresa="Taberei nr.5";
        Inaltime=1.70;
        Greutate=68.0f;
        Sex='M';
        AreDiploma=true;
       // System.out.println(Nume+' '+Prenume+' '+Varsta);
       // System.out.println(Nume+" "+Prenume+" "+Varsta+" "+Adresa);
       // System.out.println(Inaltime);

        System.out.println("Numele studentului este: "+Nume);
        System.out.println("Prenumele studentului este: "+Prenume);
        System.out.println("Varsta studentului este: "+Varsta);
        System.out.println("Adresa studentului este: "+Adresa);
        System.out.println("Inaltimea studentului este: "+Inaltime);
        System.out.println("Greutatea studentului este: "+Greutate);
        System.out.println("Sexul studentului este: "+Sex);
        System.out.println("Are studentul diploma? "+AreDiploma);

        calculMedie();
    }


    public void calculMedie(){
        Integer nota1=8;
        Integer nota2=9;
        Integer nota3=7;
        Integer medie=(nota1+nota2+nota3)/3;
        System.out.println("Media studentului este: "+medie);

    }


}
