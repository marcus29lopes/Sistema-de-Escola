package sistemaEscola.DAO;

import sistemaEscola.model.Funcionario;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;

public class DAO {

    private static List<Funcionario> funcionarios = new ArrayList<>();

    public static void lerJson() {
        String path = "funcionarios.json";
        List<String> jsonLines = new ArrayList<>();
        try (BufferedReader br = new BufferedReader(new FileReader(path))) {
            String line = br.readLine();
            while (line != null) {
                jsonLines.add(line.trim());
                line = br.readLine();
            }

        } catch (Exception e) {
            System.out.println("Arquivo não encontrado!!!");
        }
        extrairValores(jsonLines);
    }

    private static void extrairValores(List<String> jsonLines) {
        List<String> funcionarios = null;
        String[] dados = new String[5];

        int i = 0;
        for (String line : jsonLines) {

            if (line.startsWith("{") || line.startsWith("}") || line.startsWith("[") || line.startsWith("]")) {
                continue;
            }

            int colonIndex = line.indexOf(":");
            if (colonIndex != -1) {
                String value = line.substring(colonIndex + 1).trim(); //pega apos o :
                if (value.endsWith(",")) {
                    value = value.substring(0, value.length() - 1);
                }
                //remove aspas
                if (value.startsWith("\"") && value.endsWith("\"")) {
                    value = value.substring(1, value.length() - 1);
                }

                if (value.startsWith("Vendedor") || value.startsWith("Professor")) {
                    dados[i] = value;
                    transformarEmObjeto(dados);
                    i = 0;
                    continue;

                }
                dados[i] = value;
                i++;

            }
        }
    }

    static private void transformarEmObjeto(String[] dados) {
        Funcionario funcionario;
        for (int i = 0; i < dados.length; i++) {
            String nome = dados[0];
            int idade = Integer.parseInt(dados[1]);
            String cpf = dados[2];
            int id = Integer.parseInt(dados[3]);
            String cargo = dados[4];
            funcionario = new Funcionario(nome, idade, cpf, id, cargo);
            funcionarios.add(funcionario);
        }
    }

    public static List<Funcionario> getFuncionarios() {
        return funcionarios;
    }
}
