import java.util.ArrayList;
import java.util.List;

public class Turma {

    //Declaracao de Atributos
    private String nomeDaTurma; //nome da turma
    private Professor professor; //nome do professor
    private List<Aluno> alunos = new ArrayList<>(); // uma lista de alunos

    //Construtor base com atributos
    public Turma(String nomeDaTurma, Professor professor){
        this.nomeDaTurma = nomeDaTurma;
        this.professor = professor;
    }

    public void adicionarAluno(Aluno aluno){
        alunos.add(aluno);
    }

    public void listarAlunos(){
        System.out.println("Turma:"+ nomeDaTurma + ", Professor: " + professor.getNome());
        for(Aluno aluno : alunos){
            aluno.apresentar();
        }
    }

    public double calcularMediaDaTurma(){
        double soma = 0;
        for(Aluno aluno : alunos){
            soma += aluno.calcularMedia();
        }
        return alunos.size() > 0 ? soma / alunos.size() : 0;
    }

}
