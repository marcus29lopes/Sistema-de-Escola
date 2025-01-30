package sistemaEscola.controller;


import static sistemaEscola.services.IdService.buscarFuncionarioPorId;

public class ProcurarId {

    public static void procurarId(int id) {
        if (id == 0) {
            System.out.println("não existe id de valor 0");
        } else {
            buscarFuncionarioPorId(id);
        }
    }
}

