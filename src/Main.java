//javac -d /projects/ufal-java-payroll/bin/ /projects/ufal-java-payroll/src/*.java
//java Main /projects/ufal-java-payroll/bin/Main.class
//https://www.caelum.com.br/apostila-java-orientacao-objetos/orientacao-a-objetos-basica/#exerccios-orientao-a-objetos

import java.util.*;

public class Main {
    
    int qtd_empregados = 100;
    int qtd_campos_empregado = 14;
    
    String empregados[][] = new String[qtd_empregados][qtd_campos_empregado];

    int dia_de_hoje = 1;
    int mes_de_hoje = 1;
    int ano_de_hoje = 2018;
    int diasCorridos = 2;
    
    
    String index;
    
    private int insertEmployee(String[][] array){
        for (int i = 0; i < qtd_empregados; i++) {
            if (array[i][0] == null) {

                String nome = null;
                String endereco = null;
                String tipo = null; //1 hourly, 2 salaried, 3 commissioned
                String salarioHora = "0";
                String salarioMes = "0";
                String comissao = "0";

                String tipoDeAgenda = null; // 1 1x/mes, 2 2x/mes, 4 4x/mes...
                String metodoPagamento = null; // 1 cheque correio, 2 cheque maos, 3 conta bancaria

                String pertenceSindicato = null;
                String taxaSindicato = "0";

                String salarioHoraAcumulado = "0";
                String comissoesAcumuladas = "0";
                String taxaSindAcumulado = "0";
                
                Scanner scanner = new Scanner(System.in);
                
                System.out.print("Entre com o nome do empregado:\n");
                nome = scanner.nextLine();
               
                System.out.print("Entre com o endereço:\n");
                endereco = scanner.nextLine();
               
                System.out.print("Entre com o tipo do empregado (1 hourly, 2 salaried, 3 comissioned):\n");
                tipo = scanner.nextLine(); //1 hourly, 2 salaried, 3 commissioned
                
                if (tipo.equals("1")) {
                    System.out.print("Entre com o salário hora:\n");
                    salarioHora = scanner.nextLine();
                    tipoDeAgenda = "4";
                }
                
                if (tipo.equals("2")) {
                    System.out.print("Entre com o salário mensal:\n");
                    salarioMes = scanner.nextLine();
                    tipoDeAgenda = "1";
                }
                
                if (tipo.equals("3")) {
                    System.out.print("Entre com o salário parte fixa mensal:\n");
                    salarioMes = scanner.nextLine();
                    System.out.print("Entre com a comissão (%):\n");
                    comissao = scanner.nextLine();
                    tipoDeAgenda = "2";
                }
                
        
                System.out.print("Pertence a sindicato? (0 não, 1 sim):\n");
                pertenceSindicato = scanner.nextLine();
        
                if (pertenceSindicato.equals("1")) {
                    System.out.print("Qual a taxa cobrada pelo sindicato a cada pagamento?\n");
                    taxaSindicato = scanner.nextLine();
                }
        
                System.out.print("Como quer receber seu pagamento? (1 Cheque pelos correios, 2 Cheque em mãos, 3 Depósito na conta):\n");
                metodoPagamento = scanner.nextLine();
        
                System.out.println("Novo empregado incluído: ID: " + i + ", Nome: " + nome + ", Endereço: " + endereco);
            
                // scanner.close();
                
                array[i][0] = Integer.toString(i);
                array[i][1] = nome;
                array[i][2] = endereco;
                array[i][3] = tipo;
                array[i][4] = salarioHora;
                array[i][5] = salarioMes;
                array[i][6] = comissao;
                array[i][7] = tipoDeAgenda;
                array[i][8] = metodoPagamento;
                array[i][9] = pertenceSindicato;
                array[i][10] = taxaSindicato;
                array[i][11] = "0"; //salario-hora acumulado
                array[i][12] = "0"; //comissoes acumuladas
                array[i][13] = "0"; //taxas acumuladas



                // System.out.print("Entre com o salário hora: " + array[i][4] + "\n");
                // System.out.print("Entre com o salário mensal: " + array[i][5] + "\n");
                // System.out.print("Entre com a comissão (%): " + array[i][6] + "\n");
                // System.out.print("Tipo de agenda? (1 1x/mes, 2 2x/mes, 4 4x/mes): " + array[i][7] + "\n");
                
                return i;
            }
        }
        return -1;
    }
    
    private void deleteEmployee(String[][] array){
        
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Entre com o id do empregado para excluir:\n");
        int id = scanner.nextInt();

        if (array[id][0] != null) {
            // scanner.close();
            System.out.println("Empregado excluído: ID: " + array[id][0] + ", Nome: " + array[id][1]);
            for (int j = 0; j < qtd_campos_empregado; j++) {
                array[id][j] = null;
            }
        } else {
            System.out.println("Errouuuuuu");
        }
    }

    private void showAllEmployees(String[][] array) {
        for (int i = 0; i < qtd_empregados; i++) {
            if (array[i][0] != null) {
                System.out.print("--- [ID:"+i+"] --- --- --- --- --- ---\n");
                System.out.print("Nome do empregado: " + array[i][1] + "\n");
                System.out.print("Endereço :" + array[i][2] + "\n");
                System.out.print("Entre com o tipo do empregado (1 hourly, 2 salaried, 3 comissioned): " + array[i][3] + "\n");
                System.out.print("Entre com o salário hora: " + array[i][4] + "\n");
                System.out.print("Entre com o salário mensal: " + array[i][5] + "\n");
                System.out.print("Entre com a comissão (%): " + array[i][6] + "\n");
                System.out.print("Tipo de agenda? (1 1x/mes, 2 2x/mes, 4 4x/mes): " + array[i][7] + "\n");
                System.out.print("Pertence a sindicato? (0 não, 1 sim): " + array[i][9] + "\n");
                System.out.print("Qual a taxa cobrada pelo sindicato a cada pagamento? " + array[i][10] + "\n");
                System.out.print("Como quer receber seu pagamento? (1 Cheque pelos correios, 2 Cheque em mãos, 3 Depósito na conta): " + array[i][8] + "\n");
                System.out.print("Salário-hora acumulado: " + array[i][11] + "\n");
                System.out.print("Comissões acumuladas: " + array[i][12] + "\n");
                System.out.print("Taxas acumuladas: " + array[i][13] + "\n");
                System.out.print("--- --- --- --- --- --- --- --- ---\n");
            }
        }
    }

    private void baterPonto(String[][] array) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("-- Lista de empregados horistas:\n");
        for (int i = 0; i < qtd_empregados; i++) {
            if (array[i][0] != null && array[i][3].equals("1")) {
                System.out.print("--- [ID:"+i+"] --- --- --- --- --- ---\n");
                System.out.print("Nome do empregado: " + array[i][1] + "\n");
                System.out.print("--- --- --- --- --- --- --- --- ---\n");
            }
        }

        System.out.print("Entre com o id do empregado para inserir o cartão de ponto:\n");
        int id = scanner.nextInt();

        if (array[id][0] == null || !array[id][3].equals("1")) {
            System.out.println("O empregado não existe, ou não é horista, mano.");
        } else {
            System.out.println("Empregado " + array[id][1] + ".");
            System.out.print("Entre hora de entrada (Formato 24h):\n");
            int hora_entrada = scanner.nextInt();
            System.out.print("Entre hora de saída (Formato 24h):\n");
            int hora_saida = scanner.nextInt();

            int horas_trabalhadas = hora_saida - hora_entrada;
            if (horas_trabalhadas <= 8) {
                array[id][11] = Integer.toString(Integer.parseInt(array[id][11]) + Integer.parseInt(array[id][4]) * horas_trabalhadas);
            } else {
                int horas_extras = horas_trabalhadas - 8;
                horas_trabalhadas = 8;
                array[id][11] = Integer.toString(Integer.parseInt(array[id][11]) + Integer.parseInt(array[id][4]) * horas_trabalhadas);
                array[id][11] = Integer.toString(Integer.parseInt(array[id][11]) + Integer.parseInt(array[id][4]) * (int)(horas_extras * 1.5));
            }

        }
    }

    private void lancarVenda(String[][] array) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("-- Lista de empregados comissionados:\n");
        for (int i = 0; i < qtd_empregados; i++) {
            if (array[i][0] != null && array[i][3].equals("3")) {
                System.out.print("--- [ID:"+i+"] --- --- --- --- --- ---\n");
                System.out.print("Nome do empregado: " + array[i][1] + "\n");
                System.out.print("--- --- --- --- --- --- --- --- ---\n");
            }
        }

        System.out.print("Entre com o id do empregado para lançar a venda:\n");
        int id = scanner.nextInt();

        if (array[id][0] == null || !array[id][3].equals("3")) {
            System.out.println("O empregado não existe, ou não é comissionado, mano.");
        } else {
            System.out.println("Empregado " + array[id][1] + ".");
            System.out.print("Entre o valor da venda:\n");
            int valor_venda = scanner.nextInt();

            array[id][12] = Integer.toString(Integer.parseInt(array[id][12]) + (int)(valor_venda * Integer.parseInt(array[id][6]) / 100));

        }
    }

    private void lancarTaxas(String[][] array) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("-- Lista de empregados sindicalizados:\n");
        for (int i = 0; i < qtd_empregados; i++) {
            if (array[i][0] != null && array[i][9].equals("1")) {
                System.out.print("--- [ID:"+i+"] --- --- --- --- --- ---\n");
                System.out.print("Nome do empregado: " + array[i][1] + "\n");
                System.out.print("--- --- --- --- --- --- --- --- ---\n");
            }
        }

        System.out.print("Entre com o id do empregado para lançar a taxa:\n");
        int id = scanner.nextInt();

        if (array[id][0] == null || !array[id][3].equals("3")) {
            System.out.println("O empregado não existe, ou não é sindicalizado, mano.");
        } else {
            System.out.println("Empregado " + array[id][1] + ".");
            System.out.print("Entre o valor da taxa:\n");
            int valor_taxa = scanner.nextInt();

            array[id][13] = Integer.toString(Integer.parseInt(array[id][13]) + valor_taxa);

        }
    }

    private void editEmployee(String[][] array){

        Scanner scanner = new Scanner(System.in);

        System.out.print("-- Lista de todos os empregados :\n");
        for (int i = 0; i < qtd_empregados; i++) {
            if (array[i][0] != null) {
                System.out.print("--- [ID:"+i+"] --- --- --- --- --- ---\n");
                System.out.print("Nome do empregado: " + array[i][1] + "\n");
                System.out.print("--- --- --- --- --- --- --- --- ---\n");
            }
        }

        System.out.print("Entre com o id do empregado para editar:\n");
        String entrada = scanner.nextLine();
        int id = Integer.valueOf(entrada);

        if (array[id][0] == null) {
            System.out.println("O empregado não existe, brow.");
        } else {
            System.out.println("Empregado " + array[id][1] + " poderá ser editado:");
            
            String nome = null;
            String endereco = null;
            String tipo; //1 hourly, 2 salaried, 3 commissioned
            String salarioHora = null;
            String salarioMes = null;
            String comissao = null;

            String tipoDeAgenda = null; // 1 1x/mes, 2 2x/mes, 4 4x/mes...
            String metodoPagamento = null; // 1 cheque correio, 2 cheque maos, 3 conta bancaria

            String pertenceSindicato = null;
            String taxaSindicato = null;

            String salarioHoraAcumulado = null;
            String comissoesAcumuladas = null;
            String taxaSindAcumulado = null;
            
            System.out.print("Entre com o nome do empregado:\n");
            nome = scanner.nextLine();
            if (!nome.isEmpty() && nome != null && nome != "\n" && nome != "") {
                array[id][1] = nome;
            }
            
            System.out.print("Entre com o endereço:\n");
            endereco = scanner.nextLine();
            if (!endereco.isEmpty() && endereco != null && endereco != "\n" && endereco != "") {
                array[id][2] = endereco;
            }
            
            System.out.print("Entre com o tipo do empregado (1 hourly, 2 salaried, 3 comissioned):\n");
            tipo = scanner.nextLine(); //1 hourly, 2 salaried, 3 commissioned

            if (!tipo.isEmpty() && tipo != null && tipo != "\n" && tipo != "") {
                array[id][3] = tipo;

                if (tipo.equals("1")) {
                    System.out.print("Entre com o salário hora:\n");
                    salarioHora = scanner.nextLine();
                    if (!salarioHora.isEmpty() && salarioHora != null && salarioHora != "\n" && salarioHora != "") {
                        array[id][4] = salarioHora;
                        tipoDeAgenda = "4";
                    }
                }
                
                if (tipo.equals("2")) {
                    System.out.print("Entre com o salário mensal:\n");
                    salarioMes = scanner.nextLine();
                    if (!salarioMes.isEmpty() && salarioMes != null && salarioMes != "\n" && salarioMes != "") {
                        array[id][5] = salarioMes;
                        tipoDeAgenda = "1";
                    }
                }
                
                if (tipo.equals("3")) {
                    System.out.print("Entre com o salário parte fixa mensal:\n");
                    salarioMes = scanner.nextLine();
                    System.out.print("Entre com a comissão (%):\n");
                    comissao = scanner.nextLine();
                    if (!comissao.isEmpty() && comissao != null && comissao != "\n" && comissao != "" && !salarioMes.isEmpty() && salarioMes != null && salarioMes != "\n" && salarioMes != "") {
                        array[id][5] = salarioMes;
                        array[id][6] = comissao;
                        tipoDeAgenda = "2";
                    }
                }
            }
            
            System.out.print("Pertence a sindicato? (0 não, 1 sim):\n");
            pertenceSindicato = scanner.nextLine();
            if (!pertenceSindicato.isEmpty() && pertenceSindicato != null && pertenceSindicato != "\n" && pertenceSindicato != "") {
                array[id][9] = pertenceSindicato;

                if (pertenceSindicato.equals("1")) {
                    System.out.print("Qual a taxa cobrada pelo sindicato a cada pagamento?\n");
                    taxaSindicato = scanner.nextLine();
                    if (!taxaSindicato.isEmpty() && taxaSindicato != null && taxaSindicato != "\n" && taxaSindicato != "") {
                        array[id][10] = taxaSindicato;
                    }
                }
            }
            
            System.out.print("Como quer receber seu pagamento? (1 Cheque pelos correios, 2 Cheque em mãos, 3 Depósito na conta):\n");
            metodoPagamento = scanner.nextLine();
            if (!metodoPagamento.isEmpty() && metodoPagamento != null && metodoPagamento != "\n" && metodoPagamento != "") {
                array[id][8] = metodoPagamento;
            }
            
            array[id][11] = "0"; //salario-hora acumulado
            array[id][12] = "0"; //comissoes acumuladas
            array[id][13] = "0"; //taxas acumuladas

            System.out.println("Empregado editado: ID: " + id + ", Nome: " + nome + ", Endereço: " + endereco);

        }

    }

    private void rodarFolhaHoje(String[][] array) {
        System.out.println();System.out.printf("# Folha de Pagamentos\n\n");

        // int anome = 1;
        // int aendereco = 2;
        // int atipo = 3;
        // int ashora = 4;
        // int asmensal = 5;
        // int acomissao = 6;
        // int atagenda = 7;
        // int aformapag = 8;
        // int asindicato = 9;
        // int ataxasind = 10;
        // int ashacum = 11;
        // int acomissacum = 12;
        // int ataxasacumm = 13;

        for (int i = 0; i < qtd_empregados; i++) {
            
            if (array[i][0] != null) {
                String nome = array[i][1];
                String endereco = array[i][2];
                String tipo = array[i][3];; //1 hourly, 2 salaried, 3 commissioned
                String salarioHora = array[i][4];
                Float salarioMes = Float.parseFloat(array[i][5]);
                String comissao = array[i][6];

                int tipoDeAgenda = Integer.parseInt(array[i][7]); // 1 1x/mes, 2 2x/mes, 4 4x/mes...
                String metodoPagamento = array[i][8]; // 1 cheque correio, 2 cheque maos, 3 conta bancaria

                String pertenceSindicato = array[i][9];
                int taxaSindicato = Integer.parseInt(array[i][10]);

                int salarioHoraAcumulado = Integer.parseInt(array[i][11]);
                int comissoesAcumuladas = Integer.parseInt(array[i][12]);
                int taxaSindAcumulado = Integer.parseInt(array[i][13]);

                boolean temPagamento = false;

                String formapagamento = "";
                switch (metodoPagamento) {
                    case "1":
                        formapagamento = "Cheque pelos correios para o endereço: " + endereco;
                        break;
                    case "2":
                        formapagamento = "Cheque entregue em mãos";
                        break;
                    case "3":
                        formapagamento = "Depósito em conta bancária";
                        break;
                }

                float salarioMensalProporcional = 0;
                switch (tipo) {
                    case "2":
                        salarioMensalProporcional = salarioMes;
                        break;
                    case "3":
                        salarioMensalProporcional = (salarioMes / 2);
                        break;
                }

                float saldoLiquido = 0;

                if (tipoDeAgenda == 30) { // horistas -> todo dia
                    temPagamento = true;
                    saldoLiquido = salarioHoraAcumulado
                            - taxaSindicato
                            - taxaSindAcumulado;
                }

                if (diasCorridos % 7 == 6 && tipoDeAgenda == 4) { // horistas -> sexta-feira
                    temPagamento = true;
                    saldoLiquido = salarioHoraAcumulado
                            - taxaSindicato
                            - taxaSindAcumulado;
                }

                if ((dia_de_hoje == 15 || dia_de_hoje == 30) && tipoDeAgenda == 2) { // mensalistas comissionados -> 2x/mes
                    temPagamento = true;
                    saldoLiquido = (salarioMes / 2)
                            + comissoesAcumuladas
                            - taxaSindicato
                            - taxaSindAcumulado;
                }

                if (dia_de_hoje == 30 && tipoDeAgenda == 1) { // mensalistas -> 1x/mes
                    temPagamento = true;
                    saldoLiquido = salarioMes
                            - taxaSindicato
                            - taxaSindAcumulado;
                }

                if (temPagamento) {
                    // System.out.printf("---=--- início item %d\n", i);
                    // System.out.printf("[%s]\n", nome);
                    // System.out.printf("   [%.2f] Salário mensal proporcional\n", salarioMensalProporcional);
                    // System.out.printf(" + [%.2f] Horas \n", salarioHoraAcumulado);
                    // System.out.printf(" + [%.2f] Comissões \n", comissoesAcumuladas);
                    // System.out.printf(" - [%.2f] Desconto do Sindicato \n", taxaSindicato);
                    // System.out.printf(" - [%.2f] Taxas do Sindicato \n", taxaSindAcumulado);
                    // System.out.printf("== [%.2f] Valor Líquido a Receber \n", saldoLiquido);
                    // System.out.printf("** Pagamento na forma:\n   [%s]\n", formapagamento);
                    // System.out.printf("---=--- fim item %d\n\n", i);
                    System.out.printf("---=--- início item %d\n", i);
                    System.out.printf("[%s]\n", nome);
                    System.out.printf("   [%.2f] Salário mensal proporcional\n", salarioMensalProporcional);
                    System.out.printf(" + [%d] Horas \n", salarioHoraAcumulado);
                    System.out.printf(" + [%d] Comissões \n", comissoesAcumuladas);
                    System.out.printf(" - [%d] Desconto do Sindicato \n", taxaSindicato);
                    System.out.printf(" - [%d] Taxas do Sindicato \n", taxaSindAcumulado);
                    System.out.printf("== [%.2f] Valor Líquido a Receber \n", saldoLiquido);
                    System.out.printf("** Pagamento na forma:   [%s]\n", formapagamento);
                    System.out.printf("---=--- fim item %d\n\n", i);

                    array[i][11] = "0";
                    array[i][12] = "0";
                    array[i][13] = "0";
                }
            }

        }



        if (dia_de_hoje < 30) {
            dia_de_hoje++;
        } else if (dia_de_hoje == 30) {
            dia_de_hoje = 1;
            if (mes_de_hoje == 12) {
                mes_de_hoje = 1;
                ano_de_hoje++;
            } else {
                mes_de_hoje++;
            }
        }
        diasCorridos++;
        System.out.println();System.out.println();
    }

    private void agendasDePagamento(String[][] array) {

    }

    private void criarNovasAgendas(String[][] array) {

    }




    public static void main(String[] args) {
        System.out.println();System.out.println("----- Start folha de pagamento -----");
        
        Main self = new Main();
        
        String diaDaSemana = "";
        
        int menu = 0;
       
        do {
            

            Scanner scanner_menu = new Scanner(System.in);

            switch (self.diasCorridos % 7) {
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
            System.out.printf("### ---- DIA DE HOJE: %d/%d/%d -- %s ---- ###    ", self.dia_de_hoje, self.mes_de_hoje, self.ano_de_hoje, diaDaSemana);
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
                int novoEmpregado = self.insertEmployee(self.empregados);
                System.out.println(novoEmpregado);
            }

            if (menu == 2) {
                self.deleteEmployee(self.empregados);
            }

            if (menu == 3) {
                self.baterPonto(self.empregados);
            }

            if (menu == 4) {
                self.lancarVenda(self.empregados);
            }

            if (menu == 5) {
                self.lancarTaxas(self.empregados);
            }

            if (menu == 6) {
                self.editEmployee(self.empregados);
            }

            if (menu == 7) {
                self.rodarFolhaHoje(self.empregados);
            }

            if (menu == 9) {
                self.agendasDePagamento(self.empregados);
            }

            if (menu == 10) {
                self.criarNovasAgendas(self.empregados);
            }

            if (menu == 12) {
                self.showAllEmployees(self.empregados);
            }

            if (menu == 14) {
                self.empregados[0][0] = "0";
                self.empregados[0][1] = "Jose da Silva"; // nome
                self.empregados[0][2] = "Rua da Silva 123"; // endereço
                self.empregados[0][3] = "1"; // 1 hourly, 2 salaried, 3 commissioned
                self.empregados[0][4] = "10"; // salário-hora
                self.empregados[0][5] = "0" ; // salário-mês
                self.empregados[0][6] = "0" ; //comissão %
                self.empregados[0][7] = "4" ; // 1 1x/mes, 2 2x/mes, 4 4x/mes...
                self.empregados[0][8] = "1" ; // 1 cheque correio, 2 cheque maos, 3 conta bancaria
                self.empregados[0][9] = "0" ; // 0 percence sindicato, 1 não pertence
                self.empregados[0][10] = "0" ; // taxa sindicato
                self.empregados[0][11] = "0" ; // salário-hora acumulado
                self.empregados[0][12] = "0" ; // comissões acumuladas
                self.empregados[0][13] = "0" ; // taxas acumuladas

                self.empregados[0][11] = "60" ;
                System.out.print("Empregado José, horista, R$10/h, recebe toda sexta-feira, cheque por correios, sindicato (n) \n");
                System.out.print("Vamos acumular 6h de trabalho, [6 * 10]. \n");

                self.empregados[1][0] = "1";
                self.empregados[1][1] = "Tomás Turbando"; // nome
                self.empregados[1][2] = "Rua da Folia 3"; // endereço
                self.empregados[1][3] = "1"; // 1 hourly, 2 salaried, 3 commissioned
                self.empregados[1][4] = "15"; // salário-hora
                self.empregados[1][5] = "0" ; // salário-mês
                self.empregados[1][6] = "0" ; //comissão %
                self.empregados[1][7] = "4" ; // 1 1x/mes, 2 2x/mes, 4 4x/mes...
                self.empregados[1][8] = "2" ; // 1 cheque correio, 2 cheque maos, 3 conta bancaria
                self.empregados[1][9] = "0" ; // 0 percence sindicato, 1 não pertence
                self.empregados[1][10] = "0" ; // taxa sindicato
                self.empregados[1][11] = "0" ; // salário-hora acumulado
                self.empregados[1][12] = "0" ; // comissões acumuladas
                self.empregados[1][13] = "0" ; // taxas acumuladas

                self.empregados[1][11] = "120" ;
                self.empregados[1][13] = "30" ;
                System.out.print("Empregado Tomás, horista, R$15/h, recebe toda sexta-feira, cheque em mãos, sindicato (n) \n");
                System.out.print("Vamos acumular 8h de trabalho, [8 * 15]. E 30 reais de taxas.\n");

                self.empregados[2][0] = "2";
                self.empregados[2][1] = "Jacinto Pinto Aquino Rêgo"; // nome
                self.empregados[2][2] = "Rua da Ortega 299"; // endereço
                self.empregados[2][3] = "2"; // 1 hourly, 2 salaried, 3 commissioned
                self.empregados[2][4] = ""; // salário-hora
                self.empregados[2][5] = "1600" ; // salário-mês
                self.empregados[2][6] = "0" ; //comissão %
                self.empregados[2][7] = "1" ; // 1 1x/mes, 2 2x/mes, 4 4x/mes...
                self.empregados[2][8] = "3" ; // 1 cheque correio, 2 cheque maos, 3 conta bancaria
                self.empregados[2][9] = "1" ; // 0 percence sindicato, 1 não pertence
                self.empregados[2][10] = "37" ; // taxa sindicato
                self.empregados[2][11] = "0" ; // salário-hora acumulado
                self.empregados[2][12] = "0" ; // comissões acumuladas
                self.empregados[2][13] = "0" ; // taxas acumuladas

                System.out.print("Empregado Jacinto, assalariado, R$1600/m, recebe no fim do mes, na conta bancaria, sindicato (s, R$37/m) \n");

                self.empregados[3][0] = "3";
                self.empregados[3][1] = "Oscar Alho"; // nome
                self.empregados[3][2] = "Rua da Cibôla S/N"; // endereço
                self.empregados[3][3] = "3"; // 1 hourly, 2 salaried, 3 commissioned
                self.empregados[3][4] = "0"; // salário-hora
                self.empregados[3][5] = "800" ; // salário-mês
                self.empregados[3][6] = "10" ; //comissão %
                self.empregados[3][7] = "2" ; // 1 1x/mes, 2 2x/mes, 4 4x/mes...
                self.empregados[3][8] = "1" ; // 1 cheque correio, 2 cheque maos, 3 conta bancaria
                self.empregados[3][9] = "0" ; // 0 percence sindicato, 1 não pertence
                self.empregados[3][10] = "0" ; // taxa sindicato
                self.empregados[3][11] = "0" ; // salário-hora acumulado
                self.empregados[3][12] = "0" ; // comissões acumuladas
                self.empregados[3][13] = "0" ; // taxas acumuladas

                self.empregados[3][12] = "30";
                System.out.print("Empregado Oscar, comissionado, R$800/m, 10% comissao, recebe 2x/mes, cheque correio, sindicato (n) \n");
                System.out.print("Vamos lançar uma venda de R$300, [300 * 0,10].\n");
            }

            if (menu == 13) {
                System.out.print("\033[H\033[2J");  
                System.out.flush(); 
            }

            
        } while (menu != 99);

        
    }
}