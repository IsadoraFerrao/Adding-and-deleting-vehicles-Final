

public class Onibus extends veiculo{
	
	private String categoria;


	veiculo(String placa, int ano){
		super(placa, ano);
	}

	public String getCategoria(){
		return categoria;
	}

	public void setCategoria(String categoria){
		this.categoria = categoria;
	}
}