package es3;

import java.util.HashMap;

public class Rubrica {


    public HashMap<Object, Object> rubric;

    public Rubrica(){
        this.rubric = new HashMap<>();
    }


    public void nuovoContatto (String name, String number){
        rubric.put(name,number);
    }

    public void rimuoviContatto(String nome){
        rubric.remove(nome);
    }

    public String cercaNumero(String number) {
        return (String) rubric.get(number);
    }
    public String cercaNome(String nome) {
        return (String) rubric.get(nome);
    }

    @Override
    public String toString() {
        return "Rubrica{" +
                "rubric=" + rubric +
                '}';
    }
}
