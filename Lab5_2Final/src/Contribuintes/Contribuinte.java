package Contribuintes;

import java.util.ArrayList;

import Bens.Bem;

public class Contribuinte{

    private Tributos tributo = new Tributos();

    private String nome;
    private int numId;
    private String tipoContribuinte;
    private ArrayList<Bem> bens = new ArrayList<Bem>();

    public String getTipoContribuinte() {
        return tipoContribuinte;
    }

    public void setTipoContribuinte(String tipoContribuinte) {
        this.tipoContribuinte = tipoContribuinte;
    }

    public Contribuinte(String nome, int numId) {
        this.nome = nome;
        this.numId = numId;
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

    public float getImposto() {
        return tributo.getImposto();
    }

    public void setImposto(float imposto) {
        this.tributo.setImposto(imposto);
    }

    public float getDesconto() {
        return tributo.getDesconto();
    }

    public void setDesconto(float desconto) {
        this.tributo.setDesconto(desconto);
    }

    public float getImpostoFinal() {
        return tributo.getImpostoFinal();
    }

    public void setImpostoFinal(float ImpostoFinal) {
        this.tributo.setImpostoFinal(ImpostoFinal);
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