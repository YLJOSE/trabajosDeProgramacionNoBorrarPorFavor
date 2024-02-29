package variableStatic;

import java.util.ArrayList;

public class empleadoMain {
	public static void main(String[] args) {
		ArrayList<empleado> empleados = new ArrayList<>();

		empleado e1 = new empleado("carlos", 1700, 2003, 10, 8, 12);
		empleado e2 = new empleado("trex", 2000, 2004, 10, 8, 6);
		empleado e3 = new empleado("luis", 3000, 2001, 10, 9, 1);
		empleado e4 = new empleado("leandro", 5000, 2005, 10, 10, 1);
		jefatura j1 = new jefatura("pedro", 1500, 2003, 10, 15, 1, 2000);

		empleado empleadoN[] = new empleado[5];
		empleadoN[0] = e1;
		empleadoN[1] = e2;
		empleadoN[2] = e3;
		empleadoN[3] = e4;
		empleadoN[4] = j1;

		j1.setInsentivo(50000);

		empleados.add(e1);
		empleados.add(e2);
		empleados.add(e3);
		empleados.add(e4);
		empleados.add(j1);

//		if (j1 instanceof jefatura) {
//			System.out.println("Jefatura :" + j1);
//		} else if (j1 instanceof empleado) {
//			System.out.println("Empleado :" + j1);
//
//		}
		/**********************************************************************************/
		empleados.forEach(empleadoFor -> System.out.println(empleadoFor.toString()));
		/**********************************************************************************/
		System.out.println(j1.getNombre() + j1.tomarDecision("dar mas dias de vacaciones"));
		System.out.println("el jefe: " + j1.getNombre() + " el bonus de : " + j1.establecerBonus(500));
		System.out.println("el empleado: " + e2.getNombre() + " el bonus de : " + e2.establecerBonus(1000));
	}

}
