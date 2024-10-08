public class Professor extends Pessoa {
    private String disciplina;

    public Professor(String nome, int idade, String disciplina){
        super(nome, idade);
        this.disciplina = disciplina;
    }

    public String getDisciplina(){
        return this.disciplina;
    }

    public void setDisciplina(String disciplina){
        this.disciplina = disciplina;
    }

    public void apresentar(){
        System.out.println("Professor: " + getNome() + ", Idade: " + getIdade() + "Disciplina: " + getDisciplina());
    }
}
