import java.util.Scanner;

public class ExemploScanner {
    public static void main(String[] args) {
        //PRA USAR SCANNER, PRECISA CRIAR UM OBJETO
        // O que caracteriza um objeto: palavra NEW
        // Parâmentros = Argumentos

        /////////////////////////////////////////////////////////////////
        //System.in = input do sistema
        // new Nome() - criação de um objeto

        /* Scanner leitor = new Scanner(System.in);
        System.out.println("Digite seu nome: ");
        String nomeUsuario = leitor.nextLine();

        System.out.println("""
                O nome digitado foi: %s""".formatted(nomeUsuario));
         */

        //////////////////////////////////////////////////////////////////
        //ATIVIDADE
        Scanner leitor = new Scanner(System.in);

        System.out.println("Digite seu nome: ");
        String nome = leitor.nextLine();

        System.out.println("Digite sua idade: ");
        Integer idade = leitor.nextInt();

        System.out.println("Digite sua altura: ");
        Double altura = leitor.nextDouble();

        System.out.println(""" 
                Olá %s, você tem %d anos e %.2f de altura!""".formatted(nome, idade, altura));
    }
}
