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

            switch (diasCorridos % 7) {
                case 1:
                    diaDaSemana = "Domingo";
                    break;
                case 2:
                    diaDaSemana = "Segunda-feira";
                    break;
                case 3:
                    diaDaSemana = "Terça-feira";
                    break;
                case 4:
                    diaDaSemana = "Quarta-feira";
                    break;
                case 5:
                    diaDaSemana = "Quinta-feira";
                    break;
                case 6:
                    diaDaSemana = "Sexta-feira";
                    break;
                case 0:
                    diaDaSemana = "Sábado";
                    break;
            }

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

//            if (menu == 3) {
//                baterPonto(empregados);
//            }
//
//            if (menu == 4) {
//                lancarVenda(empregados);
//            }
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
                empregado = new Empregado();
                empregado.nome = "Jose da Silva"; // nome
                empregado.endereco = "Rua da Silva 123"; // endereço
                empregado.tipo = "1"; // 1 hourly, 2 salaried, 3 commissioned
                empregado.salarioHora = "10"; // salário-hora
                empregado.salarioMes = "0" ; // salário-mês
                empregado.comissao = "0" ; //comissão %
                empregado.tipoDeAgenda = "4" ; // 1 1x/mes, 2 2x/mes, 4 4x/mes...
                empregado.metodoPagamento = "1" ; // 1 cheque correio, 2 cheque maos, 3 conta bancaria
                empregado.pertenceSindicato = "0" ; // 0 percence sindicato, 1 não pertence
                empregado.taxaSindicato = "0" ; // taxa sindicato
                empregado.salarioHoraAcumulado = "0" ; // salário-hora acumulado
                empregado.comissoesAcumuladas = "0" ; // comissões acumuladas
                empregado.taxaSindAcumulado = "0" ; // taxas acumuladas

                empregado.salarioHoraAcumulado = "60" ;
                System.out.print("Empregado José, horista, R$10/h, recebe toda sexta-feira, cheque por correios, sindicato (n) \n");
                System.out.print("Vamos acumular 6h de trabalho, [6 * 10]. \n");
                Main.empregadosArrayList.add(empregado);


                empregado = new Empregado();
                empregado.nome = "Tomás Turbando"; // nome
                empregado.endereco = "Rua da Folia 3"; // endereço
                empregado.tipo = "1"; // 1 hourly, 2 salaried, 3 commissioned
                empregado.salarioHora = "15"; // salário-hora
                empregado.salarioMes = "0" ; // salário-mês
                empregado.comissao = "0" ; //comissão %
                empregado.tipoDeAgenda = "4" ; // 1 1x/mes, 2 2x/mes, 4 4x/mes...
                empregado.metodoPagamento = "2" ; // 1 cheque correio, 2 cheque maos, 3 conta bancaria
                empregado.pertenceSindicato = "0" ; // 0 percence sindicato, 1 não pertence
                empregado.taxaSindicato = "0" ; // taxa sindicato
                empregado.salarioHoraAcumulado = "0" ; // salário-hora acumulado
                empregado.comissoesAcumuladas = "0" ; // comissões acumuladas
                empregado.taxaSindAcumulado = "0" ; // taxas acumuladas

                empregado.salarioHoraAcumulado = "120" ;
                empregado.taxaSindAcumulado = "30" ;
                System.out.print("Empregado Tomás, horista, R$15/h, recebe toda sexta-feira, cheque em mãos, sindicato (n) \n");
                System.out.print("Vamos acumular 8h de trabalho, [8 * 15]. E 30 reais de taxas.\n");
                Main.empregadosArrayList.add(empregado);


                empregado = new Empregado();
                empregado.nome = "Jacinto Pinto Aquino Rêgo"; // nome
                empregado.endereco = "Rua da Ortega 299"; // endereço
                empregado.tipo = "2"; // 1 hourly, 2 salaried, 3 commissioned
                empregado.salarioHora = ""; // salário-hora
                empregado.salarioMes = "1600" ; // salário-mês
                empregado.comissao = "0" ; //comissão %
                empregado.tipoDeAgenda = "1" ; // 1 1x/mes, 2 2x/mes, 4 4x/mes..
                empregado.metodoPagamento = "3" ; // 1 cheque correio, 2 cheque maos, 3 conta bancaria
                empregado.pertenceSindicato = "1" ; // 0 percence sindicato, 1 não pertence
                empregado.taxaSindicato = "37" ; // taxa sindicato
                empregado.salarioHoraAcumulado = "0" ; // salário-hora acumulado
                empregado.comissoesAcumuladas = "0" ; // comissões acumuladas
                empregado.taxaSindAcumulado = "0" ; // taxas acumuladas
                System.out.print("Empregado Jacinto, assalariado, R$1600/m, recebe no fim do mes, na conta bancaria, sindicato (s, R$37/m) \n");
                Main.empregadosArrayList.add(empregado);


                empregado = new Empregado();
                empregado.nome = "Oscar Alho"; // nome
                empregado.endereco = "Rua da Cibôla S/N"; // endereço
                empregado.tipo = "3"; // 1 hourly, 2 salaried, 3 commissioned
                empregado.salarioHora = "0"; // salário-hora
                empregado.salarioMes = "800" ; // salário-mês
                empregado.comissao = "10" ; //comissão %
                empregado.tipoDeAgenda = "2" ; // 1 1x/mes, 2 2x/mes, 4 4x/mes..
                empregado.metodoPagamento = "1" ; // 1 cheque correio, 2 cheque maos, 3 conta bancaria
                empregado.pertenceSindicato = "0" ; // 0 percence sindicato, 1 não pertence
                empregado.taxaSindicato = "0" ; // taxa sindicato
                empregado.salarioHoraAcumulado = "0" ; // salário-hora acumulado
                empregado.comissoesAcumuladas = "0" ; // comissões acumuladas
                empregado.taxaSindAcumulado = "0" ; // taxas acumuladas

                empregado.comissoesAcumuladas = "30";
                System.out.print("Empregado Oscar, comissionado, R$800/m, 10% comissao, recebe 2x/mes, cheque correio, sindicato (n) \n");
                System.out.print("Vamos lançar uma venda de R$300, [300 * 0,10].\n");
                Main.empregadosArrayList.add(empregado);
            }


        } while (menu != 99);
    }
}
