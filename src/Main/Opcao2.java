package Main;

import java.util.Scanner;

public class Opcao2 {

    public static Scanner sc2 = new Scanner(System.in);

    
    public static ReceitaFederal escolha2(ReceitaFederal receita){

        System.out.println("Digite o numero Id do contribuinte:");
        int idNumber = sc2.nextInt();
        MeuSistemaDeTributacao.clearBuffer(sc2);

        receita.verTributos(idNumber);
        System.out.println("");
       // MeuSistemaDeTributacao.clearBuffer(sc2);
        return receita;
    }

}
