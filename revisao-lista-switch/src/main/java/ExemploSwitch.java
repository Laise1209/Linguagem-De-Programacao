import java.util.Scanner;

public class ExemploSwitch {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        System.out.println("Digite um número de 1 a 7");
        Integer diaSemana = leitor.nextInt();

/*        if(diaSemana == 1){
            System.out.println("Domingo");
        } else if(diaSemana == 2){
            System.out.println("Segunda");
        } else if(diaSemana == 3){
            System.out.println("Terça");
        } else if(diaSemana == 4){
            System.out.println("Quarta");
        } else if(diaSemana == 5){
            System.out.println("Quinta");
        } else if(diaSemana == 6){
            System.out.println("Sexta");
        } else if(diaSemana == 7){
            System.out.println("Sábado");
        } else{
            System.out.println("Não ta podendo esse dia");
        }*/

        //Estrutura de decisão mais simples
        //tem q por o break pra ir pro próximo case, se não ele printa tudo
        //Só aceita Integer, String e Enum
        switch (diaSemana){
            case 1: System.out.println("Domingo"); break;
            case 2: System.out.println("Segunda"); break;
            case 3: System.out.println("Terça"); break;
            case 4: System.out.println("Quarta"); break;
            case 5: System.out.println("Quinta"); break;
            case 6: System.out.println("Sexta"); break;
            case 7: System.out.println("Sábado"); break;
            //default = else
            default: System.out.println("Não ta podendo esse dia");
        }

//        /*switch (diaSemana){
//            case 1 -> { // varias linhas
//                System.out.println("Domingo");}
//            case 2 -> System.out.println("Segunda"); //1 linha só
//        }*/

        String texto = switch (diaSemana){
            case 1 -> "Domingo";
            case 2 -> "Segunda";
            case 3 -> "Terça";
            case 4 -> "Quarta";
            case 5 -> "Quinta";
            case 6 -> "Sexta";
            case 7 -> "Sábado";
            default -> "Não ta podendo esse dia";
        };

        System.out.println(texto);
    }
}
