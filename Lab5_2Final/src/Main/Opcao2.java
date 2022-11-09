package Main;

import java.util.Scanner;

import Contribuintes.Contribuinte;

public class Opcao2 {

    public static Scanner sc2 = new Scanner(System.in);

    
    public static Contribuinte escolha2(ReceitaFederal receita){

        System.out.println("Digite o numero Id do contribuinte:");
        int idNumber = sc2.nextInt();
        MeuSistemaDeTributacao.clearBuffer(sc2);

        System.out.println(receita.getContribuintes().get(idNumber-1));

        return receita.getContribuintes().get(idNumber-1);
    }

    public static Contribuinte escolha2(ReceitaFederal receita, int id) {
    	return receita.getContribuintes().get(id-1);
    }
}
