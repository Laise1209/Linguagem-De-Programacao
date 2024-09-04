import java.util.ArrayList;
import java.util.List;

public class ExemploLista {
    public static void main(String[] args) {
        List listaEstranha = new ArrayList();
        listaEstranha.add(true);
        listaEstranha.add("Bob");
        listaEstranha.add(54);

        List<String> nomes = new ArrayList<>();
        nomes.add("Bob da Silva");
        nomes.add("José");
        nomes.add("Maria");

        System.out.println("Segundo nome da lista: " + nomes.get(1));

        for (int i = 0; i < nomes.size(); i++) {
            System.out.println("""
                    Nome %d: %s""".formatted(i+1, nomes.get(i)));
        }
        //Trocando José por Xampson
        listaEstranha.set(1, "Xampson");

        //Principais métodos da lista java
        //add
        //size - retorna o tamanho
        //get - busca elemento por indice
        //remove - remove elemento por indice
        //isEmpty - retorna true se a lista está vazia
        //clear - limpa a list
    }
}