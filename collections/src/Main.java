import es3.Rubrica;

import java.util.*;
import java.util.stream.Stream;

import static java.util.Collections.sort;

public class Main {
    public static void main(String[] args) {

        List<Integer> listaEsempio = new ArrayList<>();

        for (int i = 0; i < 6; i++) {
            listaEsempio.add(i);
        }


        Rubrica rubrica = new Rubrica();

        rubrica.nuovoContatto("Mario" , "123456");
        rubrica.nuovoContatto("Luigi" , "789456");
        rubrica.nuovoContatto("Sconosciuto", "125478");

        rubrica.rimuoviContatto("Sconosciuto");

        System.out.println( rubrica.cercaNome("Mario"));
        System.out.println(rubrica.cercaNumero("789456"));









        System.out.println(rubrica);







//        position(listaEsempio, false);

//        set();
//        ordina(10);
//        newOrder(listaEsempio);
    }

    public static void set() {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Inserisci il numero di parole che vuoi");
        int numeroParole = Integer.parseInt(scanner.nextLine());
        System.out.println("Dimmi " + numeroParole + "elementi che inserisci nella lista della spesa");
        Set<String> elementiLista = new HashSet<String>();
        List<String> lista = new ArrayList<String>();

        for (int i = 0; i < numeroParole; i++) {
            String elementi = scanner.nextLine();
            elementiLista.add(elementi);
            lista.add(elementi);


        }
        for (String elementi : elementiLista) {
            System.out.println(elementi);


        }

        System.out.println(lista);
        System.out.println(elementiLista);


    }

    public static void ordina(int num) {

        List<Integer> numeriInteri = new ArrayList<>();

        Random random = new Random();


        for (int i = 0; i < num; i++) {
            int numeri = random.nextInt(100);
            numeriInteri.add(numeri);
        }
        Collections.sort(numeriInteri);
        System.out.println(numeriInteri);
    }

    public static void newOrder(List<Integer> lista) {

        List<Integer> lista2 = new ArrayList<>(lista);
        Collections.reverse(lista2);

        List<Integer> newList = new ArrayList<>(lista);
        newList.addAll(lista2);

        System.out.println(newList);
    }

    public static void position(List<Integer> lista2, boolean valore) {

        for (int i = 0; i < lista2.size(); i++) {
            if (valore) {
                if (i % 2 == 0) {
                    System.out.println(lista2.get(i));
                }
            } else {
                if (i % 2 != 0) {
                    System.out.println(lista2.get(i));
                }
            }
        }
    }
}