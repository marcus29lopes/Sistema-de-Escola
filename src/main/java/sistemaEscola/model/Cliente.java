package sistemaEscola.model;

public class Cliente extends Usuario {
    private int numeroCadastro;

    public Cliente(String nome, int idade, String cpf, int numeroCadastro) {
        super(nome, idade, cpf);
        this.numeroCadastro = numeroCadastro;
    }

    @Override
    public String toString() {
        return "Nome: " + getNome() +
                "\nIdade: " + getIdade() +
                "\nCpf: " + getCpf() +
                "\nNumero de Cadastro: " + numeroCadastro;
    }
}
