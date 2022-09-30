package solid.I;

public class Main {

	public static void main(String[] args) {
		Papagaio papagaio = new Papagaio();
		Pinguim pinguim = new Pinguim();
		
		System.out.println(papagaio.setAltitude("300"));
		System.out.println(papagaio.setLocalizacao("41.4015", "18.00000"));

		System.out.println(pinguim.setLocalizacao("41.56565", "18.454545"));
		

	}

}
