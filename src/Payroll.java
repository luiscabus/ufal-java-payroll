public class Payroll {


    public void rodarFolhaHoje() {
        System.out.println();System.out.printf("# Folha de Pagamentos\n\n");

7        for (int i = 0; i < Main.empregadosArrayList.size(); i++) {

            Empregado empregado = Main.empregadosArrayList.get(i);

            String nome = empregado.nome;
            String endereco = empregado.endereco;
            String tipo = empregado.tipo;; //1 hourly, 2 salaried, 3 commissioned
            String salarioHora = empregado.salarioHora;
            Float salarioMes = Float.parseFloat(empregado.salarioMes);
            String comissao = empregado.comissao;

            int tipoDeAgenda = Integer.parseInt(empregado.tipoDeAgenda); // 1 1x/mes, 2 2x/mes, 4 4x/mes...
            String metodoPagamento = empregado.metodoPagamento; // 1 cheque correio, 2 cheque maos, 3 conta bancaria

            String pertenceSindicato = empregado.pertenceSindicato;
            int taxaSindicato = Integer.parseInt(empregado.taxaSindicato);

            int salarioHoraAcumulado = Integer.parseInt(empregado.salarioHoraAcumulado);
            int comissoesAcumuladas = Integer.parseInt(empregado.comissoesAcumuladas);
            int taxaSindAcumulado = Integer.parseInt(empregado.taxaSindAcumulado);

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

            if (Menu.diasCorridos % 7 == 6 && tipoDeAgenda == 4) { // horistas -> sexta-feira
                temPagamento = true;
                saldoLiquido = salarioHoraAcumulado
                        - taxaSindicato
                        - taxaSindAcumulado;
            }

            if ((Menu.dia_de_hoje == 15 || Menu.dia_de_hoje == 30) && tipoDeAgenda == 2) { // mensalistas comissionados -> 2x/mes
                temPagamento = true;
                saldoLiquido = (salarioMes / 2)
                        + comissoesAcumuladas
                        - taxaSindicato
                        - taxaSindAcumulado;
            }

            if (Menu.dia_de_hoje == 30 && tipoDeAgenda == 1) { // mensalistas -> 1x/mes
                temPagamento = true;
                saldoLiquido = salarioMes
                        - taxaSindicato
                        - taxaSindAcumulado;
            }

            if (temPagamento) {
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

                empregado.salarioHoraAcumulado = "0";
                empregado.comissoesAcumuladas = "0";
                empregado.taxaSindAcumulado = "0";
            }

        }




        System.out.println();System.out.println();
    }
}
