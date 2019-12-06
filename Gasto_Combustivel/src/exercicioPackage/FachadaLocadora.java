package exercicioPackage;

import java.util.Collection;
import java.util.Date;

import hotel.Cliente;

public class FachadaLocadora implements IFachada {
	private RepositorioCliente repositorioCliente;
	private RepositorioVeiculo repositorioVeiculo;
	
	@Override
	public Cliente cadastratCliente(String nome, String endereco, String cpf, Date dataNascimento) {
		Cliente cliente = new Cliente();
		repositorioCliente.cadastrarCliente(cliente);
		return cliente;
	}

	@Override
	public Veiculo cadastrarVeiculo(String placa, String modelo, String cor) {
		Veiculo veiculo = new Veiculo();
		repositorioVeiculo.cadastrarVeiculo(veiculo);
		return veiculo;
	}

	@Override
	public Float locarVeiculo(Cliente cliente, Veiculo veiculo, Date inicio, Date fim) {
		return null;
	}

	@Override
	public Collection<Veiculo> listarVeiculosDisoniveis(Date inicio, Date fim) {
		return null;
	}

}
