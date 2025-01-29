package dobackaofront.model;

public class Funcionario extends Usuario {
    int id;
    String cargo;

    public Funcionario(String nome, int idade, String cpf, int id, String cargo) {
        super(nome, idade, cpf);
        this.id = id;
        this.cargo = cargo;
    }
}
