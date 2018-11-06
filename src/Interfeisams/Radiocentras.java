package Interfeisams;


public class Radiocentras implements USB {

	@Override
	public void plugUsb() {
		System.out.println("USB ikistas i radiocentra!");
	}

	@Override
	public void unplugUsb() {
		System.out.println("USB isimtas is radiocentro!");
		
	}
	
	public void groti() {
		System.out.println("Groju!");
	}

}
