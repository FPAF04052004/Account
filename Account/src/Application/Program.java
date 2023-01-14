package Application;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import Entities.Account;
import Entities.BusinessAccount;
import Entities.SavingAccount;

public class Program {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		List<Account> list = new ArrayList<>();
		
		System.out.println("Deseja adicionar conta? ");
		char nova = input.next().charAt(0);
		
		while(nova == 'y') {
			System.out.println("Tipo da conta?(B/S) ");
            char tipy = input.next().charAt(0);
            input.nextLine();
            
            System.out.println("Numero da conta ");
            int number = input.nextInt();
            input.nextLine();
            
            System.out.println("Numero do titular ");
            String titular = input.nextLine();
            
            System.out.println("Saldo: ");
            double saldo = input.nextDouble();
            
			if(tipy == 'B') {
				
				System.out.println("Limite de emprestimo: ");
	            double limiteDeEmprestimo = input.nextDouble();
	            BusinessAccount empresarial = new BusinessAccount(number, titular, saldo, limiteDeEmprestimo);
	            
	            list.add(empresarial);
	            
	            System.out.println("Deseja depositar um valor? (y/n)");
	            nova = input.next().charAt(0);
	            
	            if(nova == 'y') {
	            	double valor = input.nextDouble();
	            	empresarial.deposito(valor);
	            }
	            
	            System.out.println("Deseja sacar um valor? (y/n)");
	            nova = input.next().charAt(0);
	            
	            if(nova == 'y') {
	            	double valor = input.nextDouble();
	            	empresarial.saque(valor);
	            }
	            
			}else {
				
				System.out.println("Taxa de juros: ");
	            double taxaDeJuros = input.nextDouble();
	            
	            SavingAccount poupanca = new SavingAccount(number, titular,saldo, taxaDeJuros);
	            list.add(poupanca);
	            
	            
	            System.out.println("Deseja depositar um valor? (y/n)");
	            nova = input.next().charAt(0);
	            
	            if(nova == 'y') {
	            	double valor = input.nextDouble();
	                poupanca.deposito(valor);
	            }
	            
	            System.out.println("Deseja sacar um valor? (y/n)");
	            nova = input.next().charAt(0);
	            
	            if(nova == 'y') {
	            	double valor = input.nextDouble();
	                poupanca.saque(valor);
	            }
	            
			}
			
			System.out.println("Deseja adicionar mais uma conta? ");
			nova = input.next().charAt(0);
			
		}
		
		for(Account emp: list) {
			System.out.println(emp.toString());
		}
		
		input.close();
	}


	}

}
