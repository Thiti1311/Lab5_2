package Contribuinte;

public class Caminhoneiro extends Contribuinte{


    private float toneladasTransportadas;
    private Rodoviario rodoviario;

    public Caminhoneiro(String nome, int numId, float toneladasTransportadas, float kmPercorridos) {
        super(nome, numId);
        this.rodoviario = new Rodoviario(kmPercorridos);
        this.toneladasTransportadas = toneladasTransportadas;
        setTipoContribuinte("Caminhoneiro");
        Tributos();
    }

    public float getToneladasTransportadas() {
        return toneladasTransportadas;
    }

    public void setToneladasTransportadas(float toneladasTransportadas) {
        this.toneladasTransportadas = toneladasTransportadas;
    }
    public float Tributos(){
        float imposto = 0;

        if(toneladasTransportadas <= 10){
            imposto = 500;
        }
        else{
            imposto = 500 + (toneladasTransportadas-10)*100;
        }

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
        return "Contribuinte: "+ getNome() + "\nTipo: Caminhoneiro\nId: " + getNumId() +
            "\nImpostos: " + getImposto() + "\nDesconto: " + getDesconto() + "\nTotal: "+
            getImpostoFinal()+"\n"; 
    }
}
