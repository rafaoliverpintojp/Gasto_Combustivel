package projeto.professor.negocio;

public class FachadaHotelLiberty implements IFachada{
	private RepositorioHotel repositorioHotel;
	private RepositorioQuarto repositorioQuarto;
	
	@Override
	public Hotel cadastrarHotel(String nome, String endereco, EnumClasseHotel classeHotel) {
		IFabricaClasse fabricaClasse = null;
		
		if(classeHotel.equals(EnumClasseHotel.BUDGET)) {
			fabricaClasse = new FabricaClasseBuget();
		}else if (classeHotel.equals(EnumClasseHotel.APART)){
			fabricaClasse = new FabricaClasseApart();		
		}else if (classeHotel.equals(EnumClasseHotel.CLASSIC)) {
			fabricaClasse = new FabricaClasseClassic();
		}
		
		Hotel hotel = fabricaClasse.criarHotel(nome, endereco);
		repositorioHotel.criarHotel(hotel);
		return hotel;
	}

	@Override
	public Quarto cadastrarQuarto(Integer numero, Integer limHospedes, Boolean ehFumante, Double valor, String descricao,
			EnumTipoQuarto tipoQuarto) {
		IFabricaClasse fabricaClasse = null;
		
		if(tipoQuarto.equals(EnumClasseHotel.BUDGET)) {
			fabricaClasse = new FabricaClasseBuget();
		}else if (tipoQuarto.equals(EnumClasseHotel.APART)){
			fabricaClasse = new FabricaClasseApart();		
		}else if (tipoQuarto.equals(EnumClasseHotel.CLASSIC)) {
			fabricaClasse = new FabricaClasseClassic();
		}
		
		Quarto quarto = fabricaClasse.criarQuarto(numero, limHospedes,ehFumante, valor, descricao, tipoQuarto);
		repositorioQuarto.criarQuarto(quarto);
		return quarto;		
	}


}
