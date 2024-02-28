package trabajosProgramacion;

import java.util.Date;

public class CAlumnoMain1 {
	public static void main(String[] args) {
		
	}
	static void setObject() {
		
		CProfesor p1=  new CProfesor ("Manuel", "Santana",1980,01,01,4567,1000,"Informatica");
		CProfesor p2=  new CProfesor ("Carolina", "Ruiz",1981,02,02,4567,2000,"Informatica");
		CProfesor p3=  new CProfesor ("Javier", "Rodriguez",1982,03,03,4567,3000,"CiberSeguridad");
		
		CAsignatura a1 = new CAsignatura(11,"JAVA",p1,8);
		CAsignatura a2 = new CAsignatura(22,"MARCAS",p2,4);
		CAsignatura a3 = new CAsignatura(33,"ENTORNOS",p3,3);
		CAlumno al1= new CAlumno("Pedro","Santana",2001,12,03,1234,a1,0);
	}

}
