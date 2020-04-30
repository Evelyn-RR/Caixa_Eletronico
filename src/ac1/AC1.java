/*
 Nesta atividade você deverá construir um programa na linguagem JAVA tendo como
base o fluxograma demonstrado.
Observações:
- Considere Início com uma tela de boas-vindas ao usuário.
- Considere o CPF como sendo: “123.456.789-00”.
- Considere a Senha como sendo: 01020304.
- Considere o Saldo inicial como sendo: R$1.000,00.
- Considere o seguinte Menu:
  1 – Saldo (deverá exibir o saldo atual)
  2 – Depósito (deverá requisitar o valor do depósito e somar ao saldo atual)
  3 – Saque (deverá requisitar o valor do saque e subtrair o saldo atual)
  0 – Sair
Desafio (não obrigatório):
- Fazer Transferência: deverá solicitar o valor da transferência, a conta, 
agência e o banco (simular valores) e atualizar o saldo.
- Consultar Extrato: deverá exibir o extrato das operações do usuário mostrando 
débitos, créditos e transferências em ordem cronológica.
 */

package ac1;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

/**
 Evelyn Rodrigues
 ADS FAcens <3
 */
public class AC1 {

    //@SuppressWarnings({"UnusedAssignment", "empty-statement"})
    public static void main(String[] args) {

        Scanner ler = new Scanner(System.in);
        List valor = new ArrayList(0);
        List processo = new ArrayList(0);
        
        System.out.println("-----------------");
        System.out.println("Seja Bem Vindo!!!");
        System.out.println("-----------------");
        
        String cpf = "123.456.789-00";
        String cpfDigitado;
   
        System.out.print("Digte seu CPF: ");
        cpfDigitado = ler.next();
        if(cpf.equals (cpfDigitado)){
         System.out.println("CPF Correto");
         System.out.println("Tela de acesso permitido");
         System.out.println("------------------------");
        } else {
         System.out.println("CPF Incorreto");  
         System.out.println("Tela de acesso não permitido");
         System.out.println("-----------------------------");
         System.exit(0);
        }
        
        String senha = "01020304";
        String senhaDigitada;
        double deposito = 0, saldoAtual = 0, saque = 0;
        double saldoInicial = 1000;
        int menu = 0, agencia;
        double valortranf = 0, conta;              
 
        System.out.print("Digte sua senha: ");
        senhaDigitada = ler.next();
        int x = 0;
        
        do{
        if(senha.equals (senhaDigitada)){
         System.out.println("Senha Correta");
         System.out.println("Tela de acesso permitido");
         System.out.println("-----------------------------");
   
         do{
         System.out.println("----- MENU -----");
         System.out.println("--- 1 - Saldo ---");
         System.out.println("--- 2 - Depósito ---");
         System.out.println("--- 3 - Saque ---");
         System.out.println("--- 4 - Transferência ---");
         System.out.println("--- 5 - Consultar Extrato ---");
         System.out.println("--- 0 - Sair ---");
         System.out.println("-------------------");
         
         System.out.print("Escolha um dos números: ");
         menu = ler.nextInt();
         
         switch(menu){
         case 1:           
         saldoAtual = 1000 + deposito - saque - valortranf;
         System.out.println("Seu saldo inical é/era: R$" + saldoInicial);
         System.out.println("Seu saldo atual é de R$" + saldoAtual); 
         valor.add(saldoAtual);  
         processo.add("Saldo Atual  ");
         System.out.print("Deseja fazer mais alguma operação ? (s/n): ");
         String captcha = ler.next();
         if ("s".equals(captcha)){
            int menu1 = menu;
         } else if ("n".equals(captcha)){
          main(args);
         }
         break;
        
         case 2:
         saldoAtual = 1000 + deposito - saque - valortranf;
         System.out.print("Digite o valor que deseja depositar: R$" );
         deposito = ler.nextDouble();
         if (deposito < 0){
         System.out.println("O VALOR DIGITADO R$" + deposito + " É INVÁLIDO!!!");
         }else{
         saldoAtual = saldoAtual  + deposito;
         System.out.println("R$" + deposito + " Depositado com sucesso");
         System.out.println("Seu saldo é de R$" + saldoAtual);
         valor.add(deposito); 
         processo.add("Deposito     ");
         }
         System.out.print("Deseja fazer mais alguma operação ? (s/n): ");
         String captcha1 = ler.next();
         if ("s".equals(captcha1)){
            int menu1 = menu;
         } else if ("n".equals(captcha1)){
          main(args);
         }
         break;
        
         case 3:
         saldoAtual = 1000 + deposito - saque - valortranf;    
         System.out.print("Digite o valor que deseja sacar: R$" );
         saque = ler.nextDouble();
         if (saque < 0){
         System.out.println("O VALOR DIGITADO R$" + saque + " É INVÁLIDO!!!");
         } else if (saque > saldoAtual){
         System.out.println("SALDO INSUFISIENTE!!!" );
         }else{
         saldoAtual = saldoAtual  - saque;
         System.out.println("R$" + saque + " Sacado com sucesso");
         System.out.println("Seu saldo é de R$" + saldoAtual);
         valor.add(saque);  
         processo.add("Saque        ");
         }
         System.out.print("Deseja fazer mais alguma operação ? (s/n): ");
         String captcha2 = ler.next();
         if ("s".equals(captcha2)){
            int menu1 = menu;
         } else if ("n".equals(captcha2)){
          main(args);
         }
         break;
        
         case 4:
         saldoAtual = 1000 + deposito - saque - valortranf;    
         System.out.print("Digite o nome do banco para qual deseja fazer a transfêrencia: "); 
         String banco = ler.next();
         System.out.print("Digite o número da agência do banco para qual deseja fazer a transfêrencia (Digitar apenas números): "); 
         agencia = ler.nextInt();
         System.out.print("Digite o número da conta do usuario para qual deseja fazer a transfêrencia (Digitar apenas números): "); 
         conta = ler.nextDouble();
         System.out.print("Digite o valor a ser tranferido? R$");  
         valortranf = ler.nextDouble();
         if (valortranf < 0){
         System.out.println("O VALOR DIGITADO R$" + valortranf + " É INVÁLIDO!!!");
         } else if (valortranf > saldoAtual){
         System.out.println("SALDO INSUFISIENTE!!!" );
         }else{
         saldoAtual = saldoAtual - valortranf;
         System.out.println("R$" + valortranf + " Tranferido com sucesso");
         System.out.println("Seu saldo é de R$" + saldoAtual);
         valor.add(valortranf);
         processo.add("Tranfêrencia ");
         }
         System.out.print("Deseja fazer mais alguma operação ? (s/n): ");
         String captcha3 = ler.next();
         if ("s".equals(captcha3)){
            int menu1 = menu;
         } else if ("n".equals(captcha3)){
          main(args);
         }
         break;
         
         case 5:
         System.out.println("------ Extrato ------");
         System.out.println("Processo              Valor");
         System.out.println("Saldo inicial         R$1000.0");
         for (int i = 0; i < valor.size(); i++){
         System.out.println(processo.get(i)+ "         R$" + valor.get(i));
         }
         System.out.println("---------------------");
         System.out.print("Deseja fazer mais alguma operação ? (s/n): ");
         String captcha4 = ler.next();
         if ("s".equals(captcha4)){
            int menu1 = menu;
         } else if ("n".equals(captcha4)){
          main(args);
         }
         break;
         
         case 0:
         System.out.println("Você saiu do menu");
         main(args);
         break;
        
         default:
         System.out.println("NÚMERO INVÁLIDO!!!!");
         break;
         }
         } while (menu != 0);
         
        }
         
        if(senha.equals (senhaDigitada)){
        System.out.println("Senha Correta");
        System.out.println("Tela de acesso permitido");
        System.out.println("-----------------------------");
        int menu2 = menu;
        }else {
        System.out.println("Senha Incoreta");
        System.out.println("--------------");
        System.out.print("Digte novamente a sua senha: ");
        senhaDigitada = ler.next();
        } x++;
        } while(x < 3); 
         System.out.println("Você digitou 3 vezes a senha errada!!!");
         System.out.println("Máximo de tentativas");
         System.out.println("Sua conta foi Bloqueada");
         main(args);
    }
} 






