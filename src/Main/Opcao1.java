package Main;

import java.util.Scanner;

public class Opcao1 {

    public static Scanner sc = new Scanner(System.in);

    public static int tiposContribuintes(){

        System.out.println("1 - Taxista.");
        System.out.println("2 - Caminhoneiro.");
        System.out.println("3 - Professor.");
        System.out.println("4 - Médico.");
        int escolha = sc.nextInt();
        MeuSistemaDeTributacao.clearBuffer(sc);

        return escolha;
    }

    public static ReceitaFederal escolha1(ReceitaFederal receita){

        System.out.println("Escolha o tipo de contribuinte que você deseja adicionar:");
        
        int value = tiposContribuintes();

        System.out.println("Informe os dados pedidos a seguir:");

        System.out.println("Nome do contribuinte:");
        String nome = sc.nextLine();

        System.out.println("O contribuinte contém bens?");
        String contemBem = sc.nextLine();
        int numBens = 0;

        String[] tipoBem = new String[2];
        float[] precoBem = new float[2];

        if (contemBem.equals("Sim") || contemBem.equals("sim")){
            System.out.println("Quantos bens ele possui?");
            numBens = sc.nextInt();
            MeuSistemaDeTributacao.clearBuffer(sc);

            for (int i = 0; i < numBens; i++){
                System.out.println("Informe o tipo de bem: (Casa ou Carro)");
                tipoBem[i] = sc.nextLine();
                System.out.println("Informe o preco do "+ tipoBem[i]);
                precoBem[i] = sc.nextFloat();
                MeuSistemaDeTributacao.clearBuffer(sc);
            }
        }

        switch(value){
            case 1:
                System.out.println("Quantos passageiros no ano foram transportados?");
                int numPassageirosAnuais = sc.nextInt();
                MeuSistemaDeTributacao.clearBuffer(sc);
                System.out.println("Quantos quilometros no ano foram percorridos?");
                float kmPercorridosTaxistas = sc.nextFloat();
                MeuSistemaDeTributacao.clearBuffer(sc);
                receita.criarTaxista(nome, numPassageirosAnuais, kmPercorridosTaxistas);
                break;
            case 2:
                System.out.println("Quantas toneladas no ano foram transportados?");
                float toneladasTransportadas = sc.nextFloat();
                MeuSistemaDeTributacao.clearBuffer(sc);
                System.out.println("Quantos quilometros no ano foram percorridos?");
                float kmPercorridos = sc.nextFloat();
                MeuSistemaDeTributacao.clearBuffer(sc);
                receita.criarCaminhoneiro(nome, toneladasTransportadas, kmPercorridos);
                break;
            case 3:
                System.out.println("Quantos salarios minimos são pagos?");
                float numSalarios = sc.nextFloat();
                MeuSistemaDeTributacao.clearBuffer(sc);
                System.out.println("Quanto foi o gasto com material didatico no ano?");
                float gastosMaterialDidatico = sc.nextFloat();
                MeuSistemaDeTributacao.clearBuffer(sc);
                receita.criarProfessor(nome, numSalarios, gastosMaterialDidatico);
                break;
            case 4:
                System.out.println("Quantos pacientes foram atendidos no ano?");
                int numPacientes = sc.nextInt();
                MeuSistemaDeTributacao.clearBuffer(sc);
                System.out.println("Quanto foi o gasto com os congressos no ano?");
                float despesasCongresso = sc.nextFloat();
                MeuSistemaDeTributacao.clearBuffer(sc);
                receita.criarProfessor(nome, numPacientes, despesasCongresso);
                break;
            default:
                System.out.println("Tipo de contribuinte inexistente.");
                break;
        }
        if(numBens == 0){
            receita.getContribuintes().get(receita.getContribuintes().size() - 1).setBens(null);
        }
        else if (numBens == 1){
            receita.getContribuintes().get(receita.getContribuintes().size() - 1).addBem(tipoBem[0], precoBem[0]);
        }
        else{
            for (int i = 0; i < tipoBem.length; i++){
                receita.getContribuintes().get(receita.getContribuintes().size() - 1).addBem(tipoBem[i], precoBem[i]);
            }
        }

        return receita;
    }

}
