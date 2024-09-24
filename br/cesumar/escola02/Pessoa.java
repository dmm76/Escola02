public class Pessoa {
    private String nome;
    private int idade;

    //construtor com atributos
    public Pessoa(String nome, int idade){
        this.nome = nome;
        this.idade = idade;
    }

    //Getter nome
    public String getNome(){
        return this.nome;
    }

    //Setter nome
    public void setNome(String nome){
        this.nome = nome;
    }

    //Getter idade
    public int getIdade(){
        return this.idade;
    }

    //Setter idade
    public void setIdade(int idade){
        this.idade = idade;
    }

    public void apresentar(){
        System.out.println("Nome: "+getNome() + ", Idade: "+ getIdade());
    }

}
