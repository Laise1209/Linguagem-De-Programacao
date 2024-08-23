import java.util.Scanner;

public class ProjetoTeste {
    public static void main(String[] args) {
        //Criando um objeto para utilizar seus métodos
//        MetodosUteis util = new MetodosUteis();
//
//        String nomeUsuario = "Bob da silva";
//
//        util.metodosLegais(nomeUsuario);

        Scanner leitura = new Scanner(System.in);
        MetodosUteis util = new MetodosUteis();
        String nome = "Josivaldo da Silva";
        util.metodosLegais(nome);
    }
}
