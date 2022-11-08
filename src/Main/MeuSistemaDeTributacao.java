package Main;

import java.util.Scanner;

import Contribuinte.*;

public class MeuSistemaDeTributacao {
    
    public static void main(String[] args) {

        ReceitaFederal receita = new ReceitaFederal();

        /*Contribuintes base implementados */
        Taxista taxi = receita.criarTaxista("Thiago", 5000, 140000);
        Caminhoneiro caminhao = receita.criarCaminhoneiro("Misael", 900, 1250000);
        Professor professor = receita.criarProfessor("Sabrina", 6, 100000);
        Medico medico = receita.criarMedico("Renan", 8000, 60000);

        taxi.addBem("Casa", 100000);
        taxi.addBem("Carro", 40000);

        caminhao.addBem("Casa", 1000000);

        professor.addBem("Casa", 150000);
        professor.addBem("Carro", 600000);

        medico.addBem("Casa", 500000);

        boolean continuar = true;
        int value = 0;
        do{
            value = Menu();
            switch(value){
                case 0:
                    continuar = false;
                    break;
                case 1:
                    receita = Opcao1.escolha1(receita);
                    break;
                case 2:
                    receita = Opcao2.escolha2(receita);
                    break;
                case 3:
                    receita = Opcao3.escolha3(receita);
                    break;
            }
        }while(continuar == true);
    }
    
    public static int Menu(){
        Scanner sc = new Scanner(System.in);

        int escolha = 0;

        System.out.println("Digite o número para a opção desejada:");
        System.out.println("1 - Cadastrar contribuintes.");
        System.out.println("2 - Calcular e mostrar impostos e descontos associados a um contribuinte.");
        System.out.println("3 - Listar os contribuintes em função dos sinais exteriores de riqueza indicando se são excessivos ou não.");
        System.out.println("0 - Sair.");
        escolha = sc.nextInt();
        clearBuffer(sc);

        return escolha;
    }

    public static void clearBuffer(Scanner scanner) {
        if (scanner.hasNextLine()) {
            scanner.nextLine();
        }
    }
}
