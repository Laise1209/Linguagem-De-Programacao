import java.util.ArrayList;
import java.util.List;

public class RevisaoListas {
    public static void main(String[] args) {

// Alt + J = ctrl D do intellij

        List<String> frutasImutavel = List.of("Laranja", "Goiaba", "Limão");
        System.out.println(frutasImutavel);

        List<String> frutasMutavel = new ArrayList<>(List.of("Laranja", "Goiaba", "Limão"));
        frutasMutavel.add("Jararaca");
        System.out.println(frutasMutavel);

        frutasMutavel.set(2, "Melancia");
        System.out.println(frutasMutavel);

        frutasMutavel.get(3);
        System.out.println(frutasMutavel);

        frutasMutavel.remove(0); //funciona tanto o valor do índicie ou o valor do campo
        System.out.println(frutasMutavel);


////////////////////////////////////////////////////////////////////////////////////

        List<Integer> inteiros = new ArrayList<>(List.of(10, -1, 50, 90));
        Integer valor = 10;
        inteiros.remove(valor);
        System.out.println(inteiros);
        //O tipo da variável precisa estar em tipo wrapper na hora de remover
        //o valor do número da lista, se for "int" ou o numero dentro do remove, ele remove o
        //índice da lista

/////////////////////////////////////////////////////////////////////////////////////
        //for pra percorrer os itens da lista de um jeito mais fácil

        for(String frutaDaVez : frutasImutavel){
            System.out.println(frutaDaVez);
        }

        //nomeDaLista.fori - cria o for direto
        for (int i = 0; i < frutasImutavel.size(); i++) {

        }
    }
}
