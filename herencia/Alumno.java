package herencia;

import javax.swing.JOptionPane;

public class Alumno extends persona{
public String matricula;
	
	
public String getMatricula() {
	return matricula;
}


public void setMatricula(String matricula) {
	this.matricula = matricula;
}


public Alumno(String nombre, String apellido, String nacionalidad) {
	super(nombre, apellido, nacionalidad);
}

public void MostrarDatos() {
	JOptionPane.showMessageDialog(null, "Alumno: " + getNombre()+" "+getApellido() + " " + getNacionalidad() + " "+ getMatricula());
}

	
}
