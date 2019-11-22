import java.util.Collection;
import java.util.Date;

public class FachadaLocadora implements IFachada{

	@Override
	public Cliente cadastrarCliente(String nome, String endecero, String cpf, Date DataNascimento) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Veiculo cadastrarVeiculos(String placa, String modelo, String cor) {
		// TODO Auto-generated method stub
		return null;
	}
	

	@Override
	public Float locarVeiculo(Cliente cliente, Veiculo Veiculo, Date inicio, Date fim) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Collection<Veiculo> listarVeiculosDisponiveis(Date inicial, Date fim) {
		// TODO Auto-generated method stub
		return null;
	}
	
	

	
}
