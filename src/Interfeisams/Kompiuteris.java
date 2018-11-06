package Interfeisams;


public class Kompiuteris implements USB{

	public void isijungti () {
		System.out.println("isijungiuau");
	}

	@Override
	public void plugUsb() {
		System.out.println("Usb ikistas i kompiuteri.");

	}

	@Override
	public void unplugUsb() {
		
		System.out.println("Usb isimtas is kompiuterio.");
	}


}
