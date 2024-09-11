import java.util.Scanner;

public class OperacoesMatematicas {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        System.out.println("""
                1 - Somar
                2 - Subtrair
                3 - Multiplicar
                4 - Sair
                """);
        Integer numeroValido = leitor.nextInt();

        while (numeroValido != 4){
            switch (numeroValido){
                case 1, 2, 3 -> {
                    Scanner numero1 = new Scanner(System.in);
                    System.out.println("Insira um numero");
                    Integer num1 = numero1.nextInt();

                    Scanner numero2 = new Scanner(System.in);
                    System.out.println("Insira um numero");
                    Integer num2 = numero2.nextInt();

                    if(numeroValido == 1){
                        Integer soma = num1 + num2;
                        System.out.println(soma);
                    } else if( numeroValido == 2){
                        Integer subtracao = num1 - num2;
                        System.out.println(subtracao);
                    } else if( numeroValido == 3){
                        Integer multiplicacao = num1 * num2;
                        System.out.println(multiplicacao);
                    }

                }
                case 4 -> {
                    System.out.println();
                }
                default -> {
                    System.out.println("Escolha inválida");}
                };

            System.out.println("""
                1 - Somar
                2 - Subtrair
                3 - Multiplicar
                4 - Sair
                """);
            numeroValido = leitor.nextInt();
            }
        }

}
