package sistemaEscola.view;

import java.util.Scanner;

import static sistemaEscola.controller.ProcurarId.procurarId;

public class FuncionarioInterface {
    static Scanner sc = new Scanner(System.in);

    static void menuFuncionario() {

        System.out.println("-------MenuFuncionario-------");
        System.out.println("1- Cadastrar novo funcionario\n" +
                "2- Informações sobre funcionario\n" +
                "3- Remover funcionario\n" +
                "4- Voltar");

        int opcao = sc.nextInt();
        switch (opcao) {
            case 1:
                break;
            case 2:
                System.out.println("Digite o ID do funcionario que deseja verificar: ");
                verificarId();


        }
    }

    static void verificarId() {
        try {
            int id = sc.nextInt();
            procurarId(id);

        } catch (Exception e) {
            System.out.println("Não é um numero");
            e.printStackTrace();

        }
    }
}