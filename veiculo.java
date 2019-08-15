
public abstract class veiculo{
	
	protected String placa;
	protected int ano;

	veiculo(String placa, int ano){
		this.placa = placa;
		this.ano = ano;
	}

	public String getPlaca(){
		return placa;
	}

	public void setPlaca(String placa){
		this.placa = placa;
	}


	public int getAno(){
		return ano;
	}

	public void setAno(int ano){
		this.ano = ano;
	}
}

