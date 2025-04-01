package glhrm.Alunos;


// Interface Apresentavel
interface Apresentacao {
    void apresentar();
}


// Superclasse Cidadao (Implementa Apresentacao)
// Representa uma pessoa genérica, utilizando encapsulamento para proteger os atributos
public class Cidadao implements Apresentacao{
    
    public String nome;
    private String cpf;
    private String dataDeNascimento;

    // Construtor da classe Pessoa (o nome é idêntico ao da Classe)
    public Cidadao(String nome, String cpf, String dataDeNascimento) {
        this.nome = nome;
        this.cpf = cpf;
        this.dataDeNascimento = dataDeNascimento;
    }

    // Métodos de ACESSO (Getters) e MODIFICAÇÃO (Setters) dos valores dos atributos da classe
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getDataDeNascimento() {
        return dataDeNascimento;
    }

    public void setDataDeNascimento(String dataDeNascimento) {
        this.dataDeNascimento = dataDeNascimento;
    }
    
    @Override
    public void apresentar() {
        System.out.println("Cidadão: " + nome);
    }
    
}
