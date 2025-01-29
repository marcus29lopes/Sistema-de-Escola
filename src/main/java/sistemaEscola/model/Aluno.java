package sistemaEscola.model;

public class Aluno extends Usuario {
    private int matricula;
    private String curso;

    public Aluno(String nome, int idade, String cpf, int matricula, String curso){
        super(nome, idade, cpf);
        this.matricula = matricula;
        this.curso = curso;
    }
}
