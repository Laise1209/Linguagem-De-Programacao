public class ExemploRevisao {
    public static void main(String[] args) {
        //metodo main é um programa executável
        //Para ser uma classe, precisa ter a primeira letra em caixa ala

        //tipos de variaveis que usaremos:

        //Tipos wrapper = são classe, ou seja, possuem métodos que ajudam
        String nome = "Bob da silva"; //valores de texto (string)
        Integer idade = 42; //numeros inteiros
        Double altura = 1.55; //numeros quebrados
        Boolean bloqueado = false; //valores booleanos (true/false)

        //É possível declarar a classe e depois inicializa
        // O valor inicial de Wrapper sempre vai ser null, porém o tipo primitivo sempre tem valor inicial

        //Tipo primitivo = não são classe, sem métodos NÃO USAREMOS
        boolean bloquado2 = false;
        int numero = 53;

        //Println normal
        System.out.println("Meu nome é " + nome + ", minha altura é " + altura + "\ne minha idade é " + idade);
        // \n faz a quebra de linha da frase

        //Println com interpolação
        System.out.println(("Meu nome é %s, minha altura é %.2f e minha idade é %d").formatted(nome, altura, idade));

        // Interpolação:
        // %s - para classes string
        // %d - para classes de numero inteiro
        // %.2f - para classes de numero quebrado

        // Obs: para elas funcionarem precisa do metodo .formtatted
        // Obs: precisa declarar na ordem quais são os nomes das classes

        //Println com interpolação e text block
        System.out.println("""
                Nome: %s
                Idade: %d
                Altura: %.2f
                Nome do pet: %s
                """.formatted(nome, idade, altura, "Caramelo"));
    }
}
