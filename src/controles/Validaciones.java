package controles;

/**
 * Clase que contiene las validaciones necesarias para todos los inputs.
 */

public class Validaciones {

	public static boolean formatoPatenteOk(String cadena) {
		boolean formato = false;
		if (cadena.length() == 6) {
			if (Character.isLetter(cadena.charAt(0)))
				if (Character.isLetter(cadena.charAt(1)))
					if (Character.isLetter(cadena.charAt(2)))
						if (Character.isDigit(cadena.charAt(3)))
							if (Character.isDigit(cadena.charAt(4)))
								if (Character.isDigit(cadena.charAt(5)))
									formato = true;
		}
		return (formato);
	}

	public static boolean esNumeroMayorCero(String cadena) {
		cadena = cadena.trim();
		try {
			Integer.parseUnsignedInt(cadena);
			return true;
		} catch (NumberFormatException nfe) {
			return false;
		}
	}

	public static boolean esNumero(String cadena) {
		cadena = cadena.trim();
		try {
			Double.parseDouble(cadena);
			return true;
		} catch (NumberFormatException nfe) {
			return false;
		}
	}

	public static boolean noSonLetras(String cadena) {
		int i = 0;
		for (i = 0; i < cadena.length(); i++)
			if (Character.isDigit(cadena.charAt(i))) {
				return true;
			}
		return false;
	}

	public static boolean esReal(String cadena) {
		boolean retorna = false;
		cadena = cadena.trim();
		try {
			Float.parseFloat(cadena);
			retorna = true;
		} catch (NumberFormatException nfe) {
			retorna = false;
		}
		return retorna;
	}
}
