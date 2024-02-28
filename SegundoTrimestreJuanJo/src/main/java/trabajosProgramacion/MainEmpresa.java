package trabajosProgramacion;

import java.util.ArrayList;
import java.util.Collections;

import javax.swing.JOptionPane;

public class MainEmpresa {
	static double totalSueldosEmpleado;
	static double totalSueldosBecario;
	static double totalSueldosJefe;

	public static void main(String[] args) {
		ArrayList<Empleado> listaEmpleados = new ArrayList<>();
		menu(listaEmpleados);
		printArrayList(listaEmpleados);
		printSueldosCategorias();

	}

	static void setEmpleados(ArrayList<Empleado> empleado, int tipo) {
		double sueldoNuevo;

		String nombre = JOptionPane.showInputDialog(null, "Ingrese el nombre:");
		String sueldo = JOptionPane.showInputDialog(null, "Ingrese el sueldo:");
		sueldoNuevo = Double.parseDouble(sueldo);
		if (tipo == 0) {
			Empleado e1 = new Empleado(nombre, sueldoNuevo);
			empleado.add(e1);
			totalSueldosEmpleado += sueldoNuevo;
		}
		if (tipo == 1) {
			String contrato = JOptionPane.showInputDialog(null, "Ingrese el contrato:");
			Becario b1 = new Becario(nombre, sueldoNuevo, contrato);
			empleado.add(b1);
			totalSueldosBecario += sueldoNuevo;
		}
		if (tipo == 2) {
			double primaNuevo;
			String prima = JOptionPane.showInputDialog(null, "Ingrese la prima:");
			primaNuevo = Double.parseDouble(prima);
			Jefe j1 = new Jefe(nombre, sueldoNuevo, primaNuevo);
			empleado.add(j1);
			totalSueldosJefe += sueldoNuevo;

		}
	}

	static void menu(ArrayList<Empleado> empleado) {
		int opcion;
		do {
			String menu[] = { "0. Ingresar un empleado", "1. Ingresar un becario", "2. Ingresar un jefe", "3. Salir" };
			opcion = JOptionPane.showOptionDialog(null, "selecciona lo que deseas realizar", null, 0, 0, null, menu,
					menu);
			switch (opcion) {
			case 0:
				setEmpleados(empleado, 0);
				break;
			case 1:
				setEmpleados(empleado, 1);
				break;
			case 2:
				setEmpleados(empleado, 2);
				break;
			default:
				System.out.println("Saliendo del programa");

			}
		} while (opcion != 3);
	}

	static void printArrayList(ArrayList<Empleado> empleado) {
		empleado.forEach(empleados -> System.out.println(empleados.toString()));
	}

	static void printSueldosCategorias() {
		System.out.println("\nTotal de sueldos de empleados: " + totalSueldosEmpleado);
		System.out.println("Total de sueldos de becarios: " + totalSueldosBecario);
		System.out.println("Total de sueldos de jefes: " + totalSueldosJefe);
	}

}
