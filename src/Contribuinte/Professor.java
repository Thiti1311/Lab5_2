package Contribuinte;

public class Professor extends Contribuinte{

    private final float salarioMinimo = 1212;

    private float numSalarios;
    private float gastosMaterialDidatico;

    public Professor(String nome, int numId, float numSalarios, float gastosMaterialDidatico) {
        super(nome, numId);
        this.numSalarios = numSalarios;
        this.gastosMaterialDidatico = gastosMaterialDidatico;
        setTipoContribuinte("Professor");
        Tributos();
    }

    public float getNumSalarios() {
        return numSalarios;
    }

    public void setNumSalarios(float numSalarios) {
        this.numSalarios = numSalarios;
    }
    
    public float Tributos(){
        float imposto = 0;

        if(numSalarios <= 1)
            imposto = (float) 0.05 * salarioMinimo;
        else if(numSalarios <= 5 && numSalarios > 1)
            imposto = (float) 0.1 * salarioMinimo;
        else
            imposto = (float) 0.2 * salarioMinimo;

        setImposto(imposto);
        setDesconto(gastosMaterialDidatico/2);

        if(gastosMaterialDidatico/2 >= imposto){
            setImpostoFinal(0);
            return 0;
        }
        else{
            imposto = imposto - (gastosMaterialDidatico/2);
            setImpostoFinal(imposto);
            return imposto;
        }
    }
    @Override
    public String toString() {
        return "Contribuinte: "+ getNome() + "\nTipo: Professor\nId: " + getNumId() +
            "\nImpostos: " + getImposto() + "\nDesconto: " + getDesconto() + "\nTotal: "+
            getImpostoFinal()+"\n"; 
    }
}
