import javax.swing.JOptionPane;

public class OperacionesDivisas {

	public OperacionesDivisas() {

		String opcion = (String) JOptionPane.showInputDialog(null, "Seleccione una opcion", "MENU",
				JOptionPane.PLAIN_MESSAGE, null,
				new Object[] { "Peso MXN a Dolar", "Peso MXN a Euro", "Peso MXN a Libras Esterlinas", "Peso MXN a Yen",
						"Peso MXN a Won", "Dolar a Peso MXN", "Euro a Peso MXN", "Libras Esterlinas a Peso MXN",
						"Yen a Peso MXN", "Won a Peso MXN", },
				"option1");

		double conver = 0.0;
		double dolar = 0.055, euro = 0.052, libra = 0.046, yen = 7.55, won = 72.39;
		double pesoD = 18.13, pesoE = 19.21, pesoL = 21.65, pesoY = 0.1325, pesoW = 0.014;
		double resultado = 0;
		
		try {
		
			switch (opcion) {
	
			case "Peso MXN a Dolar":
				// de pesos MXN a diferentes monedas
				conver = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese cuantos pesos MXN quiere convertir A Dolares"));
				
				resultado = conver * dolar;
				JOptionPane.showMessageDialog(null, "su total es de: " + resultado + " Dolares");
				break;
			case "Peso MXN a Euro":
				conver = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese cuantos pesos MXN quiere convertir A Euros"));
				resultado = conver * euro;
				JOptionPane.showMessageDialog(null, "su total es de: " + resultado + " Euros");
				break;
			case "Peso MXN a Libras Esterlinas":
				conver = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese cuantos pesos MXN quiere convertir A Libras"));
				resultado = conver * libra;
				JOptionPane.showMessageDialog(null, "su total es de: " + resultado + " Libras");
				break;
			case "Peso MXN a Yen":
				conver = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese cuantos pesos MXN quiere convertir A Yenes"));
				resultado = conver * yen;
				JOptionPane.showMessageDialog(null, "su total es de: " + resultado + " Yenes");
				break;
			case "Peso MXN a Won":
				conver = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese cuantos pesos MXN quiere convertir A Wones"));
				resultado = conver * won;
				JOptionPane.showMessageDialog(null, "su total es de: " + resultado + " Wones");
				break;
	
			// diferentes modenas a pesos MXN
			case "Dolar a Peso MXN":
				conver = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese cuantos Dolares quiere convertir A pesos MXN"));
				resultado = conver * pesoD;
				JOptionPane.showMessageDialog(null, "su total es de: " + resultado + " Pesos MXN");
				break;
			case "Euro a Peso MXN":
				conver = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese cuantos Euros quiere convertir A pesos MXN"));
				resultado = conver * pesoE;
				JOptionPane.showMessageDialog(null, "su total es de: " + resultado + " Pesos MXN");
				break;
			case "Libras Esterlinas a Peso MXN":
				conver = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese cuantos Libras quiere convertir A pesos MXN"));
				resultado = conver * pesoL;
				JOptionPane.showMessageDialog(null, "su total es de: " + resultado + " Pesos MXN");
				break;
			case "Yen a Peso MXN":
				conver = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese cuantos Yenes quiere convertir A pesos MXN"));
				resultado = conver * pesoY;
				JOptionPane.showMessageDialog(null, "su total es de: " + resultado + " Pesos MXN");
				break;
			case "Won a Peso MXN":
				conver = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese cuantos Wones quiere convertir A pesos MXN"));
				resultado = conver * pesoW;
				JOptionPane.showMessageDialog(null, "su total es de: " + resultado + " Pesos MXN");
				break;
			}
		
		}
		catch (NumberFormatException e) {
			JOptionPane.showMessageDialog(null, "Caracter no valido");
		}
		
		 new Mensaje().MensajeContinuar();
		 
	}

}
