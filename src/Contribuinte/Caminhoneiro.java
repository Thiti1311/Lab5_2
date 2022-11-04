package Contribuinte;

public class Caminhoneiro extends Contribuinte{

    private int toneladasTransportadas;
    private Rodoviario rodoviario;

    public Caminhoneiro(String nome, int numId, String tipoBem, float preco, int toneladasTransportadas, float kmPercorridos) {
        super(nome, numId, tipoBem, preco);
        this.rodoviario = new Rodoviario(kmPercorridos);
        this.toneladasTransportadas = toneladasTransportadas;
    }

    public int getToneladasTransportadas() {
        return toneladasTransportadas;
    }

    public void setToneladasTransportadas(int toneladasTransportadas) {
        this.toneladasTransportadas = toneladasTransportadas;
    }
    public float Tributos(){
        float imposto = 0;

        if(rodoviario.getDesconto() >= imposto)
            return 0;
        else{
            if(toneladasTransportadas >= 10){
                imposto = 500;
            }
            else{
                imposto = 500 + (toneladasTransportadas-10)*100;
            }
        }
        return imposto;
    }
}
