package sistemaEscola.controller;


import static sistemaEscola.services.IdService.buscarUsuarioPorId;

public class ProcurarId {

    public static void procurarId(int id) {
        if (id == 0) {
            System.out.println("não existe id de valor 0");
        } else {
            buscarUsuarioPorId(id);
        }
    }
}

