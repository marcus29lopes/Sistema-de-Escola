package dobackaofront.view;

import java.util.Scanner;

import static dobackaofront.view.FuncionarioInterface.menuFuncionario;

public class UsuarioInterface {

    public static void mostrarMenu() {
        Scanner sc = new Scanner(System.in);

        System.out.println("-------Menu-------");
        System.out.println("1- Funcionario\n" +
                "2- Cliente\n" +
                "3- Aluno\n" +
                "Digite o numero da opção que deseja.");

        int opcao = sc.nextInt();
        switch (opcao) {
            case 1:
                menuFuncionario();
                //case 2: menuCliente();
                //case 3: menuAluno();
        }
    }

}


