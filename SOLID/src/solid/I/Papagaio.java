package solid.I;

public class Papagaio implements AvesVoam{

	@Override
	public String setLocalizacao(String longitude, String latitude) {
		return longitude+','+latitude;
	}

	@Override
	public void renderizar() {
		// TODO Auto-generated method stub	
	}

	@Override
	public String setAltitude(String altitude) {
		return altitude;
	}
}
