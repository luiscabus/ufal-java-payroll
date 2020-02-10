import java.util.Scanner;

public class Agenda {

    private void agendasDePagamento(String[][] array) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("-- Lista de todos os empregados :\n");
        for (int i = 0; i < Main.empregadosArrayList.size(); i++) {
            if (array[i][0] != null) {
                System.out.print("--- [ID:"+i+"] --- --- --- --- --- ---\n");
                System.out.print("Nome do empregado: " + array[i][1] + "\n");
                System.out.print("--- --- --- --- --- --- --- --- ---\n");
            }
        }

        System.out.print("Entre com o id do empregado para editar sua agenda:\n");
        String entrada = scanner.nextLine();
        int id = Integer.valueOf(entrada);

        if (array[id][0] == null) {
            System.out.println("O empregado não existe, brow.");
        } else {
            System.out.println("Empregado " + array[id][1] + " poderá ser editado:");

            String tipoDeAgenda = null; // 1 1x/mes, 2 2x/mes, 4 4x/mes...

            System.out.print("Entre com o tipo de agenda de recebimento que deseja: (1 =1x/mes, 2 =2x/mes, 4 =4x/mes)\n");
            tipoDeAgenda = scanner.nextLine();
            if (!tipoDeAgenda.isEmpty() && tipoDeAgenda != null && tipoDeAgenda != "\n" && tipoDeAgenda != "") {
                array[id][7] = tipoDeAgenda;
            }

            System.out.println("Empregado editado: ID: " + id + ", Nome: " + array[id][1]);

        }
    }

    private void criarNovasAgendas(String[][] array) {

    }
}
