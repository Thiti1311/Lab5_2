package Contribuinte;

import java.util.ArrayList;

import Bens.Bem;

public class Contribuinte{

    private Bem bem;
    private String nome;
    private int numId;

    private ArrayList<Bem> bens;

    Contribuinte(String nome, int numId, String tipoBem, float preco) {
        this.nome = nome;
        this.numId = numId;
        if (tipoBem.equals("N/D") == true)
            this.bem = null;
        else{
            this.bem = new Bem(tipoBem, preco);
            bens.add(bem);        
        }
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getNumId() {
        return numId;
    }

    public void setNumId(int numId) {
        this.numId = numId;
    }

    public ArrayList<Bem> getBens() {
        return bens;
    }

    public void setBens(ArrayList<Bem> bens) {
        this.bens = bens;
    }

    public Bem addBem(String tipo, float preco){
        Bem objeto = new Bem(tipo, preco);
        bens.add(objeto);
        return objeto;
    }
    public float valorBens(){
        float valorTotal = 0;
        if(bens.size() != 0){
            for(int i = 0; i < bens.size(); i++){
                valorTotal += bens.get(i).getPreco();
            }
        }
        return valorTotal;
    }
}
