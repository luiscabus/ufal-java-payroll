import java.util.Scanner;

public class Empregado {

    String nome;
    String endereco;
    String tipo; //1 hourly, 2 salaried, 3 commissioned
    String salarioHora;
    String salarioMes;
    String comissao;

    String tipoDeAgenda; // 1 1x/mes, 2 2x/mes, 4 4x/mes...
    String metodoPagamento; // 1 cheque correio, 2 cheque maos, 3 conta bancaria

    String pertenceSindicato;
    String taxaSindicato;

    String salarioHoraAcumulado;
    String comissoesAcumuladas;
    String taxaSindAcumulado;


    public Empregado() {
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
    }



    public Empregado requestEmployeeInput(){

        Empregado novo_empregado = new Empregado();

        Scanner scanner = new Scanner(System.in);

        System.out.print("Entre com o nome do empregado:\n");
        novo_empregado.nome = scanner.nextLine();

        System.out.print("Entre com o endereço:\n");
        novo_empregado.endereco = scanner.nextLine();

        System.out.print("Entre com o tipo do empregado (1 hourly, 2 salaried, 3 comissioned):\n");
        novo_empregado.tipo = scanner.nextLine(); //1 hourly, 2 salaried, 3 commissioned

        if (novo_empregado.tipo.equals("1")) {
            System.out.print("Entre com o salário hora:\n");
            novo_empregado.salarioHora = scanner.nextLine();
            novo_empregado.tipoDeAgenda = "4";
        }

        if (novo_empregado.tipo.equals("2")) {
            System.out.print("Entre com o salário mensal:\n");
            novo_empregado.salarioMes = scanner.nextLine();
            novo_empregado.tipoDeAgenda = "1";
        }

        if (novo_empregado.tipo.equals("3")) {
            System.out.print("Entre com o salário parte fixa mensal:\n");
            novo_empregado.salarioMes = scanner.nextLine();
            System.out.print("Entre com a comissão (%):\n");
            novo_empregado.comissao = scanner.nextLine();
            novo_empregado.tipoDeAgenda = "2";
        }


        System.out.print("Pertence a sindicato? (0 não, 1 sim):\n");
        novo_empregado.pertenceSindicato = scanner.nextLine();

        if (novo_empregado.pertenceSindicato.equals("1")) {
            System.out.print("Qual a taxa cobrada pelo sindicato a cada pagamento?\n");
            novo_empregado.taxaSindicato = scanner.nextLine();
        }

        System.out.print("Como quer receber seu pagamento? (1 Cheque pelos correios, 2 Cheque em mãos, 3 Depósito na conta):\n");
        novo_empregado.metodoPagamento = scanner.nextLine();

        System.out.println("Novo empregado incluído: Nome: " + novo_empregado.nome + ", Endereço: " + novo_empregado.endereco);

        return novo_empregado;
    }



    public void deleteEmployee(){

        Scanner scanner = new Scanner(System.in);

        showAllEmployees();

        System.out.print("Entre com o id do empregado para excluir:\n");
        int id = scanner.nextInt();

        Main.empregadosArrayList.remove(id);

    }


    public void editEmployee(){

        Scanner scanner = new Scanner(System.in);

        showAllEmployees();

        System.out.print("Entre com o id do empregado para editar:\n");
        String entrada = scanner.nextLine();
        int id = Integer.valueOf(entrada);

        if (Main.empregadosArrayList.size() < 1) {
            System.out.println("O empregado não existe, brow.");
        } else {

            Empregado empregado = Main.empregadosArrayList.get(id);

            System.out.println("Empregado " + empregado.nome + " pode ser editado:");

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
                empregado.nome = nome;
            }

            System.out.print("Entre com o endereço:\n");
            endereco = scanner.nextLine();
            if (!endereco.isEmpty() && endereco != null && endereco != "\n" && endereco != "") {
                empregado.endereco = endereco;
            }

            System.out.print("Entre com o tipo do empregado (1 hourly, 2 salaried, 3 comissioned):\n");
            tipo = scanner.nextLine(); //1 hourly, 2 salaried, 3 commissioned

            if (!tipo.isEmpty() && tipo != null && tipo != "\n" && tipo != "") {
                empregado.tipo = tipo;

                if (tipo.equals("1")) {
                    System.out.print("Entre com o salário hora:\n");
                    salarioHora = scanner.nextLine();
                    if (!salarioHora.isEmpty() && salarioHora != null && salarioHora != "\n" && salarioHora != "") {
                        empregado.salarioHora = salarioHora;
                        tipoDeAgenda = "4";
                    }
                }

                if (tipo.equals("2")) {
                    System.out.print("Entre com o salário mensal:\n");
                    salarioMes = scanner.nextLine();
                    if (!salarioMes.isEmpty() && salarioMes != null && salarioMes != "\n" && salarioMes != "") {
                        empregado.salarioMes = salarioMes;
                        tipoDeAgenda = "1";
                    }
                }

                if (tipo.equals("3")) {
                    System.out.print("Entre com o salário parte fixa mensal:\n");
                    salarioMes = scanner.nextLine();
                    System.out.print("Entre com a comissão (%):\n");
                    comissao = scanner.nextLine();
                    if (!comissao.isEmpty() && comissao != null && comissao != "\n" && comissao != "" && !salarioMes.isEmpty() && salarioMes != null && salarioMes != "\n" && salarioMes != "") {
                        empregado.salarioMes = salarioMes;
                        empregado.comissao = comissao;
                        tipoDeAgenda = "2";
                    }
                }
            }

            System.out.print("Pertence a sindicato? (0 não, 1 sim):\n");
            pertenceSindicato = scanner.nextLine();
            if (!pertenceSindicato.isEmpty() && pertenceSindicato != null && pertenceSindicato != "\n" && pertenceSindicato != "") {
                empregado.pertenceSindicato = pertenceSindicato;

                if (pertenceSindicato.equals("1")) {
                    System.out.print("Qual a taxa cobrada pelo sindicato a cada pagamento?\n");
                    taxaSindicato = scanner.nextLine();
                    if (!taxaSindicato.isEmpty() && taxaSindicato != null && taxaSindicato != "\n" && taxaSindicato != "") {
                        empregado.taxaSindicato = taxaSindicato;
                    }
                }
            }

            System.out.print("Como quer receber seu pagamento? (1 Cheque pelos correios, 2 Cheque em mãos, 3 Depósito na conta):\n");
            metodoPagamento = scanner.nextLine();
            if (!metodoPagamento.isEmpty() && metodoPagamento != null && metodoPagamento != "\n" && metodoPagamento != "") {
                empregado.metodoPagamento = metodoPagamento;
            }

            empregado.salarioHoraAcumulado = "0"; //salario-hora acumulado
            empregado.comissoesAcumuladas = "0"; //comissoes acumuladas
            empregado.taxaSindAcumulado = "0"; //taxas acumuladas

            System.out.println("Empregado editado: ID: " + id + ", Nome: " + nome + ", Endereço: " + endereco);

        }

    }



    public void showAllEmployees() {
        for (int i = 0; i < Main.empregadosArrayList.size(); i++) {

            Empregado empregado = Main.empregadosArrayList.get(i);

            System.out.print("--- [ID:"+i+"] --- --- --- --- --- ---\n");
            System.out.print("Nome do empregado: " + empregado.nome + "\n");
            System.out.print("Endereço :" + empregado.endereco + "\n");
            System.out.print("Entre com o tipo do empregado (1 hourly, 2 salaried, 3 comissioned): " + empregado.tipo + "\n");
            System.out.print("Entre com o salário hora: " + empregado.salarioHora + "\n");
            System.out.print("Entre com o salário mensal: " + empregado.salarioMes + "\n");
            System.out.print("Entre com a comissão (%): " + empregado.comissao + "\n");
            System.out.print("Tipo de agenda? (1 1x/mes, 2 2x/mes, 4 4x/mes): " + empregado.tipoDeAgenda + "\n");
            System.out.print("Pertence a sindicato? (0 não, 1 sim): " + empregado.pertenceSindicato + "\n");
            System.out.print("Qual a taxa cobrada pelo sindicato a cada pagamento? " + empregado.taxaSindicato + "\n");
            System.out.print("Como quer receber seu pagamento? (1 Cheque pelos correios, 2 Cheque em mãos, 3 Depósito na conta): " + empregado.metodoPagamento + "\n");
            System.out.print("Salário-hora acumulado: " + empregado.salarioHoraAcumulado + "\n");
            System.out.print("Comissões acumuladas: " + empregado.comissoesAcumuladas + "\n");
            System.out.print("Taxas acumuladas: " + empregado.taxaSindAcumulado + "\n");
            System.out.print("--- --- --- --- --- --- --- --- ---\n");
        }
    }
}