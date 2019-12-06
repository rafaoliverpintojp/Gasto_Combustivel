package projeto.professor.negocio;

public class FabricaClasseBuget implements IFabricaClasse{

	@Override
	public Hotel criarHotel(String nome, String endereco) {
		// TODO Auto-generated method stub
		return new HotelBudget(nome, endereco);
	}

	@Override
	public Quarto criarQuarto(Integer numero, Integer limHospedes, Boolean ehFumante, Double valor, String descricao,
			EnumTipoQuarto tipoQuarto) {
		return new QuartoBudget(numero, limHospedes, ehFumante, valor, descricao, tipoQuarto);
	}

}
