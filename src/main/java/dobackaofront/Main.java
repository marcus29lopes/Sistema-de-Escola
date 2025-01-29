package dobackaofront;

import dobackaofront.model.Cliente;
import dobackaofront.model.Usuario;

public class Main {
    public static void main(String[] args) {
        Usuario pessoa = new Cliente("marcus", 12, "234", 123);
        System.out.println(pessoa);

    }
}