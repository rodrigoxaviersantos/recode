// Ler 3 notas de 10 alunos, mostrar a
// média aritmética das 3 notas de cada aluno e ao
// final mostrar a maior média dos 10 alunos.

import java.util.Scanner;
public class MediaAlunos {
    public static void main(String[] args) {
        Scanner entrada = new Scanner (System.in);
        float nota1,nota2,nota3,mediaAluno,mediaTurma=0;
        int ind;
        for (ind=1;ind<=10;ind++) {
        System.out.print("Digite nota1: ");
        nota1=entrada.nextFloat();
        System.out.print("Digite nota2: ");
        nota2=entrada.nextFloat();
        System.out.print("Digite nota3: ");
        nota3=entrada.nextFloat();
        mediaAluno = (nota1+nota2+nota3)/3;
        System.out.println("A media do aluno foi : "+mediaAluno);
        if (mediaAluno > mediaTurma)
        mediaTurma=mediaAluno;
        }
        System.out.print("A maior media dos alunos foi: "+mediaTurma);
        entrada.close();
    }
}
        
