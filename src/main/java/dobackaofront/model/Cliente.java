package dobackaofront.model;

public class Cliente extends Usuario {
    int numeroCadastro;

    public Cliente(String nome, int idade, String cpf, int numeroCadastro) {
        super(nome, idade, cpf);
        this.numeroCadastro = numeroCadastro;
    }

    @Override
    public String toString() {
        return "Nome: " + nome +
                "\nIdade: " + idade +
                "\nCpf: " + cpf +
                "\nNumero de Cadastro: " + numeroCadastro;
    }
}
