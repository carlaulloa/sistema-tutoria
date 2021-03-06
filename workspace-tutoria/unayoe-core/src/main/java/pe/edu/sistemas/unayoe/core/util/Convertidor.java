package pe.edu.sistemas.unayoe.core.util;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

// TODO: Auto-generated Javadoc
/**
 * The Class Convertidor.
 */
public class Convertidor {

	/**
	 * Convertir fecha A periodo.
	 *
	 * @param mes the mes
	 * @return the string
	 */
	public String convertirFechaAPeriodo(String mes) {
		int mesPeriod = Integer.parseInt(mes);
		String periodo = null;

		if (mesPeriod < 7 && mesPeriod > 3) {
			periodo = "1";

		}

		if (mesPeriod > 7) {
			periodo = "2";

		}

		if (mesPeriod <= 3 && mesPeriod >= 1) {
			periodo = "0";

		}

		return periodo;

	}

	/**
	 * Convertir dia.
	 *
	 * @param dia the dia
	 * @return the string
	 */
	public String convertirDia(Date dia) {

		int diaElegido = FormateadorFecha.getDayOfTheWeek(dia);
		String diaConsulta = null;
		if (diaElegido == 1) {
			diaConsulta = "DOMINGO";

		}
		if (diaElegido == 2) {
			diaConsulta = "LUNES";

		}

		if (diaElegido == 3) {
			diaConsulta = "MARTES";

		}
		if (diaElegido == 4) {
			diaConsulta = "MIERCOLES";

		}
		if (diaElegido == 5) {
			diaConsulta = "JUEVES";

		}
		if (diaElegido == 6) {
			diaConsulta = "VIERNES";

		}
		if (diaElegido == 7) {
			diaConsulta = "SABADO";

		}

		return diaConsulta;

	}

	/**
	 * Convertir fecha en hora.
	 *
	 * @param d the d
	 * @return the string
	 */
	public String convertirFechaEnHora(Date d) {

		DateFormat hourFormat = new SimpleDateFormat("HH:mm:ss");
		return hourFormat.format(d);

	}
	
	/**
	 * Formato numero.
	 *
	 * @param numero Numero que se desea formatear long
	 * @param nroDig Cantidad de digitos del numero
	 * @return the string
	 */
	public static String formatoNumero(long numero,int nroDig ){
		String num = String.valueOf(numero);
		String numFormat = "";
		if(numero>0 && num.length()<nroDig){
			for(int i = 0;i<nroDig-num.length();i++)numFormat+="0";
			numFormat+=num;
		}else{
			numFormat = num;
		}
		return numFormat;
	}

}
