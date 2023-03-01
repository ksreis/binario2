package Controller;

public class Binario {
		public Binario() {
			super();
		}
					
		public String ImprimeBinario(int n) {
			    if (n == 0) {
			     return "";
			    }
			    else {
			        int resto = n % 2;
			       n = n / 2;
			       
			    	 return ImprimeBinario (n) + resto;
			}
		}
}
	

		