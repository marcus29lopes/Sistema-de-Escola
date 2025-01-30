package sistemaEscola.model;

public class Funcionario extends Usuario {
    private int id;
    private String cargo;

    public Funcionario(String nome, int idade, String cpf, int id, String cargo) {
        super(nome, idade, cpf);
        this.id = id;
        this.cargo = cargo;
    }

    public int getId() {
        return id;
    }
    public String getCargo() {
        return cargo;
    }

    @Override
    public String toString() {
        return "Nome: " + getNome() +
                "\nIdade: " + getIdade() +
                "\nCpf: " + getCpf() +
                "\nid: " + getId() +
                "\ncargo: " + getCargo();
    }

}
