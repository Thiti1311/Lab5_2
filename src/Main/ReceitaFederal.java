package Main;

import java.lang.reflect.Array;
import java.util.ArrayList;

import Contribuinte.*;

public class ReceitaFederal {

    public ArrayList<Contribuinte> getContribuintes() {
        return contribuintes;
    }
    public void setMama(ArrayList<Contribuinte> contribuintes) {
        this.contribuintes = contribuintes;
    }

    private ArrayList<Contribuinte> contribuintes = new ArrayList<Contribuinte>();

    private int numContribuinte = 1;

    public ReceitaFederal(){};

// i. Cadastrar contribuintes.

    public Taxista criarTaxista(String nome, int numPassageirosAnuais, float kmPercorridos){
        Taxista taxi = new Taxista(nome, numContribuinte, numPassageirosAnuais, kmPercorridos);
        contribuintes.add(taxi);
        numContribuinte++;
        return taxi;
    }

    public Caminhoneiro criarCaminhoneiro(String nome, float toneladasTransportadas, float kmPercorridos){
        Caminhoneiro caminhao = new Caminhoneiro(nome, numContribuinte, toneladasTransportadas, kmPercorridos);
        contribuintes.add(caminhao);
        numContribuinte++;
        return caminhao;
    }

    public Medico criarMedico(String nome, int numPacientes, float despesasCongresso){
        Medico medico = new Medico(nome, numContribuinte, numPacientes, despesasCongresso);
        contribuintes.add(medico);
        numContribuinte++;
        return medico;
    }

    public Professor criarProfessor(String nome, float numSalarios, float gastosMaterialDidatico){
        Professor professor = new Professor(nome, numContribuinte, numSalarios, gastosMaterialDidatico);
        contribuintes.add(professor);
        numContribuinte++;
        return professor;
    }

// ii. Calcular e mostrar impostos e descontos associados a um contribuinte

    public Contribuinte verTributos(int idContribuinte){
        
        float impostoSemDesconto = contribuintes.get(idContribuinte-1).getImposto();
        float desconto = contribuintes.get(idContribuinte-1).getDesconto();
        float impostoComDesconto = contribuintes.get(idContribuinte-1).getImpostoFinal();
        System.out.printf("O imposto total: R$%.2f\nO desconto dado: R$%.2f\nValor total a ser pago: R$%.2f\n", impostoSemDesconto, desconto, impostoComDesconto);
        return contribuintes.get(idContribuinte-1);
    } 
    
// iii. Listar os contribuintes em função dos sinais exteriores de riqueza indicando se são excessivos ou não.

    public Contribuinte sinaisExterioresDeRiqueza(){

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

        while(i < maior){
            if (taxistas.get(i) == )
            i++;
        }

        return contribuintes.get(idContribuinte-1);
    }

}
