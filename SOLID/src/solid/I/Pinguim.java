package solid.I;

public class Pinguim implements Aves{

	@Override
	public String setLocalizacao(String longitude, String latitude) {
		return longitude+','+latitude;
		
	}

	@Override
	public void renderizar() {
		// TODO Auto-generated method stub	
	}
}
