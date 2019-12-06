package exercicioPackage;

import java.util.Collection;
import java.util.Date;

import hotel.Cliente;

public interface IFachada {
	public Cliente cadastratCliente(String nome, String endereco, String cpf, Date dataNascimento);
	public Veiculo cadastrarVeiculo(String placa, String modelo, String cor);
	public Float locarVeiculo(Cliente cliente, Veiculo veiculo, Date inicio, Date fim);
	public Collection<Veiculo> listarVeiculosDisoniveis(Date inicio, Date fim);
}
