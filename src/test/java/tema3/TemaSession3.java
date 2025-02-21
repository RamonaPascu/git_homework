package tema3;
import java.util.ArrayList;

public class TemaSession3 {
    public static void main(String[] args){
        //apelarea functiilor care vor parcurge cu ajutorul break, continue si return (nu am putut sa le pun pe toate in aceeasi functie)
        parcurgereNumereCuReturn();
        parcurgereNumereCuBreak();

        //creez 3 Array-uri de tipuri de date diferite
        String[] cartiArray = {"La Medeleni", "Felix si Otilia", "Ciresarii"};
        Client[] clientiArray = { new Client("Ana Popa", 23), new Client("Remus Ionescu", 41), new Client("Mihai Barna", 35)};
        double[] preturiArray = {34.99, 49.99, 29.99};

        //creez un ArrayList care contine 3 tipuri diferite de date sub tipul generic <Membru>
        ArrayList<Membru> listaMembri = new ArrayList<>();
        listaMembri.add(new Membru("Maria Toma", 2));
        listaMembri.add(new Membru("Alin Ionescu", 3));

        //apelarea functiilor care vor parcurge Array si ArrayList
        System.out.println("\n Parcurgerea Array-rilor folosind for-each:");
        parcurgereArrayCuForEach(cartiArray, clientiArray, preturiArray);
        System.out.println("\n Parcurgerea Array-rilor folosind for loop clasic:");
        parcurgereArrayCuForLoop(cartiArray, clientiArray, preturiArray);
        System.out.println("\n Parcurgerea ArrayList folosind for-each:");
        parcurgereArrayListCuForEach(listaMembri);
        System.out.println("\n Parcurgerea ArrayList folosind for loop clasic:");
        parcurgereArrayListCuForLoop(listaMembri);
    }

    //functia de parcurgere cu ajutorul continue si return
    public static void parcurgereNumereCuReturn(){
        System.out.println("Parcurgere numere folosing CONTINUE si  RETURN:");
        int[] numere = {5, 12, 18, 25, 30, 45, 55, 60};
        for (int numar : numere){
          if (numar % 2 == 0){
              System.out.println("Sarim peste numerele pare:" + numar + " folosind CONTINUE");
              continue;
          }
          if (numar == 55){
              System.out.println("Am gasit numarul: " + numar + ", opresc functia folosind RETURN");
              return;
          }
            System.out.println("Numere listate: " + numar);
        }
        System.out.println("Aceasta fraza nu ar trebui sa fie printata niciodata, daca logica e buna.");
    }
    //functia de parcurgere cu ajutorul continue si break
    public static void parcurgereNumereCuBreak(){
        System.out.println("Parcurgere numere folosind CONTINUE si BREAK:");
        int[] numere = {5, 12, 18, 25, 30, 45, 55, 60};
        for (int numar : numere){
            if (numar % 2 == 1){
                System.out.println("Sarim peste numerele impare:" + numar + " folosind CONTINUE");
                continue;
            }
            if (numar > 50){
                System.out.println("Numarul e prea mare: " + numar + "oprim folosind BREAK");
                break;
            }
            System.out.println("Numere listate: " + numar);
        }
    }
    //functia de parcurgere Array cu for loop
    public static void parcurgereArrayCuForLoop(String[] carti, Client[] clienti, double[] preturi) {
        for (int i = 0; i < carti.length; i++) {
            System.out.println("Cartea: " + carti[i]);
        }
        for (int i = 0; i < clienti.length; i++) {
            System.out.println("Client: " + clienti[i].nume + " [" + clienti[i].varsta + "]");
        }
        for (int i = 0; i < preturi.length; i++) {
            System.out.println("Pret: " + preturi[i]);
        }
    }
    //functia de parcurgere Array cu for-each loop
    public static void parcurgereArrayCuForEach(String[] carti, Client[] clienti, double[] preturi) {
        for (String carte : carti) {
            System.out.println("Carte: " + carte);
        }
        for (Client client : clienti) {
            System.out.println("Client: " + client.nume + " [" + client.varsta + "]");
        }
        for (double pret : preturi) {
            System.out.println("Pret: " + pret);
        }
    }
    //functia de parcurgere ArrayList cu for loop
    public static void parcurgereArrayListCuForLoop(ArrayList<Membru> membri) {
        for (int i = 0; i < membri.size(); i++) {
            Membru membru = membri.get(i);
            System.out.println("Membru (cu for-loop): " + membru.nume + " (Vechime: " + membru.vechime + ")");
        }
    }
    //functia de parcurgere ArrayList cu for-each loop
    public static void parcurgereArrayListCuForEach(ArrayList<Membru> membri) {
        for (Membru membru : membri) {
            System.out.println("Membru (cu for-each): " + membru.nume + " (Vechime: " + membru.vechime + ")");
        }
    }
}
class Client{
    String nume;
    int varsta;

    public Client(String nume, int varsta){
        this.nume = nume;
        this.varsta = varsta;
    }
}
class Membru {
    String nume;
    int vechime;

    public Membru(String nume, int vechime) {
        this.nume = nume;
        this.vechime = vechime;
    }
}
