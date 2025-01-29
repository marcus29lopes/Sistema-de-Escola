package dobackaofront.model;

public class Funcionario extends Usuario {
    String cargo;

    public Funcionario(String nome, int idade, String cpf, String cargo) {
        super(nome, idade, cpf);
        this.cargo = cargo;
    }
}
