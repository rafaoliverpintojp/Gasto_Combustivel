import java.util.Collection;
import java.util.Date;

 


public interface IFachada {

	public Cliente cadastrarCliente(String nome, String endecero, String cpf, Date DataNascimento);
	public Veiculo cadastrarVeiculos(String placa, String modelo, String cor);
	public Float locarVeiculo(Cliente cliente, Veiculo Veiculo, Date inicio, Date fim);
	public Collection<Veiculo> listarVeiculosDisponiveis(Date inicial, Date fim);
	
	
	
}
