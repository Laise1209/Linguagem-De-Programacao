import java.util.concurrent.ThreadLocalRandom;

public class MetodosDivertidos {
    Integer avaliandoSorte(Integer numeroEscolhido){

        Integer qtdTentativas = 0;

        Integer numeroSorteado = ThreadLocalRandom.current().nextInt(0,11);
        while(!numeroSorteado.equals(numeroEscolhido)) {
            numeroSorteado = ThreadLocalRandom.current().nextInt(0, 11);
            if(!numeroSorteado.equals(numeroEscolhido)){
                System.out.println("""
                    Numero errado! Numero sorteado: %d 
                    """.formatted(numeroSorteado));
            }else{
                System.out.println("""
                    Acertou! Numero: %d 
                    """.formatted(numeroEscolhido));
            }

            qtdTentativas++;
        }
        return qtdTentativas;
    }

    Integer exibeSomaSorteio(){

        Integer numeroSorteado = ThreadLocalRandom.current().nextInt(0,11);
        Integer somaNumeros = numeroSorteado;

        while(!numeroSorteado.equals(0)){
            somaNumeros += numeroSorteado;
            numeroSorteado = ThreadLocalRandom.current().nextInt(0,11);
        }

        return somaNumeros;
    }

    void exibeImpares(){
        int i = 0;
        for(i = 0; i <= 90; i++){
            Integer resto = i % 2;
            if(resto.equals(1)){
                System.out.println(i);
            }
        }
    }

    Integer posicaoSorteio(Integer numero){
        for(int i = 0; 1 <= 200; i++){
            Integer numeroSorteado = ThreadLocalRandom.current().nextInt(1,101);
            if(numeroSorteado == numero){
                return i;
            } else{
                return -1;
            }
        }
    }
}
