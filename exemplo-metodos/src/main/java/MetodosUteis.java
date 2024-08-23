public class MetodosUteis {
    //Métod0
    //Retorno: esse é void sem retorno
    //nome: metodosLegais
    //argumentos: nomeUsuario
    //corpo: faz um print com nome

    void metodosLegais(String nome){
        System.out.println("""
                *----------*----------*
                Usuário logado: %s
                *----------*----------*
                """.formatted(nome));
    }

    Double somar(Double num01, Double num02){
        return num01 + num02;
    }
}
