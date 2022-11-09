package Main;

import java.util.ArrayList;

import Contribuintes.*;
import Contribuintes.Professor;

public class ReceitaFederal {

    public ArrayList<Contribuinte> getContribuintes() {
        return contribuintes;
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

    public static void mostrarContribuintes(ReceitaFederal receita){
        int i = 0;
        while( i < receita.getContribuintes().size()){
            System.out.println(receita.getContribuintes().get(i).getNome() + " | " + receita.getContribuintes().get(i).getTipoContribuinte());
            i++;
        }
    }
}