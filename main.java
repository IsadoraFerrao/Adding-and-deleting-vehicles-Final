
public class main implements funcoes{

	ArrayList <Veiculo> lista = new ArrayList();

	public void addVeiculo(Veiculo novo_veiculo){
		if(novo_veiculo.getVeiculo() != null){
			lista.add(novo_veiculo);
		}
	}

	public Veiculo getVeiculo(String placa){
		
		for(Veiculo busca : lista){
			if(busca.getPlaca().trim().equalsIgnoreCase(placa)){
				return busca;
			}
		}
		return null;
	}

	public void delVeiculo(Veiculo del_veiculo){
		lista.remove(del_veiculo);
	}
	
	public static void main(String[] args){
		
		Carro c1 = new Carro("ITL-9642", 2016);
		Carro c1 = new Carro("IGM-6410", 2014);

		Onibus o1 = new Onibus("IAD-1241", 1973);

		c1.setN_portas(4);

		c2.setKm_litro(15.5);

		o1.setCategoria("executivo");

		//ADD
		addVeiculo(c1);

		//Busca veiculo c1
		getVeiculo("ITL-9642");

		//Deleta veiculo c1
		delVeiculo(getVeiculo("ITL-9642"));
	}
}