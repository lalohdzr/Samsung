package samsung;

public class Operacion {
	int kgsRopa,tipoRopa,llenado,lavado,secado;
	
	public Operacion(int KgsRopa, int tipoRopa) {
		this.kgsRopa = KgsRopa;
		this.tipoRopa = tipoRopa;
	}
	
	private void Llenado(){
		if (kgsRopa <= 20) {
			llenado = 1;
			System.out.println("llenando... ");
			System.out.println("llenando completo ");
		}
	}
	
	private void Lavado() {
		Llenado();
		if(llenado == 1) {
			if(tipoRopa == 1) {
				System.out.println("Ropa Blanca / Lavado suave ");
				System.out.println("Lavando ");
				lavado = 1;
			} else if (tipoRopa == 2) {
				System.out.println("Ropa Color / lavado intenso ");
				System.out.println("Lavando ");
				lavado = 1;
			} else {
				System.out.println("El tipo de ropa no esta disponible  ");
				System.out.println("Se lavara como ropa de color / Lavado intenso ");
				lavado = 1;
			}
		}
	}
	
	private void Secado() {
		Lavado();
		if (lavado == 1) {
			System.out.println("Secando ");
			secado  = 1;
		}
		
	}
	public void CicloFinalizado() {
		Secado();
		if (secado == 1) {
			System.out.println("Su ropa esta lista.... ");
		}
	}

}
