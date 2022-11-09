package Contribuintes;

public class Medico extends Contribuinte{

    private int numPacientes;
    private float despesasCongresso;

    public Medico(String nome, int numId, int numPacientes, float despesasCongresso) {
        super(nome, numId);
        this.numPacientes = numPacientes;
        this.despesasCongresso = despesasCongresso;
        setTipoContribuinte("Medico");
        tributos();
    }

    public int getNumPacientes() {
        return numPacientes;
    }

    public void setNumPacientes(int numPacientes) {
        this.numPacientes = numPacientes;
    }

    public float getDespesasCongresso() {
        return despesasCongresso;
    }

    public void setDespesasCongresso(float despesasCongresso) {
        this.despesasCongresso = despesasCongresso;
    }
    
    public float tributos(){
        float imposto = 0;

        imposto = numPacientes * 10;

        setImposto(imposto);
        setDesconto(despesasCongresso);

        if(despesasCongresso >= imposto){
            setImpostoFinal(0);
            return 0;
        }
        else{
            imposto = imposto - despesasCongresso;
            setImpostoFinal(imposto);
            return imposto;
        }
    }
    @Override
    public String toString() {
        return "Contribuinte: "+ getNome() + "\nTipo: Medico\nId: " + getNumId() +
            "\nImpostos: " + getImposto() + "\nDesconto: " + getDesconto() + "\nTotal: "+
            getImpostoFinal()+"\n"; 
    }
}