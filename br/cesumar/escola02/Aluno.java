import java.util.ArrayList;
import java.util.List;

public class Aluno extends Pessoa{

    //Criacao da lista para receber as notas dos alunos
    private List<Double> notas = new ArrayList<>();

    //Construtor Aluno com parametros
    public Aluno(String nome, int idade){
        super(nome, idade);
    }
    
    //Metodo que adiciona notas na lista "notas"
    public void adicionarNota(double nota){
        notas.add(nota);
    }

    //Metodo para calcular Média
    public double calcularMedia(){
        double soma = 0;
        for(double nota : notas){
            soma += nota;
        }
        return notas.size() > 0 ? soma / notas.size() : 0;
    }

    @Override
    public void apresentar(){
        System.out.println("Aluno: "+getNome() + ", Idade: " + getIdade() + " Média: " + calcularMedia());
    }
}
