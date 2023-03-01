package View;

import Controller.Binario;

public class Principal {
	public static void main(String[] args) {
		Binario Bi = new Binario();
		
		int n = 9;
		
		String ImprimeBinario = Bi.ImprimeBinario(n);
		
		 System.out.println( ImprimeBinario  );
    }
}