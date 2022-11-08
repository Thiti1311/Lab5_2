package Main;

import java.util.Scanner;

public class Opcao3 {
    
    public static ReceitaFederal escolha3(ReceitaFederal receita){
        Scanner sc3 = new Scanner(System.in);
        // 3 - Listar os contribuintes em função dos sinais exteriores de riqueza indicando se são excessivos ou não."
        // definido pro classe (taxista tem seu limiar, caminhoneiro o seu e assim por diante)

        System.out.println("Digite o numero Id do contribuinte:");
        int idNumber = sc3.nextInt();
        MeuSistemaDeTributacao.clearBuffer(sc3);

        sc3.close();
        return receita;
    }

}
