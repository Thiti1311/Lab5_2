package Contribuintes;

public class Rodoviario {
	//Os descontos apresentados pelos Rodoviários são proporcionais aos quilômetros percorridos em um ano e equivalem a R$ 0,01 por quilômetro.

	    private float kmPercorridos;
	    private float desconto;

	    public Rodoviario(float kmPercorridos){
	        this.kmPercorridos = kmPercorridos;
	        desconto = (float) (0.01 * kmPercorridos);
	    }

	    public float getKmPercorridos() {
	        return kmPercorridos;
	    }

	    public void setKmPercorridos(float kmPercorridos) {
	        this.kmPercorridos = kmPercorridos;
	    }

	    public float getDesconto() {
	        return desconto;
	    }

	    public void setDesconto(float desconto) {
	        this.desconto = desconto;
	    }
	    
	}

