package Contribuinte;

public class Taxista extends Contribuinte{
// Um Taxista tem associado o número de passageiros transportados em um ano e é tributado em relação a esse número (R$ 0,5 por passageiro).
    private int numPassageirosAnuais;
    private Rodoviario rodoviario;

    public Taxista(String nome, int numId, int numPassageirosAnuais, float kmPercorridos) {
        super(nome, numId);
        this.rodoviario = new Rodoviario(kmPercorridos);
        this.numPassageirosAnuais = numPassageirosAnuais;
    }

    public int getNumPassageirosAnuais() {
        return numPassageirosAnuais;
    }

    public void setNumPassageirosAnuais(int numPassageirosAnuais) {
        this.numPassageirosAnuais = numPassageirosAnuais;
    }
    public float Tributos(){
        float imposto = 0;
        
        imposto = (float) (numPassageirosAnuais*0.5);

        setImposto(imposto);
        setDesconto(rodoviario.getDesconto());

        if(rodoviario.getDesconto() >= imposto)
            return 0;
        else{
            imposto = imposto - rodoviario.getDesconto();
            return imposto;
        }
    }

    @Override
    public String toString() {
        return "Contribuinte: "+ getNome() + "\nTipo: Taxista\nId: " + getNumId() +
            "\nImpostos: " + getImposto() + "\nDesconto: " + getDesconto() + "\nTotal: "+
            getImpostoFinal(); 
    }
    
}
