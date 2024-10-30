import java.util.Scanner;
public class Teste {

        public static void main(String[] args){
            Cofrinho cofrinho1 = new Cofrinho();
            cofrinho1.cofrinhoQuebrado = false;
            cofrinho1.guardar(50.10);
            Double valorResgatado = cofrinho1.quebrar();

            if(valorResgatado == null){
                System.out.println("Já foi quebrado");
            } else{
                System.out.println("Você quebrou e resgatou " + valorResgatado);
            }

        }


}
