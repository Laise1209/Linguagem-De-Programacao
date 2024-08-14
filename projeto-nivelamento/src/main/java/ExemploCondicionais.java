public class ExemploCondicionais {
    public static void main(String[] args) {

        Integer idade = 19;

        if (idade >= 18){
           System.out.println("É maior de idade");
        } else {
            System.out.println("É menor de dade");
        }

        //Nunca usar == para string. USAR: variavel.equals(variavel)
        Boolean bloqueado = false;

        String nome01 = "Bob";
        String nome02 = "Bob";
        String nome03 = "Januario";

        if (nome01.equals(nome02) && nome01.equals(nome03)){
            System.out.println("O nome é igual");
        } else {
            System.out.println("O nome é diferente");
        }

        //operador tenário
        String resultadoMaioridade = idade >= 18 ? "Sim" : "Não";
        Boolean ehMaioridade = idade >= 18;
        System.out.println("É maior de idade: " + resultadoMaioridade);
    }
}
