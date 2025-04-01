package glhrm.Alunos;

import java.util.ArrayList;
import java.util.List;

public class Alunos {
    public static void main(String[] args) {
        // Criando alunos
        // Atributos:             nome,      cpf,   dataNascimento, matricula, turma, coeficienteRendimento  
        Aluno aluno1 = new Aluno("Guilherme", "123456789", "03/03/1997", 1001, "Turma A", 8.5);
        Aluno aluno2 = new Aluno("Túlio", "987654321", "05/06/1997", 1002, "Turma A", 9.0);
        Aluno aluno3 = new Aluno("Gabriela", "111222333", "10/11/1997", 1003, "Turma B", 7.5);
        Aluno aluno4 = new Aluno("Hyan", "222333444", "15/03/1997", 1004, "Turma A", 8.9);
        Aluno aluno5 = new Aluno("Eduardo", "333444555", "20/07/1997", 1005, "Turma B", 7.8);
        Aluno aluno6 = new Aluno("Nathielly", "444555666", "25/09/1997", 1006, "Turma A", 9.2);
        Aluno aluno7 = new Aluno("João Vitor", "555666777", "30/11/1997", 1007, "Turma B", 6.5);
        Aluno aluno8 = new Aluno("Diogo", "666777888", "12/02/1997", 1008, "Turma A", 8.0);
        Aluno aluno9 = new Aluno("Júlia", "777888999", "18/05/1997", 1009, "Turma B", 7.3);
        Aluno aluno10 = new Aluno("Barbara", "888999000", "22/08/1997", 1010, "Turma B", 9.5);

        // Criando lista de alunos
        List<Aluno> alunos = new ArrayList<>();
        alunos.add(aluno1);
        alunos.add(aluno2);
        alunos.add(aluno3);
        alunos.add(aluno4);
        alunos.add(aluno5);
        alunos.add(aluno6);
        alunos.add(aluno7);
        alunos.add(aluno8);
        alunos.add(aluno9);
        alunos.add(aluno10);

        // Listando alunos da turma A
        //Sout para um cabeçalho simples
        System.out.println("\nLista de alunos da Turma A:");
        
        //Chamando o método listarTurma() com o parâmetro alunos em Turma A
        Aluno.listarTurma(alunos, "Turma A");
        
        // Listando alunos da turma B
        System.out.println("\nLista de alunos da Turma B:");
        Aluno.listarTurma(alunos, "Turma B");
        
        // Poderíamos também criar novas listagens como, por exemplo, alunos decrescentes pelo Coeficiente de Rendimento
    }

}

