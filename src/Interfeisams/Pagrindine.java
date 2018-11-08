package Interfeisams;

public class Pagrindine {

	public static void main(String[] args) {

		/*		
		USB usb1 = new Kompiuteris();
		usb1.plugUsb();
		usb1.unplugUsb();

		Kompiuteris komp1 = (Kompiuteris) usb1;
		komp1.isijungti();
		
		USB usb2 = new Radiocentras();
		usb2.plugUsb();
		usb2.unplugUsb();

		Radiocentras rc = (Radiocentras) usb2;
		rc.groti();
		*/

		Kompiuteris k = new Kompiuteris();
		k.plugUsb();
		
		Radiocentras r = new Radiocentras();
		r.plugUsb();
		
		Object[] masyvas = {k,r};		
		
		for (Object o: masyvas) {
			USB objektoUSB =  (USB) o;
			objektoUSB.unplugUsb();
		}
			
		
		//((Kompiuteris) usb1).isijungti();
		
		
		//----------------------------------------
		Duztantis st_duztanti = new Stikline();
		((Stikline) st_duztanti).default_materialus();
		st_duztanti.default_materialus();
		

	}

}
