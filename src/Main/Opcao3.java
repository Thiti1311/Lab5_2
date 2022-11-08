package Main;

import java.util.ArrayList;

import Contribuinte.*;

public class Opcao3 {
    
    public static ReceitaFederal sinaisExterioresDeRiqueza(ReceitaFederal receita){

        ArrayList<Contribuinte> contribuintes = receita.getContribuintes();

        ArrayList<Taxista> taxistas = new ArrayList<Taxista>();
        ArrayList<Caminhoneiro> caminhoneiros = new ArrayList<Caminhoneiro>();
        ArrayList<Professor> professores = new ArrayList<Professor>();
        ArrayList<Medico> medicos = new ArrayList<Medico>();

        Float limiarTaxistas = (float) 0;
        Float limiarCaminhoneiros = (float) 0;
        Float limiarProfessores = (float) 0;
        Float limiarMedicos = (float) 0;


        for (int i = 0; i < contribuintes.size(); i++){
            if (contribuintes.get(i).getClass() == Taxista.class){
                taxistas.add((Taxista) contribuintes.get(i));
                limiarTaxistas += contribuintes.get(i).valorBens();
            }
            else if (contribuintes.get(i).getClass() == Caminhoneiro.class){
                caminhoneiros.add((Caminhoneiro) contribuintes.get(i));
                limiarCaminhoneiros += contribuintes.get(i).valorBens();
            }
            else if (contribuintes.get(i).getClass() == Professor.class){
                professores.add((Professor) contribuintes.get(i));
                limiarProfessores += contribuintes.get(i).valorBens();
            }
            else if (contribuintes.get(i).getClass() == Medico.class){
                medicos.add((Medico) contribuintes.get(i));
                limiarMedicos += contribuintes.get(i).valorBens();
            }
        }

        limiarTaxistas = limiarTaxistas/taxistas.size();
        limiarCaminhoneiros = limiarCaminhoneiros/caminhoneiros.size();
        limiarProfessores = limiarProfessores/professores.size();
        limiarMedicos = limiarMedicos/medicos.size();
        
        int maior = taxistas.size();

        if (maior < caminhoneiros.size())
            maior = caminhoneiros.size();
        if (maior < professores.size())
            maior = professores.size();
        if (maior < medicos.size())
            maior = medicos.size();

        int i = 0;

        ArrayList<Contribuinte> abaixoDolimiar = new ArrayList<Contribuinte>();
        ArrayList<Contribuinte> acimaDoLimiar = new ArrayList<Contribuinte>();

        while(i < maior){
            if (taxistas.get(i) != null ){
                if (taxistas.get(i).valorBens() > limiarTaxistas){
                    acimaDoLimiar.add(taxistas.get(i));

                }else {
                    abaixoDolimiar.add(taxistas.get(i));
                }
            }
            
            if (caminhoneiros.get(i) != null ){
                if (caminhoneiros.get(i).valorBens() > limiarCaminhoneiros){
                    acimaDoLimiar.add(caminhoneiros.get(i));
                }else {
                    abaixoDolimiar.add(caminhoneiros.get(i));
                }
            }

            if (professores.get(i) != null ){
                if (professores.get(i).valorBens() > limiarProfessores){
                    acimaDoLimiar.add(professores.get(i));
                }else {
                    abaixoDolimiar.add(professores.get(i));
                }
            }

            if (medicos.get(i) != null ){
                if (medicos.get(i).valorBens() > limiarMedicos){
                    acimaDoLimiar.add(medicos.get(i));
                }else {
                    abaixoDolimiar.add(medicos.get(i));
                }
            }
            i++;
        }

        System.out.println("Contribuintes acima do limiar exteriores de riqueza:");

        int j = 0;
        System.out.println("\nNumero do Id  |  Nome  |  Valor dos Bens");
        while(j < acimaDoLimiar.size()){
            System.out.printf("%s | ", acimaDoLimiar.get(j).getNumId());
            System.out.printf("%s | ", acimaDoLimiar.get(j).getNome());
            System.out.printf("%.2f\n", acimaDoLimiar.get(j).valorBens());
            j++;
        }

        j = 0;

        System.out.println("Contribuintes abaixo do limiar exteriores de riqueza:");
        System.out.println("\nNumero do Id  |  Nome  |  Valor dos Bens");

        while(j < abaixoDolimiar.size()){
            System.out.printf("%s | ", abaixoDolimiar.get(j).getNumId());
            System.out.printf("%s | ", abaixoDolimiar.get(j).getNome());
            System.out.printf("%.2f\n", abaixoDolimiar.get(j).valorBens());
            j++;
        }

        return receita;
    }


}
