


import java.util.Scanner;
public class ContaTerminal {





    
    public static void main(String[] args)  {
        int numeroConta;
        String agencia;
        String primeiroNome;
        String segundoNome;
        double saldo;

       
        



        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Digite número de sua conta .");
        numeroConta = scanner.nextInt();
        scanner.nextLine();

        System.out.println("Digite o número sua agência .");
          agencia = scanner.next();  
     
    
        System.out.println("Digite seu primeiro nome .");
        primeiroNome = scanner.next();
        System.out.println("Digite seu segundo nome .");
        segundoNome = scanner.next();
        
       System.out.println("Por favor, digite o saldo da Conta!");
        saldo = scanner.nextDouble();

         System.out.println("Olá " +  primeiroNome + " " +  segundoNome  + 
                           ", obrigado por criar uma conta em nosso banco, sua agência é " + agencia + 
                          ", conta " + numeroConta + 
                          " e seu saldo " + saldo + 
                          " já está disponível para saque");
        scanner.close();

        
    }
}


