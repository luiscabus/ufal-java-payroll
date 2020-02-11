import java.util.ArrayList;
import java.util.Scanner;

public class Menu {

    int dia_de_hoje = 1;
    int mes_de_hoje = 1;
    int ano_de_hoje = 2018;
    int diasCorridos = 2;

    String diaDaSemana = "";


    public void Menu() {
        int menu = 0;
        System.out.println();System.out.println("----- Start folha de pagamento -----");

        do {

            Scanner scanner_menu = new Scanner(System.in);

            diaDaSemana = returnDiadaSemana(diasCorridos);

            printMenuOptions();

            menu = scanner_menu.nextInt();
            System.out.println("Sua escolha foi: " + menu + "\t");

            if (menu == 1) {
                Empregado empregado = new Empregado();
                empregado = empregado.requestEmployeeInput();
                Main.empregadosArrayList.add(empregado);
            }

            if (menu == 2) {
                Empregado deletar = new Empregado();
                deletar.deleteEmployee();
            }

            if (menu == 3) {
                Lancamento lancamento = new Lancamento();
                lancamento.baterPonto();
            }

            if (menu == 4) {
                Lancamento lancamento = new Lancamento();
                lancamento.lancarVenda();
            }
//
//            if (menu == 5) {
//                lancarTaxas(empregados);
//            }

            if (menu == 6) {
                Empregado editar = new Empregado();
                editar.editEmployee();
            }

//            if (menu == 7) {
//                rodarFolhaHoje(empregados);
//            }
//
//            if (menu == 10) {
//                agendasDePagamento(empregados);
//            }
//
//            if (menu == 11) {
//                criarNovasAgendas(empregados);
//            }

            if (menu == 12) {
                Empregado show = new Empregado();
                show.showAllEmployees();
            }

            if (menu == 13) {
                System.out.print("\033[H\033[2J");
                System.out.flush();
            }

            if (menu == 14) {
                Empregado empregado;
                empregado = new Empregado("Jose da Silva", "Rua da Silva 123", "1", "10", "0", "0", "4", "1", "0", "0", "0", "0", "0");
                empregado.salarioHoraAcumulado = "60" ;
                System.out.print("Empregado José, horista, R$10/h, recebe toda sexta-feira, cheque por correios, sindicato (n) \n");
                System.out.print("Vamos acumular 6h de trabalho, [6 * 10]. \n");
                Main.empregadosArrayList.add(empregado);


                empregado = new Empregado("Tomás Turbando", "Rua da Folia 3","1", "15", "0", "0", "4","2", "0", "0", "0", "0", "0");
                empregado.salarioHoraAcumulado = "120" ;
                empregado.taxaSindAcumulado = "30" ;
                System.out.print("Empregado Tomás, horista, R$15/h, recebe toda sexta-feira, cheque em mãos, sindicato (n) \n");
                System.out.print("Vamos acumular 8h de trabalho, [8 * 15]. E 30 reais de taxas.\n");
                Main.empregadosArrayList.add(empregado);


                empregado = new Empregado("Jacinto Pinto Aquino Rêgo", "Rua da Ortega 299", "2", "", "1600", "0", "1", "3", "1", "37", "0", "0", "0");
                System.out.print("Empregado Jacinto, assalariado, R$1600/m, recebe no fim do mes, na conta bancaria, sindicato (s, R$37/m) \n");
                Main.empregadosArrayList.add(empregado);


                empregado = new Empregado("Oscar Alho", "Rua da Cibôla S/N", "3", "0", "800", "10", "2", "1", "0", "0", "0", "0", "0");
                empregado.comissoesAcumuladas = "30";
                System.out.print("Empregado Oscar, comissionado, R$800/m, 10% comissao, recebe 2x/mes, cheque correio, sindicato (n) \n");
                System.out.print("Vamos lançar uma venda de R$300, [300 * 0,10].\n");
                Main.empregadosArrayList.add(empregado);
            }


        } while (menu != 99);
    }

    private void printMenuOptions() {
        System.out.println();
        System.out.printf("### ---- DIA DE HOJE: %d/%d/%d -- %s ---- ###    ", dia_de_hoje, mes_de_hoje, ano_de_hoje, diaDaSemana);
        System.out.printf("Esta é a gambiarra de uma folha de pagamentos!\n\n");
        System.out.print("O que você deseja fazer?\n");
        System.out.print("1- Adição de empregado\t\t\t");
        System.out.print("2- Remoção de empregado\t\t\t");
        System.out.print("3- Lançar um Cartão de Ponto\n");

        System.out.print("4- Lançar um Resultado Venda\t\t");
        System.out.print("5- Lançar uma taxa de serviço\t\t");
        System.out.print("6- Alterar detalhes de um empregado\n");

        System.out.print("7- Rodar a folha de pagamento para hoje\n");
        System.out.print("8- Undo\t\t");
        System.out.print("9- Redo\n");

        System.out.print("10- Alterar agenda de pagamento\t\t");
        System.out.print("11- Criação de Novas Agendas de Pagamento\t\t");
        System.out.print("12- Listar empregados cadastrados\n");
        System.out.print("13- CLEAR\n");
        System.out.print("14- Incluir dados de exemplo\n");
        System.out.print("99- SAIR:\n");
    }

    private String returnDiadaSemana(int diasCorridos) {
        switch (diasCorridos % 7) {
            case 1:
                return "Domingo";
            case 2:
                return "Segunda-feira";
            case 3:
                return "Terça-feira";
            case 4:
                return "Quarta-feira";
            case 5:
                return "Quinta-feira";
            case 6:
                return "Sexta-feira";
        }
        return "Sábado";
    }
}
