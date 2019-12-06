package projeto.professor.negocio;

public class FabricaClasseClassic implements IFabricaClasse{

	@Override
	public Hotel criarHotel(String nome, String endereco) {
		return new HotelClassic(nome, endereco);
	}

	@Override
	public Quarto criarQuarto(Integer numero, Integer limHospedes, Boolean ehFumante, Double valor, String descricao,
			EnumTipoQuarto tipoQuarto) {
		return new QuartoClassic(numero, limHospedes, ehFumante, valor, descricao, tipoQuarto);
	}

}
