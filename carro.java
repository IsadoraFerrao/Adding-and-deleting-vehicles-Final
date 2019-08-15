

public class carro extends Veiculo{
	
	private int n_portas;
	private float km_litro;

	public carro(String placa, int ano){
		super(placa, ano);
	} 

	public int getN_portas(){
		return n_portas;
	}

	public void setN_portas(int n_portas){
		this.n_portas = n_portas;
	}

	public float getKm_litro(){
		return km_litro;
	}

	public void setKm_litro(float km_litro){
		this.km_litro;
	}
}