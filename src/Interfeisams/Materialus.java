package Interfeisams;

public interface Materialus {

	public void kristi();
	public void atsitrenkti();
	
	public static void statinis_materialus() {
		System.out.println("Materialus statinis");
	}
	
	public default void default_materialus() {
		System.out.println("Materialus default");
	}
	
}
