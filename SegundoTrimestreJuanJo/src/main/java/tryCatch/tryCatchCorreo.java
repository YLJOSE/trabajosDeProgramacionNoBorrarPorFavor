
package tryCatch;

import javax.swing.JOptionPane;

public class tryCatchCorreo {

	public static void main(String[] args) {
		String correo = JOptionPane.showInputDialog("introducir correo -e: ");
		try {
			compruebaCorreo(correo);
		} catch (LongCorreoerroneaException e) {
			e.printStackTrace();
		}
	}

	static void compruebaCorreo(String correo)throws LongCorreoerroneaException{
		int arroba = 0;
		boolean punto = false;

		if (correo.length() <= 3) {
			
			throw new LongCorreoerroneaException("Longitud del correo erroneo");

		}

		for (int i = 0; i < correo.length(); i++) {

			if (correo.charAt(i) == '@') {
				arroba++;

			}
			if (correo.charAt(i) == '.') {
				punto = true;

			}
		}
		if (arroba == 1 && punto == true) {
			System.out.println("correo electronico: " + correo + "CORRECTO");

		} else {
			System.out.println("correo electronico: " + correo + "INCORRECTO");
			throw new LongCorreoerroneaException("revisa la @ y los puntos");
		}
	}

}
class LongCorreoerroneaException extends RuntimeException {
	
public LongCorreoerroneaException() {
	
}
public LongCorreoerroneaException(String mensaje) {
	super(mensaje);
	
}
	
	
}