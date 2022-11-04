package Main;

import java.util.ArrayList;

import Contribuinte.*;

public class ReceitaFederal {
    private ArrayList<Contribuinte> contribuintes;
    private int numContribuinte = 0;

    public Taxista criarTaxista(String nome, String tipoBem, float preco, int numPassageirosAnuais, float kmPercorridos){
        Taxista taxi = new Taxista(nome, numContribuinte,tipoBem , preco, numPassageirosAnuais, kmPercorridos);
        contribuintes.add(taxi);
        numContribuinte++;
        return taxi;
    }

    public Caminhoneiro criarCaminhoneiro(String nome, String tipoBem, float preco, int numPassageirosAnuais, float kmPercorridos){
        Caminhoneiro caminhao = new Caminhoneiro(nome, numContribuinte,tipoBem , preco, numPassageirosAnuais, kmPercorridos);
        contribuintes.add(caminhao);
        numContribuinte++;
        return caminhao;
    }
    
}
