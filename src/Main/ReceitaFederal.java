package Main;

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

    
}
