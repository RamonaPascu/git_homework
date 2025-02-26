package tema4;

import java.util.HashMap;
import java.util.Map;

public class TemaHashMap {
    public static void main(String[] args) {
        //cream cele 3 HashMaps
        HashMap<String, String> numeMap = new HashMap<>();
        HashMap<String, String> produseMap = new HashMap<>();
        HashMap<String, Integer> rezultateMap = new HashMap<>();

        // apelarea functiilor de adaugare elemente in fiecare HashMap
        populeazaNume(numeMap);
        populeazaProduse(produseMap);
        populeazaRezultate(rezultateMap);

        // apelarea functiilor de parcurgere a fiecarui HashMap cu entrySet() si for-each loop
        System.out.println("---------------------------------------");
        System.out.println("| * Listarea valorilor HashMap-urilor |");
        System.out.println("---------------------------------------");
        parcurgeNumeEntrySet(numeMap);
        parcurgeProduseEntrySet(produseMap);
        parcurgeRezultateEntrySet(rezultateMap);

        //apelarea functiilor pentru accesarea unei valori din fiecare HashMap
        System.out.println("----------------------------------------------------");
        System.out.println("| * Accesarea cate unei valori din fiecare HashMap |");
        System.out.println("----------------------------------------------------");
        acceseazaNume(numeMap, "Diana Popa");
        acceseazaProdus(produseMap, "Aspirator");
        acceseazaRezultat(rezultateMap, "Duster");

        //apelarea functiilor pentru verificarea existentei unei chei in fiecare HashMap
        System.out.println("----------------------------------------------------------");
        System.out.println("| * Verificarea existentei unei chei din fiecare HashMap |");
        System.out.println("----------------------------------------------------------");
        verificaNume(numeMap, "Ana Dolga");
        verificaProdus(produseMap, "Mixer Vertical");
        verificaRezultat(rezultateMap, "Logan"); // returneaza false

        //apelarea functiilor pentru stergerea a 3 perechi de cheie-valoare
        stergeNume(numeMap, "Andrei Ionescu");
        stergeProdus(produseMap, "Air Fryer");
        stergeRezultat(rezultateMap, "Sandero");

        //apelarea functiilor de parcurgere a fiecarui HashMap cu Lambda si .forEach()
        System.out.println("---------------------------------------------------------------------------");
        System.out.println("| * O noua listarea a valorilor HashMap-urilor, dupa stergerea a 3 valori |");
        System.out.println("---------------------------------------------------------------------------");
        parcurgeNumeLambda(numeMap);
        parcurgeProduseLambda(produseMap);
        parcurgeRezultateLambda(rezultateMap);

        //apelarea functiilor de inlocuire a valorii la 3 chei
         inlocuiesteNume(numeMap, "Gabriel Popescu", "Timisoara");
         inlocuiesteProdus(produseMap, "Cafetiera", "355 RON");
         inlocuiesteRezultat(rezultateMap, "Stepway", 1);

         //apelare functii parcugere, dupa inlocuire
        System.out.println("------------------------------------------------------");
        System.out.println("| * Listarea valorilor HashMap-urilor dupa inlocuire |");
        System.out.println("------------------------------------------------------");
        parcurgeNumeEntrySet(numeMap);
        parcurgeProduseEntrySet(produseMap);
        parcurgeRezultateEntrySet(rezultateMap);

        //apelare functii adaugare ulterioara
        adaugareUlterioaraNume(numeMap, "Raluca Taranu", "Oradea");
        adaugareUlterioaraProdus(produseMap, "Toaster", "150 RON");
        adaugareUlterioaraRezultat(rezultateMap, "Jogger", 6);

        //apelare functii parcugere, dupa adaugarea ulterioara
        System.out.println("----------------------------------------------------------");
        System.out.println("| * Listarea ultimei versiuni a valorilor HashMap-urilor |");
        System.out.println("----------------------------------------------------------");
        parcurgeNumeEntrySet(numeMap);
        parcurgeProduseEntrySet(produseMap);
        parcurgeRezultateEntrySet(rezultateMap);

    }
        // functie adaugare valori initiale in HashMap numeMap
        public static void populeazaNume(HashMap<String, String> numeMap){
        numeMap.put("Diana Popa", "Iasi");
        numeMap.put("Andrei Ionescu", "Cluj Napoca");
        numeMap.put("Gabriel Popescu", "Brasov");
        numeMap.put("Ana Dolga", "Bucuresti");
    }

    // functie adaugare valori initiale in HashMap produseMap
    public static void populeazaProduse(HashMap<String, String> produseMap) {
        produseMap.put("Cafetiera", "300 RON");
        produseMap.put("Aspirator", "850 RON");
        produseMap.put("Air Fryer", "700 RON");
        produseMap.put("Mixer Vertical", "400 RON");
    }
    // functie adaugare valori initiale in HashMap rezultateMap
    public static void populeazaRezultate(HashMap<String, Integer> rezultateMap) {
        rezultateMap.put("Duster", 5);
        rezultateMap.put("Sandero", 3);
        rezultateMap.put("Stepway", 2);
        rezultateMap.put("Lodgy", 4);
    }

    //functie parcurgere numeMap folosind entrySet() si for-each loop
    public static void parcurgeNumeEntrySet(HashMap<String, String> numeMap) {
        for (Map.Entry<String, String> entry : numeMap.entrySet()) {
            System.out.println(entry.getKey() + " → " + entry.getValue());
        }
    }

    //functie parcurgere produseMap folosind entrySet() si for-each loop
    public static void parcurgeProduseEntrySet(HashMap<String, String> produseMap) {
        for (Map.Entry<String, String> entry : produseMap.entrySet()) {
            System.out.println(entry.getKey() + " → " + entry.getValue());
        }
    }

    //functie parcurgere rezultateMap folosind entrySet() si for-each loop
    public static void parcurgeRezultateEntrySet(HashMap<String, Integer> rezultateMap) {
        for (Map.Entry<String, Integer> entry : rezultateMap.entrySet()) {
            System.out.println(entry.getKey() + " → " + entry.getValue());
        }
    }

    //functie pt. accesarea unei valori din numeMap
    public static void acceseazaNume(HashMap<String, String> numeMap, String key) {
        String value = numeMap.get(key);
        System.out.println("Locatia lui " + key + " este: " + value);
    }

    //functie pt. accesarea unei valori din produseMap
    public static void acceseazaProdus(HashMap<String, String> produseMap, String key) {
        String value = produseMap.get(key);
        System.out.println("Pretul pentru " + key + " este: " + value);
    }

    //functie pt. accesarea unei valori din rezultateMap
    public static void acceseazaRezultat(HashMap<String, Integer> rezultateMap, String key) {
        Integer value = rezultateMap.get(key);
        System.out.println("Punctajul pentru " + key + " este: " + value);
    }

    //functie pt. verificarea existentei unei chei in numeMap folosind containsKey()
    public static void verificaNume(HashMap<String, String> numeMap, String key) {
        boolean exists = numeMap.containsKey(key);
        System.out.println("Exista " + key + " in numeMap? " + exists);
    }

    //functie pt. verificarea existentei unei chei in produseMap folosind containsKey()
    public static void verificaProdus(HashMap<String, String> produseMap, String key) {
        boolean exists = produseMap.containsKey(key);
        System.out.println("Exista " + key + " in produseMap? " + exists);
    }

    //functie pt. verificarea existentei unei chei in rezultateMap folosind containsKey()
    public static void verificaRezultat(HashMap<String, Integer> rezultateMap, String key) {
        boolean exists = rezultateMap.containsKey(key);
        System.out.println("Exista " + key + " in rezultateMap? " + exists);
    }

    //functie pt. stergerea unui element din numeMap
    public static void stergeNume(HashMap<String, String> numeMap, String key) {
        numeMap.remove(key);
    }

    //functie pt. stergerea unui element din produseMap
    public static void stergeProdus(HashMap<String, String> produseMap, String key) {
        produseMap.remove(key);
    }

    //functie pt. stergerea unui element din rezultateMap
    public static void stergeRezultat(HashMap<String, Integer> rezultateMap, String key) {
        rezultateMap.remove(key);
    }

    //functie parcurgere numeMap folosind Lambda si .forEach()
    public static void parcurgeNumeLambda(HashMap<String, String> numeMap) {
        numeMap.forEach((key, value) -> System.out.println(key + " → " + value));
    }

    //functie parcurgere produseMap folosind Lambda si .forEach()
    public static void parcurgeProduseLambda(HashMap<String, String> produseMap) {
        produseMap.forEach((key, value) -> System.out.println(key + " → " + value));
    }

    //functie parcurgere rezultateMap folosind Lambda si .forEach()
    public static void parcurgeRezultateLambda(HashMap<String, Integer> rezultateMap) {
        rezultateMap.forEach((key, value) -> System.out.println(key + " → " + value));
    }

    //functie de inlocuire a unei valori din numeMap
    public static void inlocuiesteNume(HashMap<String, String> numeMap, String key, String newValue) {
        if (numeMap.containsKey(key)) {
            numeMap.replace(key, newValue);
        }
    }

    //functie de inlocuire a unei valori din produseMap
    public static void inlocuiesteProdus(HashMap<String, String> produseMap, String key, String newValue) {
        if (produseMap.containsKey(key)) {
            produseMap.replace(key, newValue);
        }
    }

    //functie de inlocuire a unei valori din rezultateMap
    public static void inlocuiesteRezultat(HashMap<String, Integer> rezultateMap, String key, Integer newValue) {
        if (rezultateMap.containsKey(key)) {
            rezultateMap.replace(key, newValue);
        }
    }

    // functie de adaugare ulterioara a unui element, daca nu exista deja, in numeMap
    public static void adaugareUlterioaraNume(HashMap<String, String> numeMap, String key, String value) {
        numeMap.putIfAbsent(key, value);
    }

    //de adaugare ulterioara a unui element, daca nu exista deja, in produseMap
    public static void adaugareUlterioaraProdus(HashMap<String, String> produseMap, String key, String value) {
        produseMap.putIfAbsent(key, value);
    }

    // functie de adaugare ulterioara a unui element, daca nu exista deja, in rezultateMap
    public static void adaugareUlterioaraRezultat(HashMap<String, Integer> rezultateMap, String key, Integer value) {
        rezultateMap.putIfAbsent(key, value);
    }

}
