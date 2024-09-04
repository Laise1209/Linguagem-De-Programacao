import java.util.Scanner;

public class Teste {
    public static void main(String[] args) {
        MetodosDivertidos metodos = new MetodosDivertidos();

        Integer tentativasNecessarias = metodos.avaliandoSorte(7);

        System.out.println("""
                Tentativas usadas: %d
                """.formatted(tentativasNecessarias));

        Integer soma = metodos.exibeSomaSorteio();

        System.out.println("""
                Soma dos números: %d
                """.formatted(soma));

        metodos.exibeImpares();

        Integer sorteio = metodos.posicaoSorteio(80);

        System.out.println("""
                Posição em que o número 80 foi sorteado: %d
                """.formatted(sorteio));
    }
}
