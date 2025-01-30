package sistemaEscola.services;

import sistemaEscola.model.Funcionario;
import sistemaEscola.view.UsuarioInterface;

import static sistemaEscola.DAO.DAO.getFuncionarios;
import static sistemaEscola.DAO.DAO.lerJson;


public class IdService {

    public static void buscarFuncionarioPorId(int id) {
        lerJson();
        for (int i = 0; i < getFuncionarios().size(); i++) {
            Funcionario funcionario = getFuncionarios().get(i);
            if (funcionario.getId() == id) {
                System.out.println(funcionario);
                UsuarioInterface.mostrarMenu();
            }
        }
        funcionarioNaoExiste();
    }

    public static void funcionarioNaoExiste() {
        System.out.println("Funcionario não existe!");
        UsuarioInterface.mostrarMenu();
    }
}


