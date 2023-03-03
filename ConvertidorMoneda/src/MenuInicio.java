import javax.swing.JOptionPane;

public class MenuInicio {
	public static void main(String[] args) {

		String opcion = (String) JOptionPane.showInputDialog(null, "Seleccione una opcion", "MENU",
				JOptionPane.PLAIN_MESSAGE, null, new Object[] { "Convertidor de Divisa", "Convertidor de Unidades Masa" },
				null);

		switch (opcion) {
		case "Convertidor de Divisa":
			OperacionesDivisas divisa = new OperacionesDivisas();
			break;
		case "Convertidor de Unidades":
			OperacionUnidades Unidades = new OperacionUnidades();
			break;

		}

	}
}
