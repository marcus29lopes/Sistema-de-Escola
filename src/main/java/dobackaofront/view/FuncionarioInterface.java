package dobackaofront.view;

import java.util.Scanner;

public class FuncionarioInterface {

    static void menuFuncionario() {
        Scanner sc = new Scanner(System.in);

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
                System.out.println("Digite o ID do funcionar que deseja verificar: ");
                int id = sc.nextInt();
        }
    }
}