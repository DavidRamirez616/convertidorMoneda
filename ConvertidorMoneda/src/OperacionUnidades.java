import javax.swing.JOptionPane;

public class OperacionUnidades {
	
	public OperacionUnidades () {
		
		String opcion = (String) JOptionPane.showInputDialog(null, "Seleccione una opcion", "MENU",
				JOptionPane.PLAIN_MESSAGE, null,
				new Object[] { "kilo a Onzas", "Kilo a Libras", "Kilo a Gramos",
						"Kilo a Quilates", "Onzas a Kilo", "Libras a Kilo", "Gramos a Kilo",
						"Quilates a Kilo" },
				"option1");
		
		double conver = 0;
		double onza = 35.273962, libra = 2.20462262, gramo = 1000 , quilate = 5000 ;
		double kiloO = 0.02834952 , kiloL = 0.45359237, kiloG = 0.001, kiloQ = 0.0002;
		double resultado;
		
		try {
		
			switch (opcion) {
	
			case "kilo a Onzas":
				// de Kilo a diferentes pesos
				conver = Integer.parseInt(
						JOptionPane.showInputDialog(null, "Ingrese cuantos kilos convertira a onzas"));
				resultado = conver * onza;
				JOptionPane.showMessageDialog(null, "su total de onzas es de: " + resultado);
				break;
			case "Kilo a Libras":
				conver = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese cuantos kilos convertira a Libras"));
				resultado = conver * libra;
				JOptionPane.showMessageDialog(null, "su total de Libras es de: " + resultado);
				break;
			case "Kilo a Gramos":
				conver = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese cuantos kilos convertira a Gramos"));
				resultado = conver * gramo;
				JOptionPane.showMessageDialog(null, "su total de Gramos es de: " + resultado);
				break;
			case "Kilo a Quilates":
				conver = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese cuantos kilos convertira a Quilates"));
				resultado = conver * quilate;
				JOptionPane.showMessageDialog(null, "su total de Quilates es de: " + resultado);
				break;
			
	
			// diferentes Pesos a Kilos 
			case "Onzas a Kilo":
				conver = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese cuantas Onzas convertira a kilos"));
				resultado = conver * kiloO;
				JOptionPane.showMessageDialog(null, "su total de kilos es de: " + resultado);
				break;
			case "Libras a Kilo":
				conver = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese cuantas Libras convertira a kilos"));
				resultado = conver * kiloL;
				JOptionPane.showMessageDialog(null, "su total de kilos es de: " + resultado);
				break;
			case "Gramos a Kilo":
				conver = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese cuantos Gramos convertira a kilos"));
				resultado = conver * kiloG;
				JOptionPane.showMessageDialog(null, "su total de kilos es de: " + resultado);
				break;
			case "Quilates a Kilo":
				conver = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese cuantos Quilates convertira a kilos"));
				resultado = conver * kiloQ;
				JOptionPane.showMessageDialog(null, "su total de kilos es de: " + resultado);
				break;
			
			}
		}
		catch (NumberFormatException e) {
			JOptionPane.showMessageDialog(null, "Caracter no valido");
		}
		new Mensaje().MensajeContinuar();
	}
}
