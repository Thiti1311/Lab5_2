package Contribuintes;

public class Taxista extends Contribuinte{
	// Um Taxista tem associado o número de passageiros transportados em um ano e é tributado em relação a esse número (R$ 0,5 por passageiro).
	    private int numPassageirosAnuais;
	    private Rodoviario rodoviario;

	    public Taxista(String nome, int numId, int numPassageirosAnuais, float kmPercorridos) {
	        super(nome, numId);
	        this.rodoviario = new Rodoviario(kmPercorridos);
	        this.numPassageirosAnuais = numPassageirosAnuais;
	        setTipoContribuinte("Taxista");
	        tributos();
	    }

	    public int getNumPassageirosAnuais() {
	        return numPassageirosAnuais;
	    }

	    public void setNumPassageirosAnuais(int numPassageirosAnuais) {
	        this.numPassageirosAnuais = numPassageirosAnuais;
	    }
	    public float tributos(){
	        float imposto = 0;
	        
	        imposto = (float) (numPassageirosAnuais*0.5);

	        setImposto(imposto);
	        setDesconto(rodoviario.getDesconto());

	        if(rodoviario.getDesconto() >= imposto){
	            setImpostoFinal(0);
	            return 0;
	        }
	        else{
	            imposto = imposto - rodoviario.getDesconto();
	            setImpostoFinal(imposto);
	            return imposto;
	        }
	    }

	    @Override
	    public String toString() {
	        return "Contribuinte: "+ getNome() + "\nTipo: Taxista\nId: " + getNumId() +
	            "\nImpostos: " + getImposto() + "\nDesconto: " + getDesconto() + "\nTotal: "+
	            getImpostoFinal()+"\n"; 
	    }
	    
	}