package ed.ito;

import javax.swing.JOptionPane;

public class MyApp {

	public static void main(String[] args) throws ExcepcionDeListaLlena, ExcepcionDeListaVacia {
		ListaEstatica<Integer> l = new ListaEstatica<>(20);
		int a, b = 0;
		do {
			a = Integer.parseInt(
					JOptionPane.showInputDialog("ESCOGA UNA DE LAS SIGUIENTES OPCIONES: \n" 
							+ "1.-Ingresar un nuevo numero. \n"
							+ "2.-Mostrar el primero de la lista. \n" + "3.-Mostrar el ultimo elemento de la lista. \n"
							+ "4.-Cantidad de elementos contenidos en la lista. \n"
							+ "5.-Elimine el primer elemento de la lista. \n"
							+ "6.-Elimine el ultimo elemento de la lista. \n" + "7.-Salir."));

			switch (a) {
			case 1:
				b = Integer.parseInt(JOptionPane.showInputDialog("Numero a ingresar: "));
				l.add(b);
				JOptionPane.showMessageDialog(null,"¡El elemento se ha guardado con exito! \n");
				break;
			case 2:
				JOptionPane.showMessageDialog(null,"Primer elemento de la lista: " + l.first());
				break;
			case 3:
				JOptionPane.showMessageDialog(null,"Ultimo elemento de la lista: " + l.last());
				break;
			case 4:
				JOptionPane.showMessageDialog(null,"Cantidad de elemento contenidos: " + l.size());
				break;
			case 5:
				JOptionPane.showMessageDialog(null,"¡El primer elemento de la lista fue eliminado!");
				l.deleteFirst();
				break;
			case 6:
				JOptionPane.showMessageDialog(null,"¡El ultimo elemento de la lista fue eliminado!");
				l.deleteLast();
				break;
			case 7:
				JOptionPane.showMessageDialog(null, "Salida");

				break;
			default:
				JOptionPane.showMessageDialog(null, "La opcion que has ingresado es invalida");
				break;

			}
		} while (a != 7);
	}

}