package sistemaEscola.services;

import java.util.Scanner;

public class validacaoId {

    public static void validadorId() {
        try{
            Scanner id = new Scanner(System.in);
            id.nextInt();
        } catch (Exception e) {
            System.out.println("invalido");
        }

    }
}
