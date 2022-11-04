package Contribuinte;

public class Taxista extends Contribuinte{
// Um Taxista tem associado o número de passageiros transportados em um ano e é tributado em relação a esse número (R$ 0,5 por passageiro).
    private int numPassageirosAnuais;
    private Rodoviario rodoviario;

    public Taxista(String nome, int numId, String tipoBem, float preco, int numPassageirosAnuais, float kmPercorridos) {
        super(nome, numId, tipoBem, preco);
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

        if(rodoviario.getDesconto() >= imposto)
            return 0;
        else{
            imposto = imposto - rodoviario.getDesconto();
            return imposto;
        }
    }
}
