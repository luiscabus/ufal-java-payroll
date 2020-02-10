import java.util.Scanner;

public class Lancamento {

//    private void baterPonto(String[][] array) {
//        Scanner scanner = new Scanner(System.in);
//
//        System.out.print("-- Lista de empregados horistas:\n");
//        for (int i = 0; i < qtd_empregados; i++) {
//            if (array[i][0] != null && array[i][3].equals("1")) {
//                System.out.print("--- [ID:"+i+"] --- --- --- --- --- ---\n");
//                System.out.print("Nome do empregado: " + array[i][1] + "\n");
//                System.out.print("--- --- --- --- --- --- --- --- ---\n");
//            }
//        }
//
//        System.out.print("Entre com o id do empregado para inserir o cartão de ponto:\n");
//        int id = scanner.nextInt();
//
//        if (array[id][0] == null || !array[id][3].equals("1")) {
//            System.out.println("O empregado não existe, ou não é horista, mano.");
//        } else {
//            System.out.println("Empregado " + array[id][1] + ".");
//            System.out.print("Entre hora de entrada (Formato 24h):\n");
//            int hora_entrada = scanner.nextInt();
//            System.out.print("Entre hora de saída (Formato 24h):\n");
//            int hora_saida = scanner.nextInt();
//
//            int horas_trabalhadas = hora_saida - hora_entrada;
//            if (horas_trabalhadas <= 8) {
//                array[id][11] = Integer.toString(Integer.parseInt(array[id][11]) + Integer.parseInt(array[id][4]) * horas_trabalhadas);
//            } else {
//                int horas_extras = horas_trabalhadas - 8;
//                horas_trabalhadas = 8;
//                array[id][11] = Integer.toString(Integer.parseInt(array[id][11]) + Integer.parseInt(array[id][4]) * horas_trabalhadas);
//                array[id][11] = Integer.toString(Integer.parseInt(array[id][11]) + Integer.parseInt(array[id][4]) * (int)(horas_extras * 1.5));
//            }
//
//        }
//    }
//
//    private void lancarVenda(String[][] array) {
//        Scanner scanner = new Scanner(System.in);
//
//        System.out.print("-- Lista de empregados comissionados:\n");
//        for (int i = 0; i < qtd_empregados; i++) {
//            if (array[i][0] != null && array[i][3].equals("3")) {
//                System.out.print("--- [ID:"+i+"] --- --- --- --- --- ---\n");
//                System.out.print("Nome do empregado: " + array[i][1] + "\n");
//                System.out.print("--- --- --- --- --- --- --- --- ---\n");
//            }
//        }
//
//        System.out.print("Entre com o id do empregado para lançar a venda:\n");
//        int id = scanner.nextInt();
//
//        if (array[id][0] == null || !array[id][3].equals("3")) {
//            System.out.println("O empregado não existe, ou não é comissionado, mano.");
//        } else {
//            System.out.println("Empregado " + array[id][1] + ".");
//            System.out.print("Entre o valor da venda:\n");
//            int valor_venda = scanner.nextInt();
//
//            array[id][12] = Integer.toString(Integer.parseInt(array[id][12]) + (int)(valor_venda * Integer.parseInt(array[id][6]) / 100));
//
//        }
//    }
//
//    private void lancarTaxas(String[][] array) {
//        Scanner scanner = new Scanner(System.in);
//
//        System.out.print("-- Lista de empregados sindicalizados:\n");
//        for (int i = 0; i < qtd_empregados; i++) {
//            if (array[i][0] != null && array[i][9].equals("1")) {
//                System.out.print("--- [ID:"+i+"] --- --- --- --- --- ---\n");
//                System.out.print("Nome do empregado: " + array[i][1] + "\n");
//                System.out.print("--- --- --- --- --- --- --- --- ---\n");
//            }
//        }
//
//        System.out.print("Entre com o id do empregado para lançar a taxa:\n");
//        int id = scanner.nextInt();
//
//        if (array[id][0] == null || !array[id][3].equals("3")) {
//            System.out.println("O empregado não existe, ou não é sindicalizado, mano.");
//        } else {
//            System.out.println("Empregado " + array[id][1] + ".");
//            System.out.print("Entre o valor da taxa:\n");
//            int valor_taxa = scanner.nextInt();
//
//            array[id][13] = Integer.toString(Integer.parseInt(array[id][13]) + valor_taxa);
//
//        }
//    }
}
