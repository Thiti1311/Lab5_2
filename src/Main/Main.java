package Main;

import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {
        int value = Menu();
        switch(value){
            case 1:
                Opcao1.escolha1();
                break;
            case 2:
                break;
            case 3:
                break;
        }
    }
    
    public static int Menu(){
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o número para a opção desejada:");
        System.out.println("1 - Cadastrar contribuintes.");
        System.out.println("2 - Calcular e mostrar impostos e descontos associados a um contribuinte.");
        System.out.println("3 - Listar os contribuintes em função dos sinais exteriores de riqueza indicando se são excessivos ou não.");
        int escolha = sc.nextInt();
        clearBuffer(sc);
        return escolha;
    }

    public static void clearBuffer(Scanner scanner) {
        if (scanner.hasNextLine()) {
            scanner.nextLine();
        }
    }
}
