import java.util.concurrent.ThreadLocalRandom;

public class ExemploLacosDeRepeticao {
    public static void main(String[] args) {
        //For no java
        System.out.println("0 a 10 for");
        for(int i = 0; i <= 10; i++){
            System.out.println(i);
        }

//        //while de 0 a 10
        System.out.println("0 a 10 while");
        Integer contador = 0;
        while (contador <= 10){
            System.out.println(contador);
            contador++;
        }

        //Enquanto não sortear 3, continue sorteando

        Integer inteiroAleatorio = ThreadLocalRandom.current().nextInt( 0, 6);
        while (inteiroAleatorio != 3) {
            System.out.println("Não sorteu, \nnumero sorteado: " + inteiroAleatorio);
            inteiroAleatorio = ThreadLocalRandom.current().nextInt( 0, 6);
        }

        System.out.println("SORTEADOO!" + inteiroAleatorio);
    }
}
