import java.util.Scanner;

public class Desafio {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);

        //Dados do Cliente
        String nome = "Lucas Borges de Souza";
        String tipoConta = "Poupança";
        double saldo = 2500;

        System.out.println("*****************************");
        System.out.printf("\nNome do cleinte: %s".formatted(nome));
        System.out.printf("\nTipo de Conta: %s".formatted(tipoConta));
        System.out.printf("\nSaldo em Conta: %.1f".formatted(saldo));
        System.out.println("\n\n*****************************");

        //Menu de opcçoes
        int opcoes = 0;
        String menuOpcoes = """
                
                1-Saldo em Conta
                2-Transferir Valor
                3-Receber Valor
                4-Sair
                
                """;

        while (opcoes != 4) {
            System.out.println(menuOpcoes);
            opcoes = leitura.nextInt();

            if (opcoes == 1){
                System.out.println("O saldo atualizado é de %.2f".formatted(saldo));
            }
            else if ( opcoes == 2){
                System.out.println("Qual valor deseja transferir: ");
                double valor = leitura.nextInt();
                if (valor > saldo){
                    System.out.println("Não há saldo suficiente para tranferência");
                } else {
                    saldo -= valor;
                    System.out.println("O saldo atualizado é de %.2f".formatted(saldo));
                }
            } else if (opcoes == 3) {
                System.out.println("Valor recebido: ");
                double valor = leitura.nextInt();
                saldo += valor;
                System.out.println("O saldo atualizado é de %.2f".formatted(saldo));
            }else if (opcoes !=4){
                System.out.println("Opção Inválida!");
            }

            }
        }
    }

