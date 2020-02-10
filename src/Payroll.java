public class Payroll {


    private void rodarFolhaHoje(String[][] array) {
//        System.out.println();System.out.printf("# Folha de Pagamentos\n\n");

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

//        for (int i = 0; i < qtd_empregados; i++) {
//
//            if (array[i][0] != null) {
//                String nome = array[i][1];
//                String endereco = array[i][2];
//                String tipo = array[i][3];; //1 hourly, 2 salaried, 3 commissioned
//                String salarioHora = array[i][4];
//                Float salarioMes = Float.parseFloat(array[i][5]);
//                String comissao = array[i][6];
//
//                int tipoDeAgenda = Integer.parseInt(array[i][7]); // 1 1x/mes, 2 2x/mes, 4 4x/mes...
//                String metodoPagamento = array[i][8]; // 1 cheque correio, 2 cheque maos, 3 conta bancaria
//
//                String pertenceSindicato = array[i][9];
//                int taxaSindicato = Integer.parseInt(array[i][10]);
//
//                int salarioHoraAcumulado = Integer.parseInt(array[i][11]);
//                int comissoesAcumuladas = Integer.parseInt(array[i][12]);
//                int taxaSindAcumulado = Integer.parseInt(array[i][13]);
//
//                boolean temPagamento = false;
//
//                String formapagamento = "";
//                switch (metodoPagamento) {
//                    case "1":
//                        formapagamento = "Cheque pelos correios para o endereço: " + endereco;
//                        break;
//                    case "2":
//                        formapagamento = "Cheque entregue em mãos";
//                        break;
//                    case "3":
//                        formapagamento = "Depósito em conta bancária";
//                        break;
//                }
//
//                float salarioMensalProporcional = 0;
//                switch (tipo) {
//                    case "2":
//                        salarioMensalProporcional = salarioMes;
//                        break;
//                    case "3":
//                        salarioMensalProporcional = (salarioMes / 2);
//                        break;
//                }
//
//                float saldoLiquido = 0;
//
//                if (tipoDeAgenda == 30) { // horistas -> todo dia
//                    temPagamento = true;
//                    saldoLiquido = salarioHoraAcumulado
//                            - taxaSindicato
//                            - taxaSindAcumulado;
//                }
//
//                if (diasCorridos % 7 == 6 && tipoDeAgenda == 4) { // horistas -> sexta-feira
//                    temPagamento = true;
//                    saldoLiquido = salarioHoraAcumulado
//                            - taxaSindicato
//                            - taxaSindAcumulado;
//                }
//
//                if ((dia_de_hoje == 15 || dia_de_hoje == 30) && tipoDeAgenda == 2) { // mensalistas comissionados -> 2x/mes
//                    temPagamento = true;
//                    saldoLiquido = (salarioMes / 2)
//                            + comissoesAcumuladas
//                            - taxaSindicato
//                            - taxaSindAcumulado;
//                }
//
//                if (dia_de_hoje == 30 && tipoDeAgenda == 1) { // mensalistas -> 1x/mes
//                    temPagamento = true;
//                    saldoLiquido = salarioMes
//                            - taxaSindicato
//                            - taxaSindAcumulado;
//                }

//                if (temPagamento) {
//                    // System.out.printf("---=--- início item %d\n", i);
//                    // System.out.printf("[%s]\n", nome);
//                    // System.out.printf("   [%.2f] Salário mensal proporcional\n", salarioMensalProporcional);
//                    // System.out.printf(" + [%.2f] Horas \n", salarioHoraAcumulado);
//                    // System.out.printf(" + [%.2f] Comissões \n", comissoesAcumuladas);
//                    // System.out.printf(" - [%.2f] Desconto do Sindicato \n", taxaSindicato);
//                    // System.out.printf(" - [%.2f] Taxas do Sindicato \n", taxaSindAcumulado);
//                    // System.out.printf("== [%.2f] Valor Líquido a Receber \n", saldoLiquido);
//                    // System.out.printf("** Pagamento na forma:\n   [%s]\n", formapagamento);
//                    // System.out.printf("---=--- fim item %d\n\n", i);
//                    System.out.printf("---=--- início item %d\n", i);
//                    System.out.printf("[%s]\n", nome);
//                    System.out.printf("   [%.2f] Salário mensal proporcional\n", salarioMensalProporcional);
//                    System.out.printf(" + [%d] Horas \n", salarioHoraAcumulado);
//                    System.out.printf(" + [%d] Comissões \n", comissoesAcumuladas);
//                    System.out.printf(" - [%d] Desconto do Sindicato \n", taxaSindicato);
//                    System.out.printf(" - [%d] Taxas do Sindicato \n", taxaSindAcumulado);
//                    System.out.printf("== [%.2f] Valor Líquido a Receber \n", saldoLiquido);
//                    System.out.printf("** Pagamento na forma:   [%s]\n", formapagamento);
//                    System.out.printf("---=--- fim item %d\n\n", i);
//
//                    array[i][11] = "0";
//                    array[i][12] = "0";
//                    array[i][13] = "0";
//                }
//            }

        }



//        if (dia_de_hoje < 30) {
//            dia_de_hoje++;
//        } else if (dia_de_hoje == 30) {
//            dia_de_hoje = 1;
//            if (mes_de_hoje == 12) {
//                mes_de_hoje = 1;
//                ano_de_hoje++;
//            } else {
//                mes_de_hoje++;
//            }
//        }
//        diasCorridos++;
//        System.out.println();System.out.println();
//    }
}
