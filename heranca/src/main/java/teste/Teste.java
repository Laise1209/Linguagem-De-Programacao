package teste;

import agregacao.Faculdade;
import heranca.Aluno;
import heranca.AlunoPos;

public class Teste {
    public static void main(String[] args) {
        Aluno aluno01 = new Aluno("123456", "Bob da silva", 6.7, 5.8, 3);
        AlunoPos alunoPos02 = new AlunoPos("126556", "Xampson da silva", 9.7, 8.8, 2, 5.8,8.8);
        Faculdade faculdade01 = new Faculdade("Sptech");

        faculdade01.matricular(aluno01);
        System.out.println("Exibir alunos");
        faculdade01.exibirAlunos();
        System.out.println("Exibir soma das notas");
        System.out.println(faculdade01.somaNotasTcc());
    }
}
