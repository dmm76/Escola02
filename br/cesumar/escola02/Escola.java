import java.text.DecimalFormat;

public class Escola {
    public static void main(String[] args){

        DecimalFormat df = new DecimalFormat("#.00");

        //Criando professor para a turma
        Professor professorPortugues = new Professor("Patrica Alves", 48, "Português");

        //Criando Turma
        Turma turma6A = new Turma("6A", professorPortugues);

        //Criando Alunos e adicionando notas
        Aluno aluno1 = new Aluno("Douglas Monquero", 48);
        aluno1.adicionarNota(9.5);
        aluno1.adicionarNota(10.0);

        Aluno aluno2 = new Aluno("Ana Burn", 36);
        aluno2.adicionarNota(7.5);
        aluno2.adicionarNota(8.5);

        Aluno aluno3 = new Aluno("Carlos Drummond de Andrade", 38);
        aluno3.adicionarNota(8.0);
        aluno3.adicionarNota(7.0);

        //Adicionar aluno à Turma
        turma6A.adicionarAluno(aluno1);
        turma6A.adicionarAluno(aluno2);
        turma6A.adicionarAluno(aluno3);

        turma6A.listarAlunos();
        System.out.println("Média da Turma: " + df.format(turma6A.calcularMediaDaTurma()));

    }
}
