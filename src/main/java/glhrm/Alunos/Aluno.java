package glhrm.Alunos;

import java.util.List;

// Classe Aluno que herda de Cidadao => HERANÇA EM POO
public class Aluno extends Cidadao implements Apresentacao {
  
    // Além dos atributos genéricos de Cidadao, Aluno recebe atributos específicos:
    private int matricula;
    private String turma;
    private double coeficienteRendimento;

    public Aluno(String nome, String cpf, String dataDeNascimento, int matricula, String turma, double coeficienteRendimento) {
        // super() chama o construtor da super classe
        super(nome, cpf, dataDeNascimento);
        
        // Atributos específicos
        this.matricula = matricula;
        this.turma = turma;
        this.coeficienteRendimento = coeficienteRendimento;
    }

    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public String getTurma() {
        return turma;
    }

    public void setTurma(String turma) {
        this.turma = turma;
    }

    public double getCoeficienteRendimento() {
        return coeficienteRendimento;
    }

    public void setCoeficienteRendimento(double coeficienteRendimento) {
        this.coeficienteRendimento = coeficienteRendimento;
    }

    // Aplicando POLIMORFISMO por meio de sobrescrita
    @Override
    public void apresentar() {
        System.out.println("Aluno: " + getNome() + ", Matrícula: " + matricula);
    }    
    
    // Método para listar alunos da mesma turma
    public static void listarTurma(List<Aluno> alunos, String turma) {
        // Criação de um cabeçalho
        System.out.println("Alunos da turma " + turma + ":");
        
        //  Criação de um LAÇO DE REPETIÇÃO para incluir na lista "alunos"
        //  cada "Aluno" cujo atributo "turma" tiver o mesmo valor (nesse caso, A ou B)
        for (Aluno aluno : alunos) {
            // validação "se" utilizando o getTurma para comparar com a turma sendo listada
            if (aluno.getTurma().equals(turma)) {
                // Caso a validação retorne positiva para o aluno, chama o método apresentar()
                aluno.apresentar();
            }
        }
    }
    
}
